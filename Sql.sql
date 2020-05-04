CREATE TABLE HscAdmin (
  admin_id varchar2(20),
  admin_password varchar2(20),
  admin_name varchar2(20),
  PRIMARY KEY (admin_id)  
);

drop table HscAdmin

desc HscAdmin

insert into HscAdmin values('Alok1','Alok1','Alok');
insert into HscAdmin values('Pravin1','Pravin1','Pravin');

Select * from HscAdmin
----------------------------------------------------------------------------------------------
CREATE TABLE Customer (
  customer_id varchar2(20),
  customer_password varchar2(20),
  customer_name varchar2(20),
  customer_phonenumber number(10),
  customer_email varchar2(20),
  customer_gender varchar2(20),
  customer_age number(10),
  PRIMARY KEY (customer_id)
);

insert into Customer values('Alok01','Alok01','Alok',1234567890,'Alok@gmail.com','Male',23);

insert into Customer values('Pravin01','Pravin01','Pravin',1234567890,'Pravin@gmail.com','Male',23);

drop table Customer

select * from Customer

desc Customer
----------------------------------------------------------------------------------------------
CREATE TABLE Test (
  test_id varchar2(20),
  test_name varchar2(20),
  test_price number(10),
  center_id varchar2(20) REFERENCES DiagonisticCenter ,
  PRIMARY KEY (test_id)
);

insert into Test values('a01','Blood Test',800,'Dg01');


Drop table Test

desc Test

select * from Test;
----------------------------------------------------------------------------------------------
CREATE TABLE DiagonisticCenter (
  center_name varchar2(20),
  center_id varchar2(20),
  contact_number number(10),
  address varchar2(50),
  PRIMARY KEY (center_id)
);

insert into DiagonisticCenter values('paliwal','Dg01',0987654321,'kakadeo');

drop table DiagonisticCenter 

desc DiagonisticCenter 

select * from DiagonisticCenter 
----------------------------------------------------------------------------------------------
CREATE TABLE Appointment (
  appointment_id number(10),
  test_id varchar2(20) REFERENCES Test,
  datetime date,
  appointmment_status varchar2(20),
  PRIMARY KEY (appointment_id)
);

drop table Appointment 

desc Appointment

select * from Appointment

DELETE FROM Appointment WHERE test_id ='a01';

insert into Appointment values(112,'a01','12/01/2020','true');
----------------------------------------------------------------------------------------------
CREATE TABLE UserAppointmentList (
  appointment_id number(10) REFERENCES Appointment ,
  appointment_status varchar2(20),
  customer_id varchar2(20) REFERENCES Customer 
);

drop table UserAppointmentList 

desc UserAppointmentList 

select * from UserAppointmentList 

insert into UserAppointmentList values(112,'true','Pravin1');



Execution Priority:
DiagonisticCenter
HscAdmin
Test
Appointment
Customer
UserAppointmentList
