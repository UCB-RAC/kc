DELIMITER /
UPDATE QUESTIONNAIRE_QUESTIONS SET RULE_ID = 'KC146' WHERE QUESTION_REF_ID_FK IN (SELECT QUESTION_REF_ID FROM QUESTION WHERE QUESTION_ID = 2) AND QUESTIONNAIRE_REF_ID_FK IN (SELECT QUESTIONNAIRE_REF_ID FROM QUESTIONNAIRE WHERE QUESTIONNAIRE_ID = 5)
/
UPDATE QUESTIONNAIRE_QUESTIONS SET RULE_ID = 'KC146' WHERE QUESTION_REF_ID_FK IN (SELECT QUESTION_REF_ID FROM QUESTION WHERE QUESTION_ID = 5) AND QUESTIONNAIRE_REF_ID_FK IN (SELECT QUESTIONNAIRE_REF_ID FROM QUESTIONNAIRE WHERE QUESTIONNAIRE_ID = 5)
/

DELIMITER ;
