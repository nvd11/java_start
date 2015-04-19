set serveroutput on

declare 
      num   number; 
begin 
      select count(1) into num from user_tables where TABLE_NAME = 'COUNTRY'; 
      if 1 = num then 
          execute immediate 'Drop table COUNTRY';
      end if; 
end; 
/

create table COUNTRY(
    ID Numeric(4) not null primary key,
    NAME nvarchar2(10)
);