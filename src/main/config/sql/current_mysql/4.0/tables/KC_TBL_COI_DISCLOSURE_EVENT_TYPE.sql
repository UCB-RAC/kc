DELIMITER /
CREATE TABLE COI_DISCLOSURE_EVENT_TYPE ( 
    EVENT_TYPE_CODE VARCHAR(3) NOT NULL, 
    DESCRIPTION VARCHAR(200), 
    UPDATE_TIMESTAMP DATE, 
    UPDATE_USER VARCHAR(60), 
    VER_NBR DECIMAL(8,0) DEFAULT 1 NOT NULL, 
    OBJ_ID VARCHAR(36) NOT NULL)
/
ALTER TABLE COI_DISCLOSURE_EVENT_TYPE 
ADD CONSTRAINT COI_DISCLOSURE_EVENT_TYPE_PK 
PRIMARY KEY (EVENT_TYPE_CODE)
/


DELIMITER ;
