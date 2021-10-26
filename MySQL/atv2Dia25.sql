CREATE DATABASE db_pizza_legal ;

USE db_pizza_legal ; 

CREATE TABLE tb_categoria (
	id INT AUTO_INCREMENT,
    tamanho ENUM ('Pequena','Media', 'Grande'),
    tipo_massa ENUM ('Tradicional', 'Fina'),
    
    PRIMARY KEY (id)
    );
    
CREATE TABLE tb_pizza (
	id_pizza INT  AUTO_INCREMENT,
    sabor VARCHAR(255) NOT NULL,
    borda ENUM ('Catupiry', 'Cheddar','Sem Borda'),
    recheio BOOLEAN NOT NULL,
    valor DECIMAL (10,2) NOT NULL,
    fk_categoria_id INT NOT NULL,
    PRIMARY KEY (id_pizza),
    FOREIGN KEY (fk_categoria_id) REFERENCES tb_categoria(id)
    );

INSERT INTO tb_categoria (tamanho, tipo_massa) VALUES 
	('Pequena', 'Fina'),
    ('Média', 'Fina'),
    ('Grande', 'Fina'),
    ('Pequena', 'Tradicional'),
    ('Media', 'Tradicional'),
    ('Grande', 'Tradicional');
    
SELECT * FROM tb_categoria ; 

INSERT INTO tb_pizza (sabor, borda, recheio, valor, fk_categoria_id) VALUES
	('Calabresa', 'Catupiry', 1, 20.50, 1),
    ('Nordestina', 'Cheddar', 0, 45.50, 2),
    ('Peperoni', 'Catupiry', 1, 12.50, 3),
    ('Frango', 'Cheddar', 0, 10.50, 4),
    ('Brigadeiro', 'Catupiry', 1, 12.50, 5);
    
SELECT * FROM tb_pizza ;

SELECT * FROM tb_pizza WHERE valor > 45.00 ; 

SELECT * FROM tb_pizza WHERE valor BETWEEN > 28.00 AND valor < 60.00 ;

SELECT * FROM tb_pizza WHERE sabor LIKE 'c%' ;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).

SELECT tb_pizza.sabor AS "Pizza", tb_pizza.valor AS "Preço" , tb_categoria.tipo_massa AS "Massa", tb_categoria.tamanho AS "Tamanho" FROM tb_pizza
INNER JOIN tb_categoria ON tb_categoria.id = tb_pizza.fk_categoria_id
WHERE tb_categoria.tipo_massa = 'Fina';




 

    
    
