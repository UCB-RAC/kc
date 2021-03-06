DELIMITER /
--
--

INSERT INTO KRCR_PARM_T (APPL_ID,NMSPC_CD,CMPNT_CD,PARM_NM,VER_NBR,PARM_TYP_CD,VAL,PARM_DESC_TXT,EVAL_OPRTR_CD,OBJ_ID) 
   VALUES ('KC','KC-GEN','All','SYSTEM_NOTIFICATION_PRODUCER_ID',1,'CONFG','1000','Code corresponding to System Notification Producer','A',UUID())
/
INSERT INTO KRCR_PARM_T (APPL_ID,NMSPC_CD,CMPNT_CD,PARM_NM,VER_NBR,PARM_TYP_CD,VAL,PARM_DESC_TXT,EVAL_OPRTR_CD,OBJ_ID) 
   VALUES ('KC','KC-GEN','All','NORMAL_NOTIFICATION_PRIORITY_ID',1,'CONFG','1','Code corresponding to Normal Notification Priority','A',UUID())
/
INSERT INTO KRCR_PARM_T (APPL_ID,NMSPC_CD,CMPNT_CD,PARM_NM,VER_NBR,PARM_TYP_CD,VAL,PARM_DESC_TXT,EVAL_OPRTR_CD,OBJ_ID) 
   VALUES ('KC','KC-GEN','All','SIMPLE_NOTIFICATION_CONTENT_TYPE_ID',1,'CONFG','1','Code corresponding to Simple Notification Type','A',UUID())
/
INSERT INTO KRCR_PARM_T (APPL_ID,NMSPC_CD,CMPNT_CD,PARM_NM,VER_NBR,PARM_TYP_CD,VAL,PARM_DESC_TXT,EVAL_OPRTR_CD,OBJ_ID) 
   VALUES ('KC','KC-GEN','All','KC_NOTIFICATION_CHANNEL_ID',1,'CONFG','1000','Code corresponding to KC Notification Channel','A',UUID())
/

DELIMITER ;
