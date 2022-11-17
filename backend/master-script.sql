SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM DEPARTMENT;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO DEPARTMENT
    VALUES
      (1, "Concessions"),
      (2, "Usher"),
      (3, "Management"),
      (4, "IT"),
      (5, "Human Resources"),
      (6, "Cashier"),
      (7, "Bartender"),
      (8, "Kitchen"),
      (9, "Janitorial"),
	  (10, "Film Operator");

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM EMPLOYEE;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO EMPLOYEE
    VALUES
      (612271202, 3, null, "Aristotle", "Bruce", "1972-6-12"),
	  (368614494, 1, 612271202, "Zorita","Jensen","1976-3-22"),
      (827108436, 2, 612271202, "Thaddeus", "Ramirez","1992-8-08"),
	  (634618986, 4, null, "Shad", "Buck", "1997-10-07"),
      (888254800, 5, 634618986,"Cheryl", "Daniel", "1989-5-26"),
      (878222139, 5, 634618986,"Steel", "Hickman","1976-2-17"),
      (628901206, 6, 634618986,"Basia", "Bullock","1995-6-01"),
      (416169515, 7, 634618986,"Orlando", "Cash","1999-4-05"),
      (991449253, 6, 634618986,"Brennan", "Watson","1992-9-25"),
      (328102609, 8, 634618986,"Dalton", "Frazier", "1981-1-10");

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM THEATRE_HALL;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO THEATRE_HALL
    VALUES
      (1, 229, 1),
      (2, 142, 0),
      (3, 34, 0),
      (4, 67, 1),
      (5, 127, 1),
      (6, 269, 0),
      (7, 298, 1),
      (8, 113, 1),
      (9, 134, 0),
      (10, 176, 0);

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM TICKET;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO TICKET
    VALUES
      (101, 1, 827108436, "TOP GUN: MAVERICK", "2022-12-01", "D3", 11.99, 0),
      (102, 2, 416169515, "Rebel Of The Vacuum", "2021-03-09", "B6", 11.99, 0),
      (103, 2, 368614494, "Rebel Of The Vacuum", "2021-09-27", "L5", 11.99, 0),
      (104, 3, 368614494, "Leaders In The Future", "2022-12-01", "C6", 11.99, 0),
      (105, 4, 827108436, "Defenders Of Life", "2021-04-14", "V2", 10.99, 0),
      (106, 5, 328102609, "Clones And Soldiers", "2021-10-15", "A2", 13.99, 0),
      (107, 6, 416169515, "Commanders And Medics", "2022-12-23", "I3", 10.99, 0),
      (108, 1, 827108436, "TOP GUN: MAVERICK", "2021-12-23", "A7", 11.99, 0),
      (109, 1, 328102609, "TOP GUN: MAVERICK", "2022-12-01", "F2", 14.99, 0),
      (110, 1, 827108436, "TOP GUN: MAVERICK", "2021-04-14", "X0", 14.99, 0);

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM CUSTOMER;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO CUSTOMER
    VALUES
      (101,"D3", null, null, null),
      (102,"B6", null, null, null),
      (103,"L5","molestie.sed@yahoo.couk","(128) 138-3449","Boris Flynn"),
      (104,"C6","sagittis@google.net","(475) 139-4398","Daquan Chan"),
      (105,"V2","ante.maecenas.mi@outlook.edu","1-344-194-2233","Fay Stanton"),
      (106,"A2", null, null, null),
      (107,"I3", null, null, null),
      (108,"A7","ligula.aenean@aol.ca","(736) 631-6613","Ingrid Petersen"),
      (109,"F2","adipiscing.elit@outlook.ca","1-687-238-4328","Hayfa Parker"),
      (110,"X0","mauris.vestibulum.neque@outlook.couk","(651) 581-4883","Clayton Rodgers");

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM FILM;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO FILM
	VALUES
      (999100, 1, "TOP GUN: MAVERICK", "PG13", "2:33:40"),
      (999101, 2, "Rebel Of The Vacuum", "R", "3:15:22"),
      (999102, 6, "Commanders And Medics", "G", "1:25:20"),
	  (999103, 5, "Clones And Soldiers", "PG13", "2:36:00"),
	  (999104, 4, "Defenders Of Life", "R", "2:15:12"),
	  (999105, 3, "Leaders In The Future", "PG", "3:02:12");

SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM SHOWTIMES;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO SHOWTIMES
    VALUES
      (999100, "2023-04-03 22:01:13"),
      (999100, "2022-12-03 09:42:19"),
      (999102, "2022-11-10 17:34:09"),
      (999102, "2022-12-02 22:17:38"),
      (999103, "2022-11-14 14:41:01"),
      (999100, "2022-11-11 18:37:44"),
      (999100, "2022-12-12 20:19:34"),
      (999105, "2023-01-01 23:41:51"),
      (999105, "2021-12-08 21:49:30"),
      (999101, "2023-05-03 06:54:48");