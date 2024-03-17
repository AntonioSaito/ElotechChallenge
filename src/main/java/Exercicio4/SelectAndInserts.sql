SELECT * FROM cliente
SELECT * FROM compra
SELECT * FROM produto
SELECT * FROM itemcompra


INSERT INTO CLIENTE (NOME, ATIVO)
VALUES
	('Pedro', 'S'),
    ('Gabriel', 'S'),
    ('Juliana', 'S'),
	('Maria', 'N'),
	('Neymar', 'S'),
	('Gustavo', 'S'),
	('Andressa', 'N');

INSERT INTO COMPRA (IDCLIENTE, DATACOMPRA)
VALUES
	(3, '2018-09-14'),
	(5, '2018-11-17'),
	(6, '2022-01-23'),
	(1, '2021-08-25'),
	(7, '2023-12-13'),
	(5, '2021-11-16'),
	(1, '2015-08-13'),
	(3, '2018-01-05'),
	(4, '2022-07-10'),
	(6, '2021-07-03'),
	(7, '2021-04-22'),
	(1, '2024-06-25'),
	(2, '2017-03-28'),
	(1, '2019-01-15'),
	(1, '2017-08-16'),
	(7, '2018-04-09');


INSERT INTO PRODUTO (DESCRICAO, VALORUNITARIO, UNIDADE)
VALUES
    ('Caneta', 2.00, 'Un'),
    ('Lapis', 1.50, 'Un'),
	('Caderno', 21.00, 'Un'),
	('Mochila', 65.00, 'Un'),
    ('Borracha', 4.75, 'Un');

INSERT INTO ITEMCOMPRA (IDPRODUTO, IDCOMPRA, QUANTIDADE) VALUES
    (1, 1, 2),
    (2, 1, 1),
	(2, 3, 11),
	(2, 5, 5),
	(4, 2, 1),
	(4, 1, 12),
	(5, 16, 3),
	(2, 5, 5),
	(2, 12, 1),
	(3, 13, 5),
	(2, 14, 4),
	(1, 11, 4),
	(2, 12, 2),
	(5, 13, 1),
	(4, 2, 3),
    (4, 2, 1),
	(1, 3, 2),
    (4, 5, 5),
	(3, 4, 7),
	(1, 8, 9),
	(5, 5, 1),
	(1, 6, 5),
	(4, 7, 8),
	(1, 8, 3),
	(5, 9, 8),
	(5, 10, 1),
	(5, 11, 3),
	(5, 12, 6),
	(4, 13, 7),
	(1, 14, 10),
	(5, 15, 2),
    (2, 1, 3);