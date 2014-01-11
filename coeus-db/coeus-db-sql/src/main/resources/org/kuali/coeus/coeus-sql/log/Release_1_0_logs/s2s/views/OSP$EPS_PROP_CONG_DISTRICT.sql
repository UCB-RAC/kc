CREATE OR REPLACE VIEW OSP$EPS_PROP_CONG_DISTRICT (
   PROPOSAL_NUMBER,
   SITE_NUMBER,
   CONG_DISTRICT,
   UPDATE_TIMESTAMP,
   UPDATE_USER)
          AS 
       (select
       P.PROPOSAL_NUMBER, 
       S.SITE_NUMBER,   
       O.CONGRESSIONAL_DISTRICT,
       P.UPDATE_TIMESTAMP,
       P.UPDATE_USER from OSP$EPS_PROPOSAL P,OSP$ORGANIZATION O,OSP$EPS_PROP_SITES S
       			   where P.PROPOSAL_NUMBER=S.PROPOSAL_NUMBER and 
       			   		 P.ORGANIZATION_ID=O.ORGANIZATION_ID)
       union
       (select
       P.PROPOSAL_NUMBER, 
       S.SITE_NUMBER,   
       O.CONGRESSIONAL_DISTRICT,
       P.UPDATE_TIMESTAMP,
       P.UPDATE_USER from OSP$EPS_PROPOSAL P,OSP$ORGANIZATION O,OSP$EPS_PROP_SITES S
       			   where P.PROPOSAL_NUMBER=S.PROPOSAL_NUMBER and 
       			   		 P.PERFORMING_ORGANIZATION_ID=O.ORGANIZATION_ID)
       ;

