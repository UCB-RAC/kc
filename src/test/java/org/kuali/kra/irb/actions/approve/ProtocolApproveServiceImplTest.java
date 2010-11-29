/*
 * Copyright 2005-2010 The Kuali Foundation
 * 
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kra.irb.actions.approve;

import java.sql.Date;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kuali.kra.infrastructure.Constants;
import org.kuali.kra.infrastructure.KraServiceLocator;
import org.kuali.kra.irb.Protocol;
import org.kuali.kra.irb.ProtocolDocument;
import org.kuali.kra.irb.actions.ProtocolAction;
import org.kuali.kra.irb.actions.ProtocolStatus;
import org.kuali.kra.irb.actions.correspondence.ProtocolActionCorrespondenceGenerationService;
import org.kuali.kra.irb.actions.submit.ProtocolActionService;
import org.kuali.kra.irb.actions.submit.ProtocolSubmission;
import org.kuali.kra.irb.actions.submit.ProtocolSubmissionStatus;
import org.kuali.kra.irb.onlinereview.ProtocolOnlineReviewService;
import org.kuali.kra.irb.test.ProtocolFactory;
import org.kuali.kra.test.infrastructure.KcUnitTestBase;
import org.kuali.rice.kns.service.DocumentService;
import org.kuali.rice.kns.service.ParameterService;
import org.kuali.rice.kns.util.DateUtils;

public class ProtocolApproveServiceImplTest extends KcUnitTestBase {
    
    private static final Date ACTION_DATE = new Date(System.currentTimeMillis());
    private static final String COMMENTS = "some comments go here";
    private static final Date APPROVAL_DATE = DateUtils.convertToSqlDate(DateUtils.addWeeks(ACTION_DATE, -1));
    private static final Date EXPIRATION_DATE = DateUtils.convertToSqlDate(DateUtils.addYears(ACTION_DATE, 1));
    
    private static final String PROTOCOL_TYPE_EXEMPT = "4";
    
    private ProtocolApproveServiceImpl service;

    private Mockery context = new JUnit4Mockery() {{
        setImposteriser(ClassImposteriser.INSTANCE);
    }};
           
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();

        service = new ProtocolApproveServiceImpl();
        service.setProtocolActionService(KraServiceLocator.getService(ProtocolActionService.class));
        service.setParameterService(getMockParameterService());
        service.setProtocolActionCorrespondenceGenerationService(getMockActionCorrespondenceGenerationService());
        service.setProtocolOnlineReviewService(getMockOnlineReviewService());
        service.setDocumentService(KraServiceLocator.getService(DocumentService.class));
    }

    @Override
    @After
    public void tearDown() throws Exception {
        service = null;
        
        super.tearDown();
    }

    @Test
    public void testFullApproval() throws Exception{
        ProtocolDocument protocolDocument = ProtocolFactory.createProtocolDocument();
        
        service.grantFullApproval(protocolDocument.getProtocol(), getMockProtocolApproveBean());
        
        verifyPersistStatusAction(protocolDocument.getProtocol());
    }
    
    @Test
    public void testExpeditedApproval() throws Exception {
        ProtocolDocument protocolDocument = ProtocolFactory.createProtocolDocument();

        service.grantExpeditedApproval(protocolDocument.getProtocol(), getMockProtocolApproveBean());
    
        verifyPersistStatusAction(protocolDocument.getProtocol());
    }
    
    @Test
    public void testResponseApproval() throws Exception {
        ProtocolDocument protocolDocument = ProtocolFactory.createProtocolDocument();
        
        service.grantResponseApproval(protocolDocument.getProtocol(), getMockProtocolApproveBean());
    
        verifyPersistStatusAction(protocolDocument.getProtocol());
    }
    
    private void verifyPersistStatusAction(Protocol protocol) {
        assertEquals(ProtocolStatus.ACTIVE_OPEN_TO_ENROLLMENT, protocol.getProtocolStatusCode());
        
        assertTrue(!protocol.getProtocolActions().isEmpty());
        ProtocolAction action = protocol.getLastProtocolAction();
        assertNotNull(action);
        assertEquals(APPROVAL_DATE, protocol.getApprovalDate());
        assertEquals(EXPIRATION_DATE, protocol.getExpirationDate());
        assertEquals(COMMENTS, action.getComments());
        assertEquals(ACTION_DATE, action.getActionDate());
    }
    
    private ParameterService getMockParameterService() {
        final ParameterService service = context.mock(ParameterService.class);
        
        context.checking(new Expectations() {{
            allowing(service).getParameterValue(ProtocolDocument.class, Constants.PROTOCOL_TYPE_CODE_EXEMPT);
            will(returnValue(PROTOCOL_TYPE_EXEMPT));
        }});
        
        return service;
    }
    
    private ProtocolActionCorrespondenceGenerationService getMockActionCorrespondenceGenerationService() {
        final ProtocolActionCorrespondenceGenerationService service = context.mock(ProtocolActionCorrespondenceGenerationService.class);
        
        context.checking(new Expectations() {{
            ignoring(service);
        }});
        
        return service;
    }
    
    private ProtocolOnlineReviewService getMockOnlineReviewService() {
        final ProtocolOnlineReviewService service = context.mock(ProtocolOnlineReviewService.class);
        
        context.checking(new Expectations() {{
            ignoring(service);
        }});
        
        return service;
    }
    
    private ProtocolApproveBean getMockProtocolApproveBean() {
        final ProtocolApproveBean bean = context.mock(ProtocolApproveBean.class);
        
        context.checking(new Expectations() {{
            allowing(bean).getApprovalDate();
            will(returnValue(APPROVAL_DATE));
            
            allowing(bean).getExpirationDate();
            will(returnValue(EXPIRATION_DATE));
            
            allowing(bean).getActionDate();
            will(returnValue(ACTION_DATE));
            
            allowing(bean).getComments();
            will(returnValue(COMMENTS));
        }});
        
        return bean;
    }
    
}