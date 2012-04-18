/*
 * Copyright 2005-2010 The Kuali Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License");
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
package org.kuali.kra.s2s.generator.impl;

import java.math.BigDecimal;
import java.util.List;
import gov.grants.apply.forms.nasaPIandAORSupplementalDataSheetV10.FederalAgencyDataType;
import gov.grants.apply.forms.nasaPIandAORSupplementalDataSheetV10.NasaPIandAORSupplementalDataSheetDocument;
import gov.grants.apply.forms.nasaPIandAORSupplementalDataSheetV10.NasaPIandAORSupplementalDataSheetDocument.NasaPIandAORSupplementalDataSheet;
import gov.grants.apply.forms.nasaPIandAORSupplementalDataSheetV10.NasaPIandAORSupplementalDataSheetDocument.NasaPIandAORSupplementalDataSheet.AuthorizedRepresentativeName;
import gov.grants.apply.forms.nasaPIandAORSupplementalDataSheetV10.NasaPIandAORSupplementalDataSheetDocument.NasaPIandAORSupplementalDataSheet.PrincipalInvestigatorName;
import gov.grants.apply.system.globalLibraryV20.HumanNameDataType;
import gov.grants.apply.system.globalLibraryV20.YesNoDataType;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xmlbeans.XmlObject;
import org.kuali.kra.bo.CoeusModule;
import org.kuali.kra.bo.CoeusSubModule;
import org.kuali.kra.infrastructure.BudgetDecimalFormatter;
import org.kuali.kra.infrastructure.KraServiceLocator;
import org.kuali.kra.proposaldevelopment.bo.ProposalPerson;
import org.kuali.kra.proposaldevelopment.document.ProposalDevelopmentDocument;
import org.kuali.kra.questionnaire.answer.Answer;
import org.kuali.kra.questionnaire.answer.AnswerHeader;
import org.kuali.kra.questionnaire.answer.ModuleQuestionnaireBean;
import org.kuali.kra.questionnaire.answer.QuestionnaireAnswerService;
import org.kuali.kra.s2s.S2SException;
import org.kuali.kra.s2s.generator.S2SBaseFormGenerator;
import org.kuali.kra.s2s.generator.bo.DepartmentalPerson;
import org.kuali.kra.s2s.service.S2SBudgetCalculatorService;
import org.kuali.kra.s2s.service.S2SUtilService;
import org.kuali.kra.s2s.util.S2SConstants;

/**
 * 
 * This class is used to generate XML Document object for grants.gov
 * NasaPIandAORSupplementalDataSheetV1.0. This form is generated using XMLBean
 * API's generated by compiling NasaPIandAORSupplementalDataSheetV1.0 schema.
 * 
 * @author Kuali Research Administration Team (kualidev@oncourse.iu.edu)
 */
