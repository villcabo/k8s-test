

-- SQLSERVER
CREATE DATABASE "db_security";

CREATE TABLE access(
    userid INT IDENTITY(1,1),
    fullname VARCHAR(255) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    PRIMARY KEY (userid)
);

INSERT INTO access(fullname, username, password)
VALUES('Usuario polyglot1', 'polyglot','123456');
INSERT INTO access(fullname, username, password)
VALUES('Usuario polyglot2', 'polyglot2','654');
INSERT INTO access(fullname, username, password)
VALUES('Usuario polyglot3', 'polyglot3','123');


SELECT * FROM access;

-- PostgreSQL
CREATE DATABASE db_invoice;

CREATE TABLE invoice (
	id_invoice INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	amount DECIMAL,
	state INTEGER
);

INSERT INTO invoice(id_invoice, amount, state) VALUES(1, 200.00, 1);
INSERT INTO invoice(id_invoice, amount, state) VALUES(2, 300.00, 2);
INSERT INTO invoice(id_invoice, amount, state) VALUES(3, 500.00, 2);
INSERT INTO invoice(id_invoice, amount, state) VALUES(4, 480.88, 1);

select  * from invoice;

-- MySQL

CREATE DATABASE db_operation;

CREATE TABLE operation (
id_operation INT AUTO_INCREMENT PRIMARY KEY,
id_invoice INT,
amount DECIMAL,
date TIMESTAMP
);