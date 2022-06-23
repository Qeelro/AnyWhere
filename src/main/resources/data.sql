CREATE TABLE users (
    id INTEGER NOT NULL AUTO_INCREMENT,
    nickName VARCHAR(15) NOT NULL,
    email VARCHAR NOT NULL,
    password VARCHAR(64) NOT NULL,
    role VARCHAR NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO users VALUES (3, 'AL', 'das@wsad.pl', 'dadadada', 'user');
INSERT INTO users VALUES (2, 'ALa', 'das@wsad.pl', 'dadadada', 'user');
INSERT INTO users VALUES (4, 'ALa', 'das@wsad.pl', 'dadadada', 'user');