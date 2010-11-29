INSERT INTO KRIM_PERM_ATTR_DATA_T (ATTR_DATA_ID,ATTR_VAL,KIM_ATTR_DEFN_ID,KIM_TYP_ID,OBJ_ID,PERM_ID,VER_NBR)
  VALUES (KRIM_ATTR_DATA_ID_S.nextval,'AwardDocument',
(SELECT KIM_ATTR_DEFN_ID FROM KRIM_ATTR_DEFN_T WHERE NMSPC_CD = 'KR-WKFLW' AND NM = 'documentTypeName'),
(SELECT KIM_TYP_ID FROM KRIM_TYP_T WHERE NMSPC_CD = 'KC-SYS' AND NM = 'Document Action'),SYS_GUID(),
(SELECT PERM_ID FROM KRIM_PERM_T WHERE NMSPC_CD = 'KC-AWARD' AND NM = 'Create Award Account'),1)

INSERT INTO KRIM_PERM_ATTR_DATA_T (ATTR_DATA_ID,ATTR_VAL,KIM_ATTR_DEFN_ID,KIM_TYP_ID,OBJ_ID,PERM_ID,VER_NBR)
  VALUES (KRIM_ATTR_DATA_ID_S.nextval,'Create award account',
(SELECT KIM_ATTR_DEFN_ID FROM KRIM_ATTR_DEFN_T WHERE NMSPC_CD = 'KC-SYS' AND NM = 'documentAction'),
(SELECT KIM_TYP_ID FROM KRIM_TYP_T WHERE NMSPC_CD = 'KC-SYS' AND NM = 'Document Action'),SYS_GUID(),
(SELECT PERM_ID FROM KRIM_PERM_T WHERE NMSPC_CD = 'KC-AWARD' AND NM = 'Create Award Account'),1)

COMMIT;