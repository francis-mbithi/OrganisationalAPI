SET MODE PostgreSQL;
CREATE TABLE IF NOT EXISTS departments (
 id int PRIMARY KEY auto_increment,
 departmentname VARCHAR,
 description VARCHAR,
 totalemployees int
 );
CREATE TABLE IF NOT EXISTS users(
id int PRIMARY KEY auto_increment,
username VARCHAR,
address VARCHAR,
phone int,
email VARCHAR,
departmentid int,
position VARCHAR,
roles vARCHAR

);
CREATE TABLE IF NOT EXISTS news(
id int PRIMARY KEY auto_increment,
news VARCHAR,
departmentid int
);