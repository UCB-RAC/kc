CREATE OR REPLACE procedure get_p_budget_for_pk
   ( AW_PROPOSAL_NUMBER IN OSP$BUDGET.PROPOSAL_NUMBER%TYPE,
     AW_VERSION_NUMBER IN OSP$BUDGET.VERSION_NUMBER%TYPE,
	  cur_generic IN OUT result_sets.cur_generic) is

begin



open cur_generic for

  SELECT PROPOSAL_NUMBER,
		VERSION_NUMBER,
		START_DATE,
		END_DATE  ,
		TOTAL_COST ,
		TOTAL_DIRECT_COST ,
		TOTAL_INDIRECT_COST,
		COST_SHARING_AMOUNT,
		UNDERRECOVERY_AMOUNT,
		RESIDUAL_FUNDS,
		TOTAL_COST_LIMIT ,
		OH_RATE_CLASS_CODE ,
		OH_RATE_TYPE_CODE ,
		COMMENTS  ,
		FINAL_VERSION_FLAG   ,
		UPDATE_TIMESTAMP ,
		UPDATE_USER,
		UR_RATE_CLASS_CODE,
		MODULAR_BUDGET_FLAG --Added for Case # 1626
    FROM OSP$BUDGET
	WHERE PROPOSAL_NUMBER = AW_PROPOSAL_NUMBER
	  AND VERSION_NUMBER = AW_VERSION_NUMBER ;

end;
/

