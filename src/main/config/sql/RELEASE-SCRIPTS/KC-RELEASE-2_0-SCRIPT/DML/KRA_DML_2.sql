

insert into KIM_ROLES_T (ID,NAME,DESCRIPTION, ROLE_TYPE_CODE, DESCEND_FLAG) values(14,'Protocol Unassigned','Protocol Unassigned - no permissions', 'R', 'N'); 

INSERT INTO KRIM_GRP_MBR_T (GRP_ID,GRP_MBR_ID,LAST_UPDT_DT,MBR_ID,MBR_TYP_CD,OBJ_ID,VER_NBR) 
  VALUES ('1','1186',TO_DATE( '20081208124957', 'YYYYMMDDHH24MISS' ),'quickstart','P',sys_guid(),1);
  
commit;

