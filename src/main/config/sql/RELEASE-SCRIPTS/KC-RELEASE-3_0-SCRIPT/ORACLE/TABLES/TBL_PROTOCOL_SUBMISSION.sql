ALTER TABLE PROTOCOL_SUBMISSION 
ADD (RECUSED_COUNT NUMBER(3, 0),
	IS_BILLABLE VARCHAR2(1) DEFAULT 'N' NOT NULL);

ALTER TABLE PROTOCOL_SUBMISSION ADD COMM_DECISION_MOTION_TYPE_CODE VARCHAR2(3);