public class NasaPIandAORSupplementalDataSheetV1_0Generator extends
		S2SBaseFormGenerator {
	private static final Log LOG = LogFactory
			.getLog(NasaPIandAORSupplementalDataSheetV1_0Generator.class);
	private S2SUtilService s2sUtilService;
	private S2SBudgetCalculatorService s2sBudgetCalculatorService;
	private static final String PI_PROPOSAL_YNQ_INTERNATIONAL_PARTICIPATION = "112";
	private static final String PI_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION_AMOUNT = "113";
	private static final String PI_SUB_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION_AMOUNT = "111";
	private static final String PI_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION = "110";
	private static final String NOT_ANSWERED = "No";
	List<AnswerHeader> answerHeaders ;
	
	/**
	 * 
	 * Constructs a NasaPIandAORSupplementalDataSheetV1_0Generator.java.
	 */
	public NasaPIandAORSupplementalDataSheetV1_0Generator() {
		s2sUtilService = KraServiceLocator.getService(S2SUtilService.class);
		s2sBudgetCalculatorService = KraServiceLocator
				.getService(S2SBudgetCalculatorService.class);
	}

	/**
	 * 
	 * This method returns NasaPIandAORSupplementalDataSheetDocument object
	 * based on proposal development document which contains the
	 * NasaPIandAORSupplementalDataSheetDocument informations
	 * AuthorizedRepresentativeName, PrincipalInvestigatorName for a particular
	 * proposal
	 * 
	 * @return nasaPIandAORSupplementalDataSheetDocument {@link XmlObject} of
	 *         type NasaPIandAORSupplementalDataSheetDocument.
	 */
	private NasaPIandAORSupplementalDataSheetDocument getnasapIandAORSupplementalDataSheetDocument() {
		NasaPIandAORSupplementalDataSheetDocument nasaPIandAORSupplementalDataSheetDocument = NasaPIandAORSupplementalDataSheetDocument.Factory
				.newInstance();
		NasaPIandAORSupplementalDataSheet nasapIandAORSupplementalDataSheet = NasaPIandAORSupplementalDataSheet.Factory
				.newInstance();
		nasapIandAORSupplementalDataSheet
				.setFormVersion(S2SConstants.FORMVERSION_1_0);

		nasapIandAORSupplementalDataSheet
				.setAuthorizedRepresentativeName(getAuthorizedRep());
		nasapIandAORSupplementalDataSheet
				.setPrincipalInvestigatorName(getPrincipalInvestigator());

		nasaPIandAORSupplementalDataSheetDocument
				.setNasaPIandAORSupplementalDataSheet(nasapIandAORSupplementalDataSheet);
		return nasaPIandAORSupplementalDataSheetDocument;
	}

	/**
	 * 
	 * This method returns authorizedRepresentativeName which contains
	 * AORName,UserName
	 * 
	 * @return AuthorizedRepresentativeName object with AORname and user name
	 *         details.
	 */
	private AuthorizedRepresentativeName getAuthorizedRep() {
		AuthorizedRepresentativeName authorizedRepresentativeName = AuthorizedRepresentativeName.Factory
				.newInstance();

		DepartmentalPerson aorInfo = s2sUtilService.getDepartmentalPerson(pdDoc);
		authorizedRepresentativeName.setAORName(globLibV20Generator.getHumanNameDataType(aorInfo));

		// TODO HardCoded because table EPS_PROP_CUSTOM_DATA was not found in
		// database
		// authorizedRepresentativeName.setUserName("");
		return authorizedRepresentativeName;
	}

	/**
	 * 
	 * This method returns principalInvestigatorName which contains
	 * PDPIName,USGovernmentParticipation,
	 * FederalAgency,FederalAgencyDollar,InternationalParticipation.
	 * 
	 * @return principalInvestigatorName (PrincipalInvestigatorName) object
	 *         containing principal investigator details.
	 */
	private PrincipalInvestigatorName getPrincipalInvestigator() {
		PrincipalInvestigatorName principalInvestigatorName = PrincipalInvestigatorName.Factory
				.newInstance();

		ProposalPerson PI = s2sUtilService.getPrincipalInvestigator(pdDoc);
		if (PI != null) {
			principalInvestigatorName.setPDPIName(globLibV20Generator
					.getHumanNameDataType(PI));
		} else {
			principalInvestigatorName.setPDPIName(HumanNameDataType.Factory
					.newInstance());
		}

		ModuleQuestionnaireBean moduleQuestionnaireBean = new ModuleQuestionnaireBean(
	                CoeusModule.PROPOSAL_DEVELOPMENT_MODULE_CODE, pdDoc.getDevelopmentProposal().getProposalNumber(), CoeusSubModule.ZERO_SUBMODULE ,CoeusSubModule.ZERO_SUBMODULE, true);
	    QuestionnaireAnswerService questionnaireAnswerService = KraServiceLocator.getService(QuestionnaireAnswerService.class);
	    answerHeaders = questionnaireAnswerService.getQuestionnaireAnswer(moduleQuestionnaireBean);
	    
	    for (AnswerHeader answerHeader : answerHeaders){
	        for (Answer answers : answerHeader.getAnswers()) {
	            if (answers.getQuestion().getQuestionId() != null
	                    && answers.getQuestion().getQuestionId().equals(
	                            PI_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION)){
	                String answer = null;
	                String explanation = null;
	                if(answers.getAnswer() != null ){
	                    if(!answers.getAnswer().equals(NOT_ANSWERED)){
	                        answer = answers.getAnswer();
	                        if ((getExplanation(PI_SUB_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION_AMOUNT)) != null ){
	                            explanation = getExplanation(PI_SUB_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION_AMOUNT);  
	                        }
	                        if (answer != null) {
	                            if (answer.equals(S2SConstants.PROPOSAL_YNQ_ANSWER_Y)) {
	                                principalInvestigatorName
	                                    .setUSGovernmentParticipation(YesNoDataType.Y_YES);
	                                FederalAgencyDataType.Enum FederalAgencyEnum = getFederalAgency(explanation);
	                                if (FederalAgencyEnum != null) {
	                                    principalInvestigatorName
	                                        .setFederalAgency(FederalAgencyEnum);
	                                }
	                                principalInvestigatorName
	                                    .setFederalAgencyDollar(getAmount(PI_PROPOSAL_YNQ_US_GOVERNMENT_PARTICIPATION_AMOUNT));
	                            } else if (answer
	                                    .equals(S2SConstants.PROPOSAL_YNQ_ANSWER_N)) {
	                                principalInvestigatorName
	                                .setUSGovernmentParticipation(YesNoDataType.N_NO);
	                            }
	                        }
	                    }
	                }
	            }
	        }    
	    }    
	    for (AnswerHeader answerHeader : answerHeaders){
            for (Answer answers : answerHeader.getAnswers()) {
                if (answers.getQuestion().getQuestionId() != null
                        && answers.getQuestion().getQuestionId().equals(
                                PI_PROPOSAL_YNQ_INTERNATIONAL_PARTICIPATION)) {
                    String answer = null;
                    if(answers.getAnswer() != null ){
                        if(!answers.getAnswer().equals(NOT_ANSWERED)){
                            answer = answers.getAnswer();
                                if (answer != null) {
                                    if (answer.equals(S2SConstants.PROPOSAL_YNQ_ANSWER_Y)) {
                                        principalInvestigatorName
                                        .setInternationalParticipation(YesNoDataType.Y_YES);
                                        break;
                                    } else if (answer
                                            .equals(S2SConstants.PROPOSAL_YNQ_ANSWER_N)) {
                                        principalInvestigatorName
                                        .setInternationalParticipation(YesNoDataType.N_NO);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                }   
            }   
	    }
		return principalInvestigatorName;
	}

	private FederalAgencyDataType.Enum getFederalAgency(String explanation) {
		FederalAgencyDataType.Enum FederalAgencyEnum = null;
		if (explanation != null) {
			int federalAgencyCode = 0;
			try {
				// Explanation should be Federal Agency Code ranging from
				federalAgencyCode = Integer.parseInt(explanation);
				if (federalAgencyCode > 99 && federalAgencyCode < 151) {
					FederalAgencyEnum = FederalAgencyDataType.Enum
							.forInt(federalAgencyCode - 100);
				}
			} catch (NumberFormatException e) {
				// Explanation entered is not a number. Federal Agency cannot be
				// set.
				LOG.warn(
						"Comments entered should be number between 101 to 150",
						e);
			}
		}
		return FederalAgencyEnum;
	}

	/**
	 * This method creates {@link XmlObject} of type
	 * {@link NasaPIandAORSupplementalDataSheetDocument} by populating data from
	 * the given {@link ProposalDevelopmentDocument}
	 * 
	 * @param proposalDevelopmentDocument
	 *            for which the {@link XmlObject} needs to be created
	 * @return {@link XmlObject} which is generated using the given
	 *         {@link ProposalDevelopmentDocument}
	 * @see org.kuali.kra.s2s.generator.S2SFormGenerator#getFormObject(ProposalDevelopmentDocument)
	 */
	public XmlObject getFormObject(
			ProposalDevelopmentDocument proposalDevelopmentDocument) {
		this.pdDoc = proposalDevelopmentDocument;
		return getnasapIandAORSupplementalDataSheetDocument();
	}

	/**
	 * This method typecasts the given {@link XmlObject} to the required
	 * generator type and returns back the document of that generator type.
	 * 
	 * @param xmlObject
	 *            which needs to be converted to the document type of the
	 *            required generator
	 * @return {@link XmlObject} document of the required generator type
	 * @see org.kuali.kra.s2s.generator.S2SFormGenerator#getFormObject(XmlObject)
	 */
	public XmlObject getFormObject(XmlObject xmlObject) {
		NasaPIandAORSupplementalDataSheetDocument nasapIandAORSupplementalDataSheetDocument = NasaPIandAORSupplementalDataSheetDocument.Factory
				.newInstance();
		NasaPIandAORSupplementalDataSheet nasapIandAORSupplementalDataSheet = (NasaPIandAORSupplementalDataSheet) xmlObject;
		nasapIandAORSupplementalDataSheetDocument
				.setNasaPIandAORSupplementalDataSheet(nasapIandAORSupplementalDataSheet);
		return nasapIandAORSupplementalDataSheetDocument;
	}
	
	/*
     * This method will get the Answer for question id
     */
    private String getExplanation(String questionID) {
        String answer = null;
        if (answerHeaders != null && !answerHeaders.isEmpty()) {
            for(AnswerHeader answerHeader : answerHeaders){
                for (Answer answers : answerHeader.getAnswers()) {
                    if (answers.getQuestion().getQuestionId() != null
                            && questionID.equals(answers.getQuestion().getQuestionId())) {
                        answer = answers.getAnswer();  
                        break;                    
                    }
                }
            }
        }
        return answer;
    }
    
    /*
     * This method will get the Amount for question id
     */
    private BigDecimal getAmount(String questionID) {
        BigDecimal amount = BigDecimal.ZERO;
        BudgetDecimalFormatter b = new BudgetDecimalFormatter();
        String answer;
        for(AnswerHeader answerHeader : answerHeaders){
            for (Answer answers : answerHeader.getAnswers()) {
                if (answers.getQuestion().getQuestionId() != null
                        && questionID.equals(answers.getQuestion().getQuestionId())) {
                  answer = answers.getAnswer();
                  amount=  new BigDecimal(Integer.parseInt(answer));
                               
                }
            }
        }
        return amount;
    }

}
