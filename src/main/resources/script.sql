CREATE TABLE movies (
                        id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        Title VARCHAR(50),
                        Runtime INT,
                        Genre VARCHAR(50),
                        IMDBScore FLOAT,
                        Rating VARCHAR(10));

INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Howard the Duck', 110, 'Sci-fi',4.6,'PG');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Lavantula', 83, 'Horror',4.7,'TV-14');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Starship Troopers', 129, 'Sci-fi',7.2,'PG-13');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Waltz With Bashir', 90, 'Documentary',8.0,'R');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Spaceballs', 96, 'Comedy',7.1,'PG');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Monsters Inc.', 92, 'Animation',8.1,'G');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Monsters Ball', 112, 'Drama',8.6,'R');
INSERT INTO movies (Title, Runtime, Genre, IMDBScore, Rating) VALUES ('Ant Man', 97, 'Action',8.9,'PG-13');

SELECT * FROM movies WHERE Genre='Sci-fi';
SELECT * FROM movies WHERE IMDBScore >= 6.5;
SELECT * FROM movies WHERE Runtime < 100 AND Rating IN ('G','PG');
SELECT Genre, AVG(Runtime) FROM movies WHERE IMDBScore < 7.5 GROUP BY Genre;
UPDATE movies SET Rating = 'R' WHERE Title='Starship Troopers';
SELECT (id, Rating) FROM movies WHERE Genre IN ('Horror','Documentary');
SELECT Genre, MIN(IMDBScore), MAX(IMDBScore), AVG(IMDBScore) FROM movies GROUP BY Genre;
SELECT Genre, MIN(IMDBScore), MAX(IMDBScore), AVG(IMDBScore) FROM movies GROUP BY Genre HAVING COUNT(*) >1;
DELETE FROM movies WHERE Rating='R';