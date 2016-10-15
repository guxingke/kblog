create table options (
  id int(4) not null primary key auto_increment,
  item varchar(50) not null,
  value varchar(255) not null,
  unique (item)
 );

insert into options(id, item, value) values(1, "title", "test title");

