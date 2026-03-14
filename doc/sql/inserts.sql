USE f1_db;

INSERT INTO pilotos (id, nombre, edad, victorias, id_equipo, textoImagen) VALUES
(1, 'Alexander Albon', 29, 0, 5, 'alexander-albon-2026.png'),
(2, 'Arvid Lindblad', 18, 0, 6, 'arvid-lindblad-2026.png'),
(3, 'Carlos Sainz', 31, 4, 5, 'carlos-sainz-2026.png'),
(4, 'Charles Leclerc', 28, 7, 4, 'charles-leclerc-2026.png'),
(5, 'Esteban Ocon', 29, 1, 8, 'esteban-ocon-2026.png'),
(6, 'Fernando Alonso', 44, 32, 7, 'fernando-alonso-2026_0.png'),
(7, 'Franco Colapinto', 22, 0, 10, 'franco-colapinto-2026.png'),
(8, 'Gabriel Bortoleto', 21, 0, 9, 'gabriel-bortoleto-2026.png'),
(9, 'George Russell', 28, 2, 2, 'george-russell-2026.png'),
(10, 'Isack Hadjar', 21, 0, 3, 'isack-hadjar-2026.png'),
(11, 'Kimi Antonelli', 19, 0, 2, 'kimi-antonelli-2026.png'),
(12, 'Lance Stroll', 27, 0, 7, 'lance-stroll-2026.png'),
(13, 'Lando Norris', 26, 3, 1, 'lando-norris-2026_0.png'),
(14, 'Lewis Hamilton', 41, 105, 4, 'lewis-hamilton-2026.png'),
(15, 'Liam Lawson', 24, 0, 6, 'liam-lawson-2026_0.png'),
(16, 'Max Verstappen', 28, 62, 3, 'max-verstappen-2026.png'),
(17, 'Nico Hulkenberg', 38, 0, 9, 'nico-hulkenberg-2026.png'),
(18, 'Oliver Bearman', 20, 0, 8, 'oliver-bearman-2026.png'),
(19, 'Oscar Piastri', 24, 2, 1, 'oscar-piastr-2026.png'),
(20, 'Pierre Gasly', 30, 1, 10, 'pierre-gasly-2026.png'),
(21, 'Sergio Perez', 36, 6, 11, 'sergio-perez-2026.png'),
(22, 'Valtteri Bottas', 36, 10, 11, 'valtteri-bottas-2026.png');

INSERT INTO equipos (id, nombre, fundador, nacionalidad, origen, exitos, textoImagen) VALUES
(1, 'McLaren F1 Team', 'Bruce McLaren', 'Británica', 'Fundado en 1963, es uno de los equipos más antiguos y exitosos.', '8 Títulos de Constructores y 12 de Pilotos', 'logo-mclaren-f1-2021.png'),
(2, 'Mercedes-AMG Petronas', 'Ross Brawn / Mercedes', 'Alemana', 'Compró Brawn GP en 2010 regresando como constructor.', '8 Títulos de Constructores y 9 de Pilotos', 'logo-mercedes-2026.png'),
(3, 'Red Bull Racing', 'Dietrich Mateschitz', 'Austriaca', 'Compró el equipo Jaguar en 2004 y debutó en F1 en 2005', '6 Títulos de Constructores y 7 de Pilotos', 'logo-red-bull-f1-2026.png'),
(4, 'Scuderia Ferrari', 'Enzo Ferrari', 'Italiana', 'Único equipo presente en todas las temporadas desde 1950.', '16 Títulos de Constructores y 15 de Pilotos', 'logo-ferrari-f1-2021.png'),
(5, 'Williams Racing', 'Frank Williams', 'Británica', 'Fundado en 1977, dominó gran parte de los años 80 y 90.', '9 Títulos de Constructores y 7 de Pilotos', 'logo-williams-f1-2026.png'),
(6, 'RB Formula One Team', 'Red Bull GmbH', 'Italiana', 'Antiguo Minardi y Toro Rosso, funciona como equipo filial.', '2 Victorias en Grandes Premios (Vettel y Gasly)', 'visa-rb-soymotor.2024.png'),
(7, 'Aston Martin Aramco', 'Lionel Martin / Lawrence Stroll', 'Británica', 'Evolución de Racing Point y el histórico Jordan Grand Prix.', 'Múltiples podios y 1 pole position', 'logo-ston-martin-2026.png'),
(8, 'Haas F1 Team', 'Gene Haas', 'Estadounidense', 'Debutó en 2016 como el primer equipo americano en décadas.', '1 Pole Position y varios top 5', 'logo-haas-f1-2021.png'),
(9, 'Audi F1 Team', 'Audi AG', 'Alemana', 'Entrada oficial en 2026 tras adquirir el equipo Sauber.', 'Historial legendario en Le Mans y Rally', 'logo-audi-f1-2026.png'),
(10, 'Alpine F1 Team', 'Jean Rédélé', 'Francesa', 'Evolución de Renault F1 y el equipo Benetton.', '2 Títulos de Constructores (como Renault)', 'logo-alpine-f1-2021.png'),
(11, 'Cadillac F1 Team', 'Michael Andretti / GM', 'Estadounidense', 'Nuevo equipo que se incorpora a la parrilla en 2026.', 'Nuevo ingreso en la categoría', 'logo-cadillac-f1-2026.png');
