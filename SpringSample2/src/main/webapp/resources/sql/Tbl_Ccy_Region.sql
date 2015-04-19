declare 
      num   number; 
begin 
      select count(1) into num from user_tables where TABLE_NAME = 'CCY_REGION'; 
      if 1 = num then 
          execute immediate 'Drop table CCY_REGION';
      end if; 
end; 
/

create table CCY_REGION(
	CURRENCY nvarchar2(10) not null,
	REGION   nvarchar2(10) not null,
	constraint PK_CCY_REGION primary key(CURRENCY,REGION)
);
