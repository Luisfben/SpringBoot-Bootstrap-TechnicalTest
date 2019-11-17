/* CREATE TABLE */

CREATE TABLE IF NOT EXISTS test.type_institution(
	id_type_institution int NOT NULL,
    name varchar(100) NOT NULL,
    PRIMARY KEY(id_type_institution)
);

CREATE TABLE IF NOT EXISTS test.country(
	id_country int NOT NULL, 
    name varchar(100) NOT NULL,
    PRIMARY KEY(id_country)
);

CREATE TABLE IF NOT EXISTS test.institution(
	id_institution int NOT NULL,
    id_headquarter int NOT NULL, 
    id_type_institution int NOT NULL,
    id_country int NOT NULL,
    acronym varchar(10) NOT NULL,
    name varchar(100) NOT NULL,
    city varchar(50) NOT NULL,
    website varchar(255),
    PRIMARY KEY(id_institution),
    FOREIGN KEY (id_headquarter) REFERENCES institution(id_institution) ON DELETE CASCADE,
    FOREIGN KEY (id_type_institution) REFERENCES type_institution(id_type_institution),
    FOREIGN KEY (id_country) REFERENCES country(id_country)
);

/* INSERT `test`.`type_institution`*/
INSERT INTO `test`.`type_institution`
(`id_type_institution`,
`name`)
VALUES
(1, 
"Academic Institutions");

INSERT INTO `test`.`type_institution`
(`id_type_institution`,
`name`)
VALUES
(2, 
"Donor");

INSERT INTO `test`.`type_institution`
(`id_type_institution`,
`name`)
VALUES
(3, 
"Non-Governmental Organization");

INSERT INTO `test`.`type_institution`
(`id_type_institution`,
`name`)
VALUES
(4, 
"Research Institution");

/* INSERT `test`.`country`*/
INSERT INTO `test`.`country`
(`id_country`,
`name`)
VALUES
(1,
"Colombia");

INSERT INTO `test`.`country`
(`id_country`,
`name`)
VALUES
(2,
"Peru");

INSERT INTO `test`.`country`
(`id_country`,
`name`)
VALUES
(3,
"Ecuador");

INSERT INTO `test`.`country`
(`id_country`,
`name`)
VALUES
(4,
"Venezuela");

INSERT INTO `test`.`country`
(`id_country`,
`name`)
VALUES
(5,
"Brazil");


/* INSERT `test`.`institution`*/
INSERT INTO `test`.`institution`
(`id_institution`,
`id_headquarter`,
`id_type_institution`,
`id_country`,
`acronym`,
`name`,
`city`,
`website`)
VALUES
(1,
1,
3,
1,
"CIAT",
"Centro Internacional de Agricultura Tropical",
"Palmira",
"https://ciat.cgiar.org");

INSERT INTO `test`.`institution`
(`id_institution`,
`id_headquarter`,
`id_type_institution`,
`id_country`,
`acronym`,
`name`,
`city`,
`website`)
VALUES
(2,
1,
2,
2,
"CIP",
"Centro Internacional de la Papa",
"Lima",
"none");

