CREATE SEQUENCE computadores_sequence INCREMENT 1 MINVALUE 1 START 1 CACHE 1;

CREATE TABLE computadores
(
    id    INT            NOT NULL DEFAULT NEXTVAL('computadores_sequence') PRIMARY KEY,
    nome  VARCHAR(40)    NOT NULL,
    preco NUMERIC(10, 2) NOT NULL
);

INSERT INTO computadores (nome, preco) VALUES ('Computador Gamer 1: AD Astra', 23000);
INSERT INTO computadores (nome, preco) VALUES ('Computador Gamer 2: Tempest', 12000);
INSERT INTO computadores (nome, preco) VALUES ('Computador Gamer 3: Atlas', 11500);
INSERT INTO computadores (nome, preco) VALUES ('Computador Gamer 4: Heavy', 13600);