SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Java-Project
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Java-Project` ;
CREATE SCHEMA IF NOT EXISTS `Java-Project` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `Java-Project` ;

-- -----------------------------------------------------
-- Table `Java-Project`.`Item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Java-Project`.`Item` (
  `item_id` INT NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(45) NOT NULL,
  `item_quantity` INT NOT NULL,
  `bin_number` INT NOT NULL,
  PRIMARY KEY (`item_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Java-Project`.`Item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Java-Project`.`Item` (
  `item_id` INT NOT NULL AUTO_INCREMENT,
  `item_name` VARCHAR(45) NOT NULL,
  `item_quantity` INT NOT NULL,
  `bin_number` INT NOT NULL,
  PRIMARY KEY (`item_id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
