create database DB_generation_game_online;

use DB_generation_game_online;

create table tb_classes(
id bigint auto_increment,
DescrClasse varchar(255) not null,
PoderAtaque float not null,
PoderDefesa float not null,
primary key(id)
);

insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Guardião", 3100, 800);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Assassino", 2800, 1200);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Hulk", 1600, 2500);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Feiticeiro", 5200, 900);
insert into tb_classes(DescrClasse, PoderAtaque, PoderDefesa) values ("Pistoleiro", 1000, 4000);
select * from tb_classes;

create table tb_personagens(
id bigint auto_increment,
NomePersonagem varchar(255) not null,
LevelPersonagem int not null,
Raca varchar(255) not null,
Hp float not null,
Mana float not null,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classes (id)
);

insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("scannor", 12, "Elfo", 6000, 2000, 4);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("Ban", 8, "Fada", 5000, 2000, 3);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("thor", 10, "Humano", 5000, 1600, 2);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("tarzan", 9, "selvagem", 5000, 2600, 1);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("capitão america", 14, " humano", 6200, 2300, 4);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("viuva negra", 12, "Humana", 5000, 2000, 1);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("homem aranha", 10, "Humano", 8000, 1800, 5);
insert into tb_personagens(NomePersonagem, LevelPersonagem, Raca, Hp, Mana, classe_id) values ("hercules", 11, "semi Deus", 6500, 2300, 5);
select * from tb_personagens;

SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse, tb_classes.PoderAtaque 
    FROM tb_personagens INNER JOIN tb_classes   
    on tb_personagens.classe_id = tb_classes.id
    where tb_classes.PoderAtaque > 2000;
    
SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse, tb_classes.PoderDefesa
    FROM tb_personagens INNER JOIN tb_classes   
    on tb_personagens.classe_id = tb_classes.id
    where tb_classes.PoderDefesa Between 1000 AND 2000;
    
SELECT NomePersonagem from tb_personagens Where NomePersonagem LIKE "%c%";

SELECT tb_personagens.NomePersonagem, tb_classes.DescrClasse
    FROM tb_personagens INNER JOIN tb_classes   
    on tb_personagens.classe_id = tb_classes.id
    where tb_classes.DescrClasse = "Guardião";