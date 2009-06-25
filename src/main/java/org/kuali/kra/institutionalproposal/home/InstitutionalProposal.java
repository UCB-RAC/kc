/*
 * Copyright 2006-2009 The Kuali Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kuali.kra.institutionalproposal.home;

import java.sql.Date;
import java.util.LinkedHashMap;

import org.kuali.kra.award.home.AwardType;
import org.kuali.kra.bo.KraPersistableBusinessObjectBase;
import org.kuali.kra.bo.NoticeOfOpportunity;
import org.kuali.kra.bo.Rolodex;
import org.kuali.kra.bo.Sponsor;
import org.kuali.kra.institutionalproposal.customdata.InstitutionalProposalCustomData;
import org.kuali.kra.institutionalproposal.personnel.InstitutionalProposalPersonCreditSplit;
import org.kuali.kra.proposaldevelopment.bo.ActivityType;
import org.kuali.kra.proposaldevelopment.bo.ProposalType;
import org.kuali.kra.proposaldevelopment.bo.ProposalUnitCreditSplit;

public class InstitutionalProposal extends KraPersistableBusinessObjectBase { 
    
    private static final long serialVersionUID = 1L;

    private Integer proposalId; 
    private String proposalNumber; 
    private String sponsorProposalNumber; 
    private Integer sequenceNumber; 
    private Integer proposalTypeCode; 
    private String currentAccountNumber; 
    private String title; 
    private String sponsorCode; 
    private Integer rolodexId; 
    private String noticeOfOpportunityCode; 
    private Integer gradStudHeadcount; 
    private Long gradStudPersonMonths; 
    private boolean typeOfAccount; 
    private String activityTypeCode; 
    private Date requestedStartDateInitial; 
    private Date requestedStartDateTotal; 
    private Date requestedEndDateInitial; 
    private Date requestedEndDateTotal; 
    private Long totalDirectCostInitial; 
    private Long totalDirectCostTotal; 
    private Long totalIndirectCostInitial; 
    private Long totalIndirectCostTotal; 
    private String numberOfCopies; 
    private Date deadlineDate; 
    private boolean deadlineType; 
    private boolean mailBy; 
    private boolean mailType; 
    private String mailAccountNumber; 
    private boolean subcontractFlag; 
    private String costSharingIndicator; 
    private String idcRateIndicator; 
    private String specialReviewIndicator; 
    private Integer statusCode; 
    private String scienceCodeIndicator; 
    private String nsfCode; 
    private String primeSponsorCode; 
    private String initialContractAdmin; 
    private Integer ipReviewReqTypeCode; 
    private Date reviewSubmissionDate; 
    private Date reviewReceiveDate; 
    private Integer reviewResultCode; 
    private String ipReviewer; 
    private String ipReviewActivityIndicator; 
    private String currentAwardNumber; 
    private String cfdaNumber; 
    private String opportunity; 
    private Integer awardTypeCode; 
    
    private NoticeOfOpportunity noticeOfOpportunity; 
    private ProposalType proposalType; 
    private Rolodex rolodex; 
    private Sponsor sponsor; 
    private ActivityType activityType; 
    private AwardType awardType; 
    private InstitutionalProposalScienceKeyword proposalScienceKeyword; 
    private InstitutionalProposalCostSharing proposalCostSharing; 
    private InstitutionalProposalCustomData institutionalProposalCustomData; 
    //private AwardFundingProposals awardFundingProposals; 
    private InstitutionalProposalSpecialReview institutionalProposalSpecialReview; 
    private InstitutionalProposalPersonCreditSplit proposalPerCreditSplit; 
    private ProposalUnitCreditSplit proposalUnitCreditSplit; 
    private InstitutionalProposalUnitAdministrator institutionalProposalUnitAdministrator; 
    private InstitutionalProposalComments proposalComments; 
    
    public InstitutionalProposal() { 

    } 
    
    public Integer getProposalId() {
        return proposalId;
    }

    public void setProposalId(Integer proposalId) {
        this.proposalId = proposalId;
    }

    public String getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(String proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public String getSponsorProposalNumber() {
        return sponsorProposalNumber;
    }

    public void setSponsorProposalNumber(String sponsorProposalNumber) {
        this.sponsorProposalNumber = sponsorProposalNumber;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getProposalTypeCode() {
        return proposalTypeCode;
    }

    public void setProposalTypeCode(Integer proposalTypeCode) {
        this.proposalTypeCode = proposalTypeCode;
    }

    public String getCurrentAccountNumber() {
        return currentAccountNumber;
    }

    public void setCurrentAccountNumber(String currentAccountNumber) {
        this.currentAccountNumber = currentAccountNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSponsorCode() {
        return sponsorCode;
    }

    public void setSponsorCode(String sponsorCode) {
        this.sponsorCode = sponsorCode;
    }

    public Integer getRolodexId() {
        return rolodexId;
    }

    public void setRolodexId(Integer rolodexId) {
        this.rolodexId = rolodexId;
    }

    public String getNoticeOfOpportunityCode() {
        return noticeOfOpportunityCode;
    }

    public void setNoticeOfOpportunityCode(String noticeOfOpportunityCode) {
        this.noticeOfOpportunityCode = noticeOfOpportunityCode;
    }

    public Integer getGradStudHeadcount() {
        return gradStudHeadcount;
    }

    public void setGradStudHeadcount(Integer gradStudHeadcount) {
        this.gradStudHeadcount = gradStudHeadcount;
    }

    public Long getGradStudPersonMonths() {
        return gradStudPersonMonths;
    }

    public void setGradStudPersonMonths(Long gradStudPersonMonths) {
        this.gradStudPersonMonths = gradStudPersonMonths;
    }

    public boolean getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(boolean typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public String getActivityTypeCode() {
        return activityTypeCode;
    }

    public void setActivityTypeCode(String activityTypeCode) {
        this.activityTypeCode = activityTypeCode;
    }

    public Date getRequestedStartDateInitial() {
        return requestedStartDateInitial;
    }

    public void setRequestedStartDateInitial(Date requestedStartDateInitial) {
        this.requestedStartDateInitial = requestedStartDateInitial;
    }

    public Date getRequestedStartDateTotal() {
        return requestedStartDateTotal;
    }

    public void setRequestedStartDateTotal(Date requestedStartDateTotal) {
        this.requestedStartDateTotal = requestedStartDateTotal;
    }

    public Date getRequestedEndDateInitial() {
        return requestedEndDateInitial;
    }

    public void setRequestedEndDateInitial(Date requestedEndDateInitial) {
        this.requestedEndDateInitial = requestedEndDateInitial;
    }

    public Date getRequestedEndDateTotal() {
        return requestedEndDateTotal;
    }

    public void setRequestedEndDateTotal(Date requestedEndDateTotal) {
        this.requestedEndDateTotal = requestedEndDateTotal;
    }

    public Long getTotalDirectCostInitial() {
        return totalDirectCostInitial;
    }

    public void setTotalDirectCostInitial(Long totalDirectCostInitial) {
        this.totalDirectCostInitial = totalDirectCostInitial;
    }

    public Long getTotalDirectCostTotal() {
        return totalDirectCostTotal;
    }

    public void setTotalDirectCostTotal(Long totalDirectCostTotal) {
        this.totalDirectCostTotal = totalDirectCostTotal;
    }

    public Long getTotalIndirectCostInitial() {
        return totalIndirectCostInitial;
    }

    public void setTotalIndirectCostInitial(Long totalIndirectCostInitial) {
        this.totalIndirectCostInitial = totalIndirectCostInitial;
    }

    public Long getTotalIndirectCostTotal() {
        return totalIndirectCostTotal;
    }

    public void setTotalIndirectCostTotal(Long totalIndirectCostTotal) {
        this.totalIndirectCostTotal = totalIndirectCostTotal;
    }

    public String getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(String numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public void setDeadlineDate(Date deadlineDate) {
        this.deadlineDate = deadlineDate;
    }

    public boolean getDeadlineType() {
        return deadlineType;
    }

    public void setDeadlineType(boolean deadlineType) {
        this.deadlineType = deadlineType;
    }

    public boolean getMailBy() {
        return mailBy;
    }

    public void setMailBy(boolean mailBy) {
        this.mailBy = mailBy;
    }

    public boolean getMailType() {
        return mailType;
    }

    public void setMailType(boolean mailType) {
        this.mailType = mailType;
    }

    public String getMailAccountNumber() {
        return mailAccountNumber;
    }

    public void setMailAccountNumber(String mailAccountNumber) {
        this.mailAccountNumber = mailAccountNumber;
    }

    public boolean getSubcontractFlag() {
        return subcontractFlag;
    }

    public void setSubcontractFlag(boolean subcontractFlag) {
        this.subcontractFlag = subcontractFlag;
    }

    public String getCostSharingIndicator() {
        return costSharingIndicator;
    }

    public void setCostSharingIndicator(String costSharingIndicator) {
        this.costSharingIndicator = costSharingIndicator;
    }

    public String getIdcRateIndicator() {
        return idcRateIndicator;
    }

    public void setIdcRateIndicator(String idcRateIndicator) {
        this.idcRateIndicator = idcRateIndicator;
    }

    public String getSpecialReviewIndicator() {
        return specialReviewIndicator;
    }

    public void setSpecialReviewIndicator(String specialReviewIndicator) {
        this.specialReviewIndicator = specialReviewIndicator;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getScienceCodeIndicator() {
        return scienceCodeIndicator;
    }

    public void setScienceCodeIndicator(String scienceCodeIndicator) {
        this.scienceCodeIndicator = scienceCodeIndicator;
    }

    public String getNsfCode() {
        return nsfCode;
    }

    public void setNsfCode(String nsfCode) {
        this.nsfCode = nsfCode;
    }

    public String getPrimeSponsorCode() {
        return primeSponsorCode;
    }

    public void setPrimeSponsorCode(String primeSponsorCode) {
        this.primeSponsorCode = primeSponsorCode;
    }

    public String getInitialContractAdmin() {
        return initialContractAdmin;
    }

    public void setInitialContractAdmin(String initialContractAdmin) {
        this.initialContractAdmin = initialContractAdmin;
    }

    public Integer getIpReviewReqTypeCode() {
        return ipReviewReqTypeCode;
    }

    public void setIpReviewReqTypeCode(Integer ipReviewReqTypeCode) {
        this.ipReviewReqTypeCode = ipReviewReqTypeCode;
    }

    public Date getReviewSubmissionDate() {
        return reviewSubmissionDate;
    }

    public void setReviewSubmissionDate(Date reviewSubmissionDate) {
        this.reviewSubmissionDate = reviewSubmissionDate;
    }

    public Date getReviewReceiveDate() {
        return reviewReceiveDate;
    }

    public void setReviewReceiveDate(Date reviewReceiveDate) {
        this.reviewReceiveDate = reviewReceiveDate;
    }

    public Integer getReviewResultCode() {
        return reviewResultCode;
    }

    public void setReviewResultCode(Integer reviewResultCode) {
        this.reviewResultCode = reviewResultCode;
    }

    public String getIpReviewer() {
        return ipReviewer;
    }

    public void setIpReviewer(String ipReviewer) {
        this.ipReviewer = ipReviewer;
    }

    public String getIpReviewActivityIndicator() {
        return ipReviewActivityIndicator;
    }

    public void setIpReviewActivityIndicator(String ipReviewActivityIndicator) {
        this.ipReviewActivityIndicator = ipReviewActivityIndicator;
    }

    public String getCurrentAwardNumber() {
        return currentAwardNumber;
    }

    public void setCurrentAwardNumber(String currentAwardNumber) {
        this.currentAwardNumber = currentAwardNumber;
    }

    public String getCfdaNumber() {
        return cfdaNumber;
    }

    public void setCfdaNumber(String cfdaNumber) {
        this.cfdaNumber = cfdaNumber;
    }

    public String getOpportunity() {
        return opportunity;
    }

    public void setOpportunity(String opportunity) {
        this.opportunity = opportunity;
    }

    public Integer getAwardTypeCode() {
        return awardTypeCode;
    }

    public void setAwardTypeCode(Integer awardTypeCode) {
        this.awardTypeCode = awardTypeCode;
    }

    public NoticeOfOpportunity getNoticeOfOpportunity() {
        return noticeOfOpportunity;
    }

    public void setNoticeOfOpportunity(NoticeOfOpportunity noticeOfOpportunity) {
        this.noticeOfOpportunity = noticeOfOpportunity;
    }

    public ProposalType getProposalType() {
        return proposalType;
    }

    public void setProposalType(ProposalType proposalType) {
        this.proposalType = proposalType;
    }

    public Rolodex getRolodex() {
        return rolodex;
    }

    public void setRolodex(Rolodex rolodex) {
        this.rolodex = rolodex;
    }

    public Sponsor getSponsor() {
        return sponsor;
    }

    public void setSponsor(Sponsor sponsor) {
        this.sponsor = sponsor;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public AwardType getAwardType() {
        return awardType;
    }

    public void setAwardType(AwardType awardType) {
        this.awardType = awardType;
    }

    public InstitutionalProposalScienceKeyword getProposalScienceKeyword() {
        return proposalScienceKeyword;
    }

    public void setProposalScienceKeyword(InstitutionalProposalScienceKeyword proposalScienceKeyword) {
        this.proposalScienceKeyword = proposalScienceKeyword;
    }

    public InstitutionalProposalCostSharing getProposalCostSharing() {
        return proposalCostSharing;
    }

    public void setProposalCostSharing(InstitutionalProposalCostSharing proposalCostSharing) {
        this.proposalCostSharing = proposalCostSharing;
    }

    public InstitutionalProposalCustomData getInstitutionalProposalCustomData() {
        return institutionalProposalCustomData;
    }

    public void setInstitutionalProposalCustomData(InstitutionalProposalCustomData institutionalProposalCustomData) {
        this.institutionalProposalCustomData = institutionalProposalCustomData;
    }

    /*
    public AwardFundingProposals getAwardFundingProposals() {
        return awardFundingProposals;
    }

    public void setAwardFundingProposals(AwardFundingProposals awardFundingProposals) {
        this.awardFundingProposals = awardFundingProposals;
    }
    */

    public InstitutionalProposalSpecialReview getInstitutionalProposalSpecialReview() {
        return institutionalProposalSpecialReview;
    }

    public void setInstitutionalProposalSpecialReview(InstitutionalProposalSpecialReview proposalSpecialReview) {
        this.institutionalProposalSpecialReview = institutionalProposalSpecialReview;
    }

    public InstitutionalProposalPersonCreditSplit getProposalPerCreditSplit() {
        return proposalPerCreditSplit;
    }

    public void setProposalPerCreditSplit(InstitutionalProposalPersonCreditSplit proposalPerCreditSplit) {
        this.proposalPerCreditSplit = proposalPerCreditSplit;
    }

    public ProposalUnitCreditSplit getProposalUnitCreditSplit() {
        return proposalUnitCreditSplit;
    }

    public void setProposalUnitCreditSplit(ProposalUnitCreditSplit proposalUnitCreditSplit) {
        this.proposalUnitCreditSplit = proposalUnitCreditSplit;
    }

    public InstitutionalProposalUnitAdministrator getInstitutionalProposalUnitAdministrator() {
        return institutionalProposalUnitAdministrator;
    }

    public void setInstitutionalProposalUnitAdministrator(InstitutionalProposalUnitAdministrator institutionalProposalUnitAdministrator) {
        this.institutionalProposalUnitAdministrator = institutionalProposalUnitAdministrator;
    }

    public InstitutionalProposalComments getProposalComments() {
        return proposalComments;
    }

    public void setProposalComments(InstitutionalProposalComments proposalComments) {
        this.proposalComments = proposalComments;
    }

    /** {@inheritDoc} */
    @Override 
    protected LinkedHashMap<String, Object> toStringMapper() {
        LinkedHashMap<String, Object> hashMap = new LinkedHashMap<String, Object>();
        hashMap.put("proposalId", this.getProposalId());
        hashMap.put("proposalNumber", this.getProposalNumber());
        hashMap.put("sponsorProposalNumber", this.getSponsorProposalNumber());
        hashMap.put("sequenceNumber", this.getSequenceNumber());
        hashMap.put("proposalTypeCode", this.getProposalTypeCode());
        hashMap.put("currentAccountNumber", this.getCurrentAccountNumber());
        hashMap.put("title", this.getTitle());
        hashMap.put("sponsorCode", this.getSponsorCode());
        hashMap.put("rolodexId", this.getRolodexId());
        hashMap.put("noticeOfOpportunityCode", this.getNoticeOfOpportunityCode());
        hashMap.put("gradStudHeadcount", this.getGradStudHeadcount());
        hashMap.put("gradStudPersonMonths", this.getGradStudPersonMonths());
        hashMap.put("typeOfAccount", this.getTypeOfAccount());
        hashMap.put("activityTypeCode", this.getActivityTypeCode());
        hashMap.put("requestedStartDateInitial", this.getRequestedStartDateInitial());
        hashMap.put("requestedStartDateTotal", this.getRequestedStartDateTotal());
        hashMap.put("requestedEndDateInitial", this.getRequestedEndDateInitial());
        hashMap.put("requestedEndDateTotal", this.getRequestedEndDateTotal());
        hashMap.put("totalDirectCostInitial", this.getTotalDirectCostInitial());
        hashMap.put("totalDirectCostTotal", this.getTotalDirectCostTotal());
        hashMap.put("totalIndirectCostInitial", this.getTotalIndirectCostInitial());
        hashMap.put("totalIndirectCostTotal", this.getTotalIndirectCostTotal());
        hashMap.put("numberOfCopies", this.getNumberOfCopies());
        hashMap.put("deadlineDate", this.getDeadlineDate());
        hashMap.put("deadlineType", this.getDeadlineType());
        hashMap.put("mailBy", this.getMailBy());
        hashMap.put("mailType", this.getMailType());
        hashMap.put("mailAccountNumber", this.getMailAccountNumber());
        hashMap.put("subcontractFlag", this.getSubcontractFlag());
        hashMap.put("costSharingIndicator", this.getCostSharingIndicator());
        hashMap.put("idcRateIndicator", this.getIdcRateIndicator());
        hashMap.put("specialReviewIndicator", this.getSpecialReviewIndicator());
        hashMap.put("statusCode", this.getStatusCode());
        hashMap.put("scienceCodeIndicator", this.getScienceCodeIndicator());
        hashMap.put("nsfCode", this.getNsfCode());
        hashMap.put("primeSponsorCode", this.getPrimeSponsorCode());
        hashMap.put("initialContractAdmin", this.getInitialContractAdmin());
        hashMap.put("ipReviewReqTypeCode", this.getIpReviewReqTypeCode());
        hashMap.put("reviewSubmissionDate", this.getReviewSubmissionDate());
        hashMap.put("reviewReceiveDate", this.getReviewReceiveDate());
        hashMap.put("reviewResultCode", this.getReviewResultCode());
        hashMap.put("ipReviewer", this.getIpReviewer());
        hashMap.put("ipReviewActivityIndicator", this.getIpReviewActivityIndicator());
        hashMap.put("currentAwardNumber", this.getCurrentAwardNumber());
        hashMap.put("cfdaNumber", this.getCfdaNumber());
        hashMap.put("opportunity", this.getOpportunity());
        hashMap.put("awardTypeCode", this.getAwardTypeCode());
        return hashMap;
    }
    
}