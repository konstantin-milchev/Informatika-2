DROP TABLE IF EXISTS participate;
DROP TABLE IF EXISTS require;
DROP TABLE IF EXISTS examines;
DROP TABLE IF EXISTS Course;
DROP TABLE IF EXISTS Student;
DROP TABLE IF EXISTS Assistant;
DROP TABLE IF EXISTS Professor;

CREATE TABLE Student
       (matriculationNumber         INTEGER PRIMARY KEY,
        name           VARCHAR(30) NOT NULL,
        semester       INTEGER);

CREATE TABLE Professor
       (personalNumber	INTEGER PRIMARY KEY,
        name          	VARCHAR(30) NOT NULL,
        rank          	CHAR(2) CHECK (rank in ('C2', 'C3', 'C4')),
        room          	INTEGER UNIQUE);

CREATE TABLE Assistant
       (personalNumber 	INTEGER PRIMARY KEY,
        name           	VARCHAR(30) NOT NULL,
        subject     	VARCHAR(30),
        boss           	INTEGER,
        FOREIGN KEY    	(boss) REFERENCES Professor);

CREATE TABLE Course
       (courseNumber	INTEGER PRIMARY KEY,
        title          	VARCHAR(30),
        sws            	INTEGER,
        taughtBy     	INTEGER REFERENCES Professor);

CREATE TABLE participate
       (matriculationNumber	INTEGER REFERENCES Student ON DELETE CASCADE,
        courseNumber     	INTEGER REFERENCES Course ON DELETE CASCADE,
        PRIMARY KEY    		(matriculationNumber, courseNumber));

CREATE TABLE require
       (predecessor 	INTEGER REFERENCES Course ON DELETE CASCADE,
        successor    	INTEGER REFERENCES Course ON DELETE NO ACTION,
        PRIMARY KEY   	(predecessor, successor));

CREATE TABLE examines
       (matriculationNumber INTEGER REFERENCES Student ON DELETE CASCADE,
        courseNumber        INTEGER REFERENCES Course,
        personalNumber      INTEGER REFERENCES Professor,
        grade          		NUMERIC(2,1) CHECK (grade between 0.7 and 5.0),
        PRIMARY KEY    		(matriculationNumber, courseNumber));


INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (24002, 'Xenokrates', 18); 
 
INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (25403, 'Jonas', 12); 
 
INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (26120, 'Fichte', 10); 

INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (26830, 'Aristoxenos', 8); 
 
INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (27550, 'Schopenhauer', 6); 

INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (28106, 'Carnap', 3); 
 
INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (29120, 'Theophrastos', 2); 
 
INSERT INTO Student(matriculationNumber, name, semester) 
VALUES (29555, 'Feuerbach', 2); 
 


INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2125, 'Sokrates', 'C4', 226); 

INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2126, 'Russel', 'C4', 232);  
 
INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2127, 'Kopernikus', 'C3', 310); 
 
INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2133, 'Popper', 'C3', 052); 
 
INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2134, 'Augustinus', 'C3', 309); 
 
INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2136, 'Curie', 'C4', 036); 
 
INSERT INTO Professor(personalNumber, name, rank, room) 
VALUES (2137, 'Kant', 'C4', 007); 
 
 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3002, 'Platon', 'Ideenlehre', 2125); 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3003, 'Aristoteles', 'Syllogistik', 2125); 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3004, 'Wittgenstein', 'Sprachtheorie', 2126); 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3005, 'Rhetikus', 'Planetenbewegung', 2127); 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3006, 'Newton', 'Keplersche Gesetze', 2127); 
 
INSERT INTO Assistant(personalNumber, name, subject, boss) 
VALUES (3007, 'Spinoza', 'Gott und Natur', 2134); 


 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5001, 'Grundzuege', 4, 2137);

INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5041, 'Ethik', 4, 2125);
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5043, 'Erkenntnistheorie', 3, 2126);
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5049, 'Maeeutik', 2, 2125);
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (4052, 'Logik', 4, 2125);
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5052, 'Wissenschaftstheorie', 3, 2126); 
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5216, 'Bioethik', 2, 2126); 
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5259, 'Der Wiener Kreis', 2, 2133); 
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (5022, 'Glaube und Wissen', 2, 2134); 
 
INSERT INTO Course(courseNumber, title, sws, taughtBy) 
VALUES (4630, 'Die 3 Kritiken', 4, 2137); 


 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (26120, 5001); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (27550, 5001); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (27550, 4052); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (28106, 5041); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (28106, 5052); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (28106, 5216); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (28106, 5259); 
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (29120, 5001); 

INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (29120, 5041); 

INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (29120, 5049); 

INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (29555, 5022); 

INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (25403, 5022);  
 
INSERT INTO participate(matriculationNumber, courseNumber) 
VALUES (29555, 5001);  
 
 
 
INSERT INTO require(predecessor, successor) 
VALUES (5001, 5041); 
 
INSERT INTO require(predecessor, successor) 
VALUES (5001, 5043); 
 
INSERT INTO require(predecessor, successor) 
VALUES (5001, 5049); 
 
INSERT INTO require(predecessor, successor) 
VALUES (5041, 5216);  

INSERT INTO require(predecessor, successor) 
VALUES (5043, 5052);  

INSERT INTO require(predecessor, successor) 
VALUES (5041, 5052); 
 
INSERT INTO require(predecessor, successor) 
VALUES (5052, 5259); 
 


INSERT INTO examines(matriculationNumber, courseNumber, personalNumber, grade) 
VALUES (28106, 5001, 2126, 1.0);

INSERT INTO examines(matriculationNumber, courseNumber, personalNumber, grade) 
VALUES (25403, 5041, 2125, 2.0);

INSERT INTO examines(matriculationNumber, courseNumber, personalNumber, grade) 
VALUES (27550, 4630, 2137, 2.0);
