CREATE TABLE AWARD_REPORT_TRACKING  ( 
	AWARD_REPORT_TERM_ID        NUMBER(22) NULL,
	AWARD_NUMBER				VARCHAR2(12) NOT NULL,
	PI_PERSON_ID				VARCHAR2(40) NULL,
	PI_ROLODEX_ID				NUMBER(6,0) NULL,
	PI_NAME					    VARCHAR2(90) NOT NULL,
	LEAD_UNIT_NUMBER			VARCHAR2(8) NOT NULL,
	REPORT_CLASS_CODE			VARCHAR2(3) NOT NULL,
	REPORT_CODE				    VARCHAR2(3) NOT NULL,
	FREQUENCY_CODE			    VARCHAR2(3) NULL,
	FREQUENCY_BASE_CODE		    VARCHAR2(3) NULL,
	OSP_DISTRIBUTION_CODE       VARCHAR2(3) NULL,
	STATUS_CODE              	VARCHAR2(3) NULL,
	BASE_DATE					DATE NULL,
	DUE_DATE					DATE NULL,
	ACTIVITY_DATE				DATE NULL,
	OVERDUE					    NUMBER(6,0) NULL,
	COMMENTS					VARCHAR2(200) NULL,
	PREPARER_ID				    VARCHAR2(40) NULL,
	PREPARER_NAME				VARCHAR2(90) NULL,
	SPONSOR_CODE				VARCHAR2(6) NOT NULL,
	SPONSOR_AWARD_NUMBER		VARCHAR2(70) NULL,
	TITLE						VARCHAR2(200) NOT NULL,
	LAST_UPDATE_USER			VARCHAR2(60) NOT NULL,
	LAST_UPDATE_DATE			DATE NOT NULL,
	UPDATE_TIMESTAMP			DATE NOT NULL,
	UPDATE_USER				    VARCHAR2(60) NOT NULL,
	VER_NBR					    NUMBER(8,0) NOT NULL,
	OBJ_ID					    VARCHAR2(36) NOT NULL
)
/
