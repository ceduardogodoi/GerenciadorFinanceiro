create table usuario
(
id smallint(4) unsigned not null primary key auto_increment,
login varchar(10) unique not null,
senha varchar(20) not null,
nome varchar(45) not null,
index idx_login(login),
index idx_nome(nome)
);

