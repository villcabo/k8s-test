

-- SQLSERVER
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
