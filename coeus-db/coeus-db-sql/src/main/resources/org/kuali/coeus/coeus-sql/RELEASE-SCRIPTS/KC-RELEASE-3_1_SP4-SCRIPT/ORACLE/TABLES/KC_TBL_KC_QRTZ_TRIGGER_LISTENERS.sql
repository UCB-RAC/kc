CREATE TABLE kc_qrtz_trigger_listeners
  (
    TRIGGER_NAME  VARCHAR2(200) NOT NULL, 
    TRIGGER_GROUP VARCHAR2(200) NOT NULL,
    TRIGGER_LISTENER VARCHAR2(200) NOT NULL,
    PRIMARY KEY (TRIGGER_NAME,TRIGGER_GROUP,TRIGGER_LISTENER)
);