USE f1_db;

DROP TABLE IF EXISTS pilotos;
CREATE TABLE pilotos (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255) NOT NULL,
    edad int NOT NULL,
    id_equipo int NOT NULL,
    textoImagen  varchar(255),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS equipos;
CREATE TABLE equipos (
    id int NOT NULL AUTO_INCREMENT,
    nombre varchar(255) NOT NULL,
    fundador varchar(255) NOT NULL,
    nacionalidad varchar(255) NOT NULL,
    origen varchar(255) NOT NULL,
    exitos varchar(255) NOT NULL,
    textoImagen  varchar(255),
    PRIMARY KEY (id)
);
