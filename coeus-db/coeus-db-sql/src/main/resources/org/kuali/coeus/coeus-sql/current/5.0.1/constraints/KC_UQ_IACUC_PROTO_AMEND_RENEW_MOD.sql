ALTER TABLE IACUC_PROTO_AMEND_RENEW_MOD 
ADD CONSTRAINT UQ_IACUC_PROTOCOL_AMEND_RENEW 
UNIQUE (PROTOCOL_NUMBER, PROTO_AMEND_RENEWAL_NUMBER, PROTOCOL_MODULE_CODE) 
/


