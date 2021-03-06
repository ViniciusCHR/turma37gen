-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`temas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`temas` (
  `id_temas` BIGINT NOT NULL,
  `descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id_temas`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `id_usuario` BIGINT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `usuario` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Postagens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Postagens` (
  `temas_id_temas` BIGINT NOT NULL,
  `Usuario_id_usuario` BIGINT NOT NULL,
  `id_postagens` BIGINT NOT NULL,
  `titulo` VARCHAR(255) NOT NULL,
  `texto` VARCHAR(1000) NOT NULL,
  `data` TIMESTAMP NOT NULL,
  PRIMARY KEY (`temas_id_temas`, `Usuario_id_usuario`, `id_postagens`),
  INDEX `fk_temas_has_Usuario_Usuario1_idx` (`Usuario_id_usuario` ASC) VISIBLE,
  INDEX `fk_temas_has_Usuario_temas_idx` (`temas_id_temas` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
