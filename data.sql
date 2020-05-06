CREATE SCHEMA `to-do-db` ;

create table list_to_do(
   id INT AUTO_INCREMENT,
   task VARCHAR(100) NOT NULL,
   comments VARCHAR(100) NOT NULL,
   completion_date DATE,
   PRIMARY KEY ( id )
);

INSERT INTO `to-do-db`.`list_to_do`
(`id`,
`task`,
`comments`,
`completion_date`)
VALUES
(1,
'Buy Veggies',
'Carrot, Potato, Tomato',
'2020-05-08');

SELECT * FROM  `to-do-db`.`list_to_do`;
