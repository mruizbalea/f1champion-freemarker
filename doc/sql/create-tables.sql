USE f1_db;


DROP TABLE IF EXISTS usuarios;


CREATE TABLE usuarios (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    rol int(1) DEFAULT 0,
    creado datetime DEFAULT NULL,
    modificado datetime DEFAULT NULL,
    PRIMARY KEY (id)
);