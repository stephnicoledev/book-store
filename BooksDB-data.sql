BEGIN TRANSACTION;

DROP TABLE IF EXISTS book_author, book, author CASCADE;

CREATE TABLE author(
	author_id serial,
	name varchar(40) NOT NULL,
	CONSTRAINT PK_author PRIMARY KEY(author_id)
);

CREATE TABLE book(
	book_id serial,
	title varchar(200) NOT NULL,
	star_rating decimal(2, 1) NOT NULL,
	synopsis varchar(800) NOT NULL,
	genre varchar(100) NOT NULL,
	num_of_pages int NOT NULL,
	published_date date NOT NULL,
	CONSTRAINT PK_book PRIMARY KEY(book_id),
	CONSTRAINT CK_star_rating CHECK (star_rating >= 0.0 AND star_rating <= 5.0)
);

CREATE TABLE book_author(
	book_id int NOT NULL,
	author_id int NOT NULL,
	CONSTRAINT PK_book_author PRIMARY KEY(book_id, author_id),
    CONSTRAINT FK_book_author_book_id FOREIGN KEY(book_id) REFERENCES book(book_id),
	CONSTRAINT FK_book_author_author_id FOREIGN KEY(author_id) REFERENCES author(author_id)
);

-- 3 people for authors
INSERT INTO author (name) VALUES
('Michelle Zauner'), ('Rebecca Yarros'), ('Charmaine Wilkerson');

-- 3 books
INSERT INTO book (title, star_rating, synopsis, genre, num_of_pages, published_date) VALUES
('Crying in H Mart', 4.3, 'A memoir about growing up Korean American, losing her mother, and forging her own identity.', 'memoir', 256, '2021-04-20'),
('Fourth Wing', 4.7, 'Twenty-year-old Violet Sorrengail was supposed to enter the Scribe Quadrant, living a quiet life among books and history. Now, the commanding general—also known as her tough-as-talons mother—has ordered Violet to join the hundreds of candidates striving to become the elite of Navarre: dragon riders.', 'fantasy', 528, '2023-05-02'),
('Black Cake', 4.1, 'Charmaine Wilkerson’s debut novel is a story of how the inheritance of betrayals, secrets, memories, and even names can shape relationships and history.', 'fiction', 385, '2022-02-01');

INSERT INTO book_author (book_id, author_id) VALUES
(1, 1),
(2, 2),
(3, 3);

COMMIT;