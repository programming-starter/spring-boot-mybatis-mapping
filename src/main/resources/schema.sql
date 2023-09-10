DROP TABLE IF EXISTS movie;
DROP TABLE IF EXISTS director;
DROP TABLE IF EXISTS genre;
DROP TABLE IF EXISTS movie_genre_relation;

CREATE TABLE movie
(
    movie_id     INT PRIMARY KEY AUTO_INCREMENT,
    title        VARCHAR NOT NULL,
    running_time INT NOT NULL,
    release_date DATE NOT NULL,
    director_id  INT NOT NULL,
    created_at   DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified_at   DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO movie (movie_id, title, running_time, release_date, director_id)
VALUES (1000, '오펜하이머', '180', '2023-08-15', 100);
INSERT INTO movie (movie_id, title, running_time, release_date, director_id)
VALUES (1001, '인셉션', '148', '2010-07-21', 100);
INSERT INTO movie (movie_id, title, running_time, release_date, director_id)
VALUES (1002, '소울', '107', '2021-01-20', 101);

CREATE TABLE director
(
    director_id INT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR NOT NULL,
    birth_date  Date NOT NULL,
    gender      VARCHAR NOT NULL,
    debut_year  INT NOT NULL,
    created_at   DATETIME DEFAULT CURRENT_TIMESTAMP,
    modified_at   DATETIME DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO director (director_id, name, birth_date, gender, debut_year)
VALUES (100, '크리스토퍼 놀란', '1970-07-30', 'MALE', 1989);
INSERT INTO director (director_id, name, birth_date, gender, debut_year)
VALUES (101, '피트 닥터', '1968-10-09', 'MALE', 1988);


CREATE TABLE genre
(
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    name     VARCHAR NOT NULL
);

INSERT INTO genre (genre_id, name) VALUES (1, 'DRAMA');
INSERT INTO genre (genre_id, name) VALUES (2, 'THRILLER');
INSERT INTO genre (genre_id, name) VALUES (3, 'WAR');
INSERT INTO genre (genre_id, name) VALUES (4, 'CRIME');
INSERT INTO genre (genre_id, name) VALUES (5, 'SF');
INSERT INTO genre (genre_id, name) VALUES (6, 'ACTION');
INSERT INTO genre (genre_id, name) VALUES (7, 'ANIMATION');
INSERT INTO genre (genre_id, name) VALUES (8, 'COMEDY');
INSERT INTO genre (genre_id, name) VALUES (9, 'FAMILY');

CREATE TABLE movie_genre_relation
(
    movie_id INT,
    genre_id INT,
    PRIMARY KEY (movie_id, genre_id)
);

INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1000, 1);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1000, 2);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1000, 3);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1001, 4);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1001, 5);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1001, 6);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1002, 7);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1002, 8);
INSERT INTO movie_genre_relation (movie_id, genre_id) VALUES (1002, 9);
