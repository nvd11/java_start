set serveroutput on

declare 
      num number; 
begin 
      select count(1) into num from user_tables where TABLE_NAME = 'BANK'; 
      if 1 = num then 
          execute immediate 'Drop table BANK';
      end if; 
end; 
/

declare 
      num number; 
begin 
      select count(1) into num from user_objects where object_name = 'SEQ_BANK' and object_type = 'SEQUENCE'; 
      if 1 = num then 
          execute immediate 'Drop sequence SEQ_BANK';
      end if; 
end; 
/


create table BANK(
    ID Numeric(4) not null primary key,
    NAME nvarchar2(10) not null,
    DESCRIPTION nvarchar2(10) null,
    CREATION_TIME timestamp with time zone not null
);

create sequence SEQ_BANK  
minvalue 1
maxvalue 9999999
start with 1
increment by 1
nocache
order;

create or replace trigger TG_BANK_INS
before insert on BANK
for each row
begin
  select systimestamp into :new.CREATION_TIME from dual;
end;
/
