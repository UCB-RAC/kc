DELIMITER /
CREATE TABLE NEGOTIATION_UNASSOC_DETAIL  ( 
	NEGOTIATION_UNASSOC_DETAIL_ID	DECIMAL(22) NOT NULL,
	NEGOTIATION_ID               	DECIMAL(22) NOT NULL,
	TITLE                        	VARCHAR(45) NULL,
	PI_PERSON_ID                 	VARCHAR(40) NULL,
	PI_ROLODEX_ID                	VARCHAR(40) NULL,
	PI_NAME						    VARCHAR(100) NULL,
	LEAD_UNIT                    	VARCHAR(8) NULL,
	SPONSOR_CODE                 	CHAR(6) NULL,
	PRIME_SPONSOR_CODE           	CHAR(6) NULL,
	SPONSOR_AWARD_NUMBER         	VARCHAR(70) NULL,
	CONTACT_ADMIN_PERSON_ID      	VARCHAR(40) NULL,
	SUBAWARD_ORG                 	VARCHAR(8) NULL,
	UPDATE_TIMESTAMP     	DATE NOT NULL,
	UPDATE_USER          	VARCHAR(60) NOT NULL,
	VER_NBR              	DECIMAL(8,0) NOT NULL,
	OBJ_ID               	VARCHAR(36) NOT NULL,
	CONSTRAINT NEGOTIATION_UNASSOC_DETAIL_PK1 PRIMARY KEY(NEGOTIATION_UNASSOC_DETAIL_ID)
	
)
/
DELIMITER ;
