--A)
SELECT
	CPA.id AS ID_COMPRA,
	CPA.datacompra,
	CLI.nome
FROM
    COMPRA CPA
JOIN
    CLIENTE CLI
ON
    CLI.id = CPA.idcliente
WHERE
    CLI.nome = 'Pedro';

------------------------------------------------------------------------------------------------

--B)
SELECT
	CPA.id AS ID_COMPRA,
	CPA.datacompra,
	CLI.nome
FROM
    COMPRA CPA
JOIN
    CLIENTE CLI
ON
    CLI.id = CPA.idcliente
WHERE
    DATE_PART('YEAR', CPA.datacompra) = '2018'

------------------------------------------------------------------------------------------------

--c)
SELECT
	IDCOMPRA,
	COUNT(IDCOMPRA) AS qtde_produtos
FROM
	ITEMCOMPRA
GROUP BY
IDCOMPRA
HAVING COUNT(IDCOMPRA) > 1
order by idcompra

------------------------------------------------------------------------------------------------

--d)
SELECT
	*
FROM PRODUTO P
JOIN ITEMCOMPRA IC
ON IC.idproduto = P.id
JOIN COMPRA COP
ON COP.id = IC.idcompra
JOIN CLIENTE C
ON C.id = COP.idcliente
WHERE NOT EXISTS (
    SELECT 1
    FROM COMPRA C
    JOIN ITEMCOMPRA IC
	ON C.ID = IC.IDCOMPRA
    WHERE IC.IDPRODUTO = P.ID
    AND DATE_PART('YEAR', C.DATACOMPRA) = 2018
);