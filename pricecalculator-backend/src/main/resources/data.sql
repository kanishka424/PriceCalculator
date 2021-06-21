
   insert into item (item_id,carton_price, discount, item_code, item_name, min_cartons_for_discount, num_of_units_per_carton, single_unit_price_increase)
    values ( 1,175, 0.1, 'PE', 'Penguine Ears', 3, 20, 0.3);
  insert into item(item_id, carton_price, discount, item_code, item_name, min_cartons_for_discount, num_of_units_per_carton, single_unit_price_increase)
  values ( 2,825, 0.1, 'HS', 'Horse Shoes', 3, 5, 0.3);



--    INSERT INTO `price_calculator_db`.`item` (`item_id`, `carton_price`, `discount`, `item_code`, `item_name`, `min_cartons_for_discount`, `num_of_units_per_carton`, `single_unit_price_increase`) VALUES ('1', '175', '0.1', 'PE', 'Penguine Ears', '3', '20', '0.3');
--        INSERT INTO `price_calculator_db`.`item` (`item_id`, `carton_price`, `discount`, `item_code`, `item_name`, `min_cartons_for_discount`, `num_of_units_per_carton`, `single_unit_price_increase`) VALUES ('2', '825', '0.1', 'HS', 'Horse Shoes', '3', '5', '0.3');



--CREATE TABLE item (
--  item_code varchar(255) NOT NULL,
--  carton_price double NOT NULL,
--  discount double NOT NULL,
--  item_id bigint NOT NULL,
--  item_name varchar(255) DEFAULT NULL,
--  min_cartons_for_discount int NOT NULL,
--  num_of_units_per_carton int NOT NULL,
--  single_unit_price_increase double NOT NULL,
--  PRIMARY KEY (item_code)
--)
--SELECT * FROM item;


