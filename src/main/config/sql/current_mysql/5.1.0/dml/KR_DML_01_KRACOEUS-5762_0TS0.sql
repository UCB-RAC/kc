DELIMITER /
update KREW_DOC_TYP_T set AUTHORIZER = 'org.kuali.kra.irb.auth.ProtocolWorkflowDocumentAuthorizer' where  DOC_TYP_NM LIKE '%ProtocolDocument%' and CUR_IND = 1
/

DELIMITER ;
