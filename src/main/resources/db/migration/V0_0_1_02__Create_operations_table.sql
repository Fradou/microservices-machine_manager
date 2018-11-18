CREATE TABLE `microservices__machine_manager`.`t_operations_ope` (
  `ope_id` INT NOT NULL AUTO_INCREMENT,
  `srv_id` INT NOT NULL,
  `ope_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`ope_id`),
  INDEX `srv_id_idx` (`srv_id` ASC) VISIBLE,
  CONSTRAINT `srv_id`
    FOREIGN KEY (`srv_id`)
    REFERENCES `microservices__machine_manager`.`t_services_srv` (`srv_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);