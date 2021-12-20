-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema samsokv
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema samsokv
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `samsokv` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `samsokv` ;

-- -----------------------------------------------------
-- Table `samsokv`.`parti`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `samsokv`.`parti` (
                                                 `id` INT NOT NULL AUTO_INCREMENT,
                                                 `partinavn` VARCHAR(45) NOT NULL,
    `partibogstav` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 7
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `samsokv`.`kandidat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `samsokv`.`kandidat` (
                                                    `id` INT NOT NULL AUTO_INCREMENT,
                                                    `navn` VARCHAR(90) NOT NULL,
    `parti_id` INT NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_kandidat_parti_idx` (`parti_id` ASC) VISIBLE,
    CONSTRAINT `fk_kandidat_parti`
    FOREIGN KEY (`parti_id`)
    REFERENCES `samsokv`.`parti` (`id`))
    ENGINE = InnoDB
    AUTO_INCREMENT = 48
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
