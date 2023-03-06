CREATE SEQUENCE acessorios_sequence INCREMENT 1 MINVALUE 1 START 1 CACHE 1;

CREATE TABLE acessorios
(
    id    INT            NOT NULL DEFAULT NEXTVAL('acessorios_sequence') PRIMARY KEY,
    nome  VARCHAR(40)    NOT NULL,
    preco NUMERIC(10, 2) NOT NULL
);

INSERT INTO acessorios (nome, preco) VALUES ('Mouse Gamer Delux M700', 185);
INSERT INTO acessorios (nome, preco) VALUES ('Mouse Gamer Redragon Cobra', 116);
INSERT INTO acessorios (nome, preco) VALUES ('Mouse Gamer Logitech G403 Hero', 220);
INSERT INTO acessorios (nome, preco) VALUES ('Mouse Gamer Razer DeathAdder', 200);