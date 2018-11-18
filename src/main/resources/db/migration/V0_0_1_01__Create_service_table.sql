CREATE TABLE t_services_srv (
  `srv_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`srv_id`),
  UNIQUE INDEX `idx_uk_name` (`name` ASC) VISIBLE);