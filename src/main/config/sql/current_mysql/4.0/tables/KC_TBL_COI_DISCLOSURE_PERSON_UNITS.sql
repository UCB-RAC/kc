DELIMITER /
CREATE TABLE COI_DISCLOSURE_PERSON_UNITS ( 
    COI_DISCLOSURE_PERSON_UNITS_ID DECIMAL(12,0) NOT NULL, 
    COI_DISCLOSURE_PERSON_ID DECIMAL(12,0) NOT NULL, 
    VER_NBR DECIMAL(8,0) DEFAULT 1 NOT NULL, 
    OBJ_ID VARCHAR(36) NOT NULL, 
    UNIT_NUMBER VARCHAR(8) NOT NULL, 
    LEAD_UNIT_FLAG VARCHAR(1) NOT NULL, 
    PERSON_ID VARCHAR(40) NOT NULL, 
    UPDATE_TIMESTAMP DATE, 
    UPDATE_USER VARCHAR(60))
/
ALTER TABLE COI_DISCLOSURE_PERSON_UNITS 
ADD CONSTRAINT PK_COI_DISCLOSURE_PERSON_UNITS 
PRIMARY KEY (COI_DISCLOSURE_PERSON_UNITS_ID)
/
DELIMITER ;
