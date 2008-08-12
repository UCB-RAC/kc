ALTER TABLE SPONSOR_FORMS 
MODIFY ("UPDATE_USER" VARCHAR2(60 BYTE))
;

ALTER TABLE SPONSOR_FORMS 
ADD CONSTRAINT PK_SPONSOR_FORMS PRIMARY KEY 
(
"SPONSOR_CODE",
"PACKAGE_NUMBER"
) ENABLE
;

ALTER TABLE SPONSOR_FORMS 
ADD CONSTRAINT FK_SPONSOR_FORMS FOREIGN KEY 
(
"SPONSOR_CODE"
) REFERENCES KRADBA.SPONSOR 
(
"SPONSOR_CODE"
) ENABLE
;

