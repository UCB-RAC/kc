-- Table Script 
CREATE TABLE IP_REVIEW ( 
    IP_REVIEW_ID NUMBER(12,0) NOT NULL, 
    PROPOSAL_NUMBER VARCHAR2(8) NOT NULL, 
    SEQUENCE_NUMBER NUMBER(4,0) NOT NULL, 
    IP_REVIEW_REQ_TYPE_CODE NUMBER(3,0), 
    REVIEW_SUBMISSION_DATE DATE, 
    REVIEW_RECEIVE_DATE DATE, 
    REVIEW_RESULT_CODE NUMBER(3,0), 
    IP_REVIEWER VARCHAR2(9), 
    UPDATE_TIMESTAMP DATE NOT NULL, 
    UPDATE_USER VARCHAR2(60) NOT NULL, 
    VER_NBR NUMBER(8,0) DEFAULT 1 NOT NULL, 
    OBJ_ID VARCHAR2(36) DEFAULT SYS_GUID() NOT NULL);

-- Primary Key Constraint 
ALTER TABLE IP_REVIEW 
ADD CONSTRAINT PK_IP_REVIEW 
PRIMARY KEY (IP_REVIEW_ID);
