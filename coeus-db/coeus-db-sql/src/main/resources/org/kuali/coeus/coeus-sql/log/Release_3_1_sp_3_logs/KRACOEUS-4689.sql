create table AWD_BGT_PER_SUM_CALC_AMT(
	AWD_BGT_PER_SUM_CALC_AMT_ID number(12,0),
	BUDGET_PERIOD_ID number(12,0) not null,
	COST_ELEMENT VARCHAR2(8) not null,
	ON_OFF_CAMPUS_FLAG VARCHAR2(1),
	RATE_CLASS_TYPE VARCHAR2(1) not null,
	CALCULATED_COST number(12,2), 
	CALCULATED_COST_SHARING number(12,2), 
	UPDATE_TIMESTAMP DATE NOT NULL, 
	UPDATE_USER VARCHAR2(60) NOT NULL, 
	VER_NBR number(8,0) DEFAULT 1, 
	OBJ_ID VARCHAR2(36) NOT NULL,
	CONSTRAINT AWD_BGT_PER_SUM_CALC_AMT_PK PRIMARY KEY (AWD_BGT_PER_SUM_CALC_AMT_ID)
);

alter table AWD_BGT_PER_SUM_CALC_AMT add CONSTRAINT FK_AWARD_BGT_SUMM_CLAC_AMT 
							FOREIGN KEY (BUDGET_PERIOD_ID) REFERENCES BUDGET_PERIODS (BUDGET_PERIOD_NUMBER);
alter table AWD_BGT_PER_SUM_CALC_AMT add CONSTRAINT FK2_AWARD_BGT_SUMM_CLAC_AMT 
							FOREIGN KEY (COST_ELEMENT) REFERENCES COST_ELEMENT (COST_ELEMENT);
alter table AWD_BGT_PER_SUM_CALC_AMT add CONSTRAINT UQ_AWARD_BGT_SUMM_CLAC_AMT 
							UNIQUE (BUDGET_PERIOD_ID,COST_ELEMENT,ON_OFF_CAMPUS_FLAG,RATE_CLASS_TYPE);

CREATE SEQUENCE SEQ_BGT_SUM_PER_CALC_AMT_ID INCREMENT BY 1 START WITH 1;
--for mysql
--CREATE table SEQ_BGT_SUM_PER_CALC_AMT_ID (
--    id bigint(19) not null auto_increment, primary key (id) 
--) ;
alter table AWARD_BUDGET_PERIOD_EXT add TOTAL_FRINGE_AMOUNT number(12,0);