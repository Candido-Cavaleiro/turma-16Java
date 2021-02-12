create database Calvin;
use Calvin;

create table Produtos(
id bigint auto_increment,
nome varchar(255) not null,
cor varchar(255) not null,
tamanho char(50) not null,
valor float (50) not null,
primary key (id)
);

select* from Produtos;

insert into Produtos(nome, cor, tamanho, valor)
values("Camisa"," Preta","P","50");

insert into Produtos(nome, cor, tamanho, valor)
values("Calça"," Branca","M","250");

insert into Produtos(nome, cor, tamanho, valor)
values("Terno"," Preta","G","2100");

insert into Produtos(nome, cor, tamanho, valor)
values("Sapato"," Preta","39","500");

insert into Produtos(nome, cor, tamanho, valor)
values("Bota"," Castanha","39","900");

insert into Produtos(nome, cor, tamanho, valor)
values("Camisola"," Cinza","G","300");

insert into Produtos(nome, cor, tamanho, valor)
values("boxer"," Branca","P","50");

insert into Produtos(nome, cor, tamanho, valor)
values("Gravata"," Vermelho","P","280");

select * from Produtos;

select * from Produtos where valor > 500;
select * from Produtos where valor < 500;

update Produtos set nome = "toalha de rosto" where id=2;

