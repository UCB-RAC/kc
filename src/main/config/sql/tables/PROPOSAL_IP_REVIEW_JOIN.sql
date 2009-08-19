-- Table Script 
CREATE TABLE PROPOSAL_IP_REVIEW_JOIN ( 
    PROPOSAL_IP_REVIEW_JOIN_ID NUMBER(12,0) NOT NULL, 
    PROPOSAL_ID NUMBER(12,0) NOT NULL,
    IP_REVIEW_ID NUMBER(12,0),
    UPDATE_TIMESTAMP DATE NOT NULL, 
    UPDATE_USER VARCHAR2(60) NOT NULL,     
    VER_NBR NUMBER(8,0) DEFAULT 1 NOT NULL, 
    OBJ_ID VARCHAR2(36) DEFAULT SYS_GUID() NOT NULL);

-- Primary Key Constraint 
ALTER TABLE PROPOSAL_IP_REVIEW_JOIN
ADD CONSTRAINT PK_PROPOSAL_IP_REVIEW_JOIN
PRIMARY KEY (PROPOSAL_IP_REVIEW_JOIN_ID);

-- Foreign Key Constraint(s)
ALTER TABLE PROPOSAL_IP_REVIEW_JOIN 
ADD CONSTRAINT FK_PROPOSAL_ID 
FOREIGN KEY (PROPOSAL_ID) 
REFERENCES PROPOSAL (PROPOSAL_ID);

ALTER TABLE PROPOSAL_IP_REVIEW_JOIN 
ADD CONSTRAINT FK2_IP_REVIEW_ID 
FOREIGN KEY (IP_REVIEW_ID) 
REFERENCES IP_REVIEW (IP_REVIEW_ID);
