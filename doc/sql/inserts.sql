USE f1_db;

INSERT INTO pilotos (id, nombre, edad, id_equipo, textoImagen)
VALUES (1, 'Alonso', 22, 1, "");

INSERT INTO pilotos (id, nombre, edad, id_equipo, textoImagen)
VALUES (2, 'Hamilton', 23, 2, "");

INSERT INTO pilotos (id, nombre, edad, id_equipo, textoImagen)
VALUES (3, 'Verstappen', 42, 6, "");

INSERT INTO pilotos (id, nombre, edad, id_equipo, textoImagen)
VALUES (4, 'Leclerc', 34, 4, "");

INSERT INTO pilotos (id, nombre, edad, id_equipo, textoImagen)
VALUES (5, 'Bottas', 36, 3, "");

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen)
VALUES (1, 'Red Bull Racing', 'Dietrich Mateschitz', 'Austriaca', 'Compró el equipo Jaguar en 2004 y debutó en F1 en 2005', '6 Títulos de Constructores y 7 de Pilotos', '');

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen)
VALUES (2, 'Mercedes-AMG', 'Gottlieb Daimler y Carl Benz', 'Alemana', 'Regresó como equipo integral en 2010 tras comprar Brawn GP', '8 Títulos de Constructores y 9 de Pilotos', '');

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen)
VALUES (3, 'Ferrari', 'Enzo Ferrari', 'Italiana', 'Único equipo presente en todas las temporadas desde 1950', '16 Títulos de Constructores y 15 de Pilotos', '');

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen)
VALUES (4, 'McLaren', 'Bruce McLaren', 'Británica', 'Fundado en 1963, debutó en el GP de Mónaco de 1966', '8 Títulos de Constructores y 12 de Pilotos', '');

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen)
VALUES (5, 'Alpine (Renault)', 'Louis Renault', 'Francesa', 'Debutó en 1977 introduciendo el motor turbo en la F1', '2 Títulos de Constructores y 2 de Pilotos (como Renault)', '');
