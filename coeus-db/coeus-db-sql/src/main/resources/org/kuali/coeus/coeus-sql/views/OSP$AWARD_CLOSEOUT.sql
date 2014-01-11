CREATE OR REPLACE VIEW OSP$AWARD_CLOSEOUT AS
	SELECT A.AWARD_NUMBER MIT_AWARD_NUMBER, 
	A.SEQUENCE_NUMBER SEQUENCE_NUMBER, 
	(SELECT C.FINAL_SUBMISSION_DATE FROM AWARD_CLOSEOUT C WHERE C.CLOSEOUT_REPORT_CODE = '1') FINAL_INV_SUBMISSION_DATE,
	(SELECT C.FINAL_SUBMISSION_DATE FROM AWARD_CLOSEOUT C WHERE C.CLOSEOUT_REPORT_CODE = '4') FINAL_TECH_SUBMISSION_DATE,	
	(SELECT C.FINAL_SUBMISSION_DATE FROM AWARD_CLOSEOUT C WHERE C.CLOSEOUT_REPORT_CODE = '3') FINAL_PATENT_SUBMISSION_DATE,
	(SELECT C.FINAL_SUBMISSION_DATE FROM AWARD_CLOSEOUT C WHERE C.CLOSEOUT_REPORT_CODE = '2') FINAL_PROP_SUBMISSION_DATE,
	B.ARCHIVE_LOCATION ARCHIVE_LOCATION, 
	B.CLOSEOUT_DATE CLOSEOUT_DATE, 
	A.UPDATE_TIMESTAMP UPDATE_TIMESTAMP, 
	A.UPDATE_USER UPDATE_USER
	FROM AWARD_CLOSEOUT A, AWARD B WHERE A.AWARD_NUMBER = B.AWARD_NUMBER AND A.SEQUENCE_NUMBER = B.SEQUENCE_NUMBER;