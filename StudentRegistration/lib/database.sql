create database student_registration;
use student_registration;

	CREATE TABLE student(
    id int NOT NULL auto_increment,
    name varchar(150) not null,
    gender varchar(10) not null,
    email varchar(100) not null,
    phone varchar(100) not null,
    father_name varchar(100) not null,
    mother_name varchar(100) not null,
    address1 text not null,
    address2 text not null,
    primary key (id)
    );
    
    create table department (
    id int not null auto_increment,
    student_id int default null,
    semester int default null,
    course1 varchar(200) default null,
    course2 varchar(200) default null,
    course3 varchar(200) default null,
    course4 varchar(200) default null,
    course5 varchar(200) default null,
    primary key (id),
    key fk_student_id (student_id),
    constraint fk_student foreign key (student_id) references student (id) on delete cascade
    );