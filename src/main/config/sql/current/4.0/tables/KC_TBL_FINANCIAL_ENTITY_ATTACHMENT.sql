CREATE TABLE FINANCIAL_ENTITY_ATTACHMENT
   (FINANCIAL_ENTITY_ATTACHMENT_ID NUMBER(12,0) NOT NULL ENABLE, 
    FINANCIAL_ENTITY_ID_FK NUMBER(12,0) NOT NULL ENABLE,
    FILE_ID NUMBER(12,0) NOT NULL ENABLE,
    DESCRIPTION VARCHAR2(200) NOT NULL ENABLE, 
    CONTACT_NAME VARCHAR2(30),
    EMAIL_ADDRESS VARCHAR2(60),
    PHONE_NUMBER VARCHAR2(20),
    COMMENTS VARCHAR2(300),
    DOCUMENT_STATUS_CODE VARCHAR2(3),
    VER_NBR NUMBER(8,0) DEFAULT 1 NOT NULL ENABLE,
    OBJ_ID VARCHAR2(36) DEFAULT SYS_GUID()  NOT NULL ENABLE,
    UPDATE_TIMESTAMP DATE NOT NULL ENABLE,
    UPDATE_USER VARCHAR2(10) NOT NULL ENABLE,
    SEQUENCE_NUMBER NUMBER(4,0),
    PROJECT_ID VARCHAR2(12)
    )
/
