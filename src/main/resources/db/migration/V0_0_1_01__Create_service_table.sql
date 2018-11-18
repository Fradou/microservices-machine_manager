CREATE TABLE `microservices__machine_manager`.`t_services_srv` (
  `srv_id` INT NOT NULL AUTO_INCREMENT,
  `srv_name` VARCHAR(45) NULL,
  PRIMARY KEY (`srv_id`),
  UNIQUE INDEX `idx_uk_name` (`srv_name` ASC) VISIBLE);