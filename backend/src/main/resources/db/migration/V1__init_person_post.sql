create table person (
  id int(4) not null primary key auto_increment,
  name varchar(20) not null,
  password varchar(255) not null
 );

create table posts (
  id int(8) not null primary key auto_increment,
  title varchar(255) not null,
  md varchar(1000) not null,
  html varchar(3000) not null,
  author int(4) not null,
  createAt datetime not null
);

insert into person(id, name, password) values(1, "gxk", "test");

insert into posts(id,title,md,html,author,createAt) values(1, "test", "#Test", "<h1>Test</h1>", 1, now());