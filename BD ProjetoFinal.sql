create database projetoetec
use projetoetec
create table cadastro
(id_codigo  int primary key not null,
 nome  	    varchar (100)   not null,
 cep  	    char (9) 	   not null,
 endereco   varchar (100)   not null,
 bairro     varchar (50)    not null,
 cidade     varchar (50)    not null,
 latitude   double 			not null,
 longitude  double 			not null,
 dt_criacao datetime		not null);