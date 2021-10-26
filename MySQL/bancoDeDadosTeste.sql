CREATE DATABASE bancodeteste;
	CREATE TABLE fornecedores(
	codigo int(255) AUTO_INCREMENT,
    nome varchar(255) NOT NULL,
    email varchar(255),
    PRIMARY KEY (codigo)
    );
    INSERT INTO fornecedores(codigo, nome, email) VALUES (null, "Ricardo",
"ricoarrigoni@gmail.com") ;
INSERT INTO fornecedores(codigo, nome, email) VALUES (null, "João",
"joao@gmail.com") ;
INSERT INTO fornecedores(codigo, nome, email) VALUES (null, "Maria",
"maria@gmail.com") ;

SELECT * FROM fornecedores ORDER BY nome ASC;

SELECT codigo FROM fornecedores;

SELECT nome, email FROM fornecedores;

SELECT * FROM fornecedores WHERE codigo = 1;

SELECT * FROM fornecedores WHERE nome = 'Ricardo';


