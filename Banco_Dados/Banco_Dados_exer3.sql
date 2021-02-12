create database Escola;
use Escola;

create table Primaria(
id bigint auto_increment,
nome varchar (255) not null,
idade int not null,
cpf numeric(50),
curso varchar(50),
nota numeric(50),
primary key (id)
);
   
   
   select * from Primaria;
   
   insert into Primaria( nome, idade, cpf, curso, nota)
   values("João Luis"," 10","1111111111","inglês",6);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Jesus dos Santos"," 9","2222222222","inglês",7);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Maria Eduarda"," 10","33333333333","inglês",9);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Diana Tavares"," 8","44444444444","inglês",9);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("João Lucas"," 7","55555555555","inglês",6);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Sunghuarranga Cavaleiro"," 7","66666666666","inglês",10);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Wilcar dos Santos"," 10","77777777777","inglês",8);
   
    insert into Primaria( nome, idade, cpf, curso, nota)
   values("Ana Maria"," 7","88888888888","inglês",7);
   
   select  nome from Primaria  where id =1;
   delete from primaria where id =6;
   
    select * from Primaria;
   
   select * from Primaria where nota > 7;
  
  
  update Primaria set nota= 10 where id= 7;
  
  