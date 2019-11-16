create table aluno(
id int primary key auto_increment,
nome_aluno varchar(100),
data_nascimento date,
nome_pai varchar(100),
nome_mae varchar(100),
serie_cursada varchar(100),
endereco varchar(100),
cpf int,
telefone_emergencia varchar(100)
);


create table professor(
id int primary key auto_increment,
nome_professor varchar(100),
materia varchar(50),
endereco varchar(100),
telefone varchar(50),
cpf int
);

create table materia(
id int primary key auto_increment,
materia_nota double,
materia_nome varchar(50),
cpf_aluno int,
cpf_professor int,
foreign key (cpf_professor) references professor(id),
foreign key (cpf_aluno) references aluno(id)
);

select * from aluno;

select * from professor;

select * from materia;