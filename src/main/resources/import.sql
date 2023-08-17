-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into cadeira (id,cor,modelo,material)
values ( 1, 'branca' , '1759' , 'plastico');


insert into cadeira (id,cor,modelo,material)
values (2,'preta' , '1911' , 'ferro');

insert into cadeira (id,cor,modelo,material)
values (3,'marrom' , '2012' , 'plastico ruim');
