create database RH_Empresa;
use RH_Empresa;

create table Funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
cpf numeric(50) not null,
salario float not null,
primary key(id)
); 

select* from Funcionarios;

 insert into Funcionarios(nome, idade, cpf, salario)
 values(" Cândido Cavaleiro", 29, 11111111111, 1500);
 
 insert into Funcionarios(nome, idade, cpf, salario)
 values(" Osvaldo Velasco", 29, 22222222222, 3500);
 
 insert into Funcionarios(nome, idade, cpf, salario)
 values(" Sergio Francisco", 32, 33333333333, 2500);
 
 insert into Funcionarios(nome, idade, cpf, salario)
 values(" Evaldir Manuel", 24, 44444444444, 3000);
 
 insert into Funcionarios(nome, idade, cpf, salario)
 values(" Avelina Felipe", 27, 55555555555, 5500);
 
 select * from Funcionarios where salario >2000;
select * from Funcionarios where salario <2000;
 
 

select * from Funcionarios;
select * from Funcionarios where id =2;
update  Funcionarios set nome = "Creusio Kizua" where id =2;




 
 