create database sms;
use sms;


create table user_login
(user_id int primary key not null,
password_ varchar (200) not null);


create table student
(ID int primary key not null,
Name_ varchar (200) not null,
Father_name varchar (200) not null,
Mother_name varchar (200) not null,
DOB varchar (200) not null,
Adhar_no varchar (200) not null,
Phone_no varchar (200) not null,
E_mail varchar (200) not null,
Class varchar (200) not null,
Address varchar (200) not null);


create table Teacher
(Teacher_id int primary key not null,
Name_ varchar (200) not null,
Father_name varchar (200) not null,
Education varchar (200) not null,
Department varchar (200) not null,
Adhar_no varchar (200) not null,
Phone_no varchar (200) not null,
E_mail varchar (200) not null,
DOB varchar (200) not null,
Address varchar (200) not null);





create table Grades
(Id int primary key not null,
Name_ varchar (255) not null,
Class int not null,
Physics int,
Chemistry int,
Maths int,
Grades varchar(255) not null);








Create table Fee_Submit
(Id int primary key not null,
Date_ varchar (255) not null,
Class varchar (255) not null,
Month_ varchar (255) not null,
Fee int not null,
Status_ varchar (255) not null);



Create table Teacher_Attendance
(Id int primary key not null,
Date_ varchar (255) not null,
First_Half varchar (255) not null,
Second_Half varchar (255) not null);

select * from attendance;

Create table Student_Attendance
(Roll_no int primary key not null,
Date_ varchar (255) not null,
First_Half varchar (255) not null,
Second_Half varchar	 (255) not null);


insert into user_login
values
(1122 , 'aniv');

use sms;
select * from user_login;

select * from student;

select * from Grades;

select * from teacher;
