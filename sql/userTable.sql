CREATE TABLE `crud_spring`.`users`
(
    `id`       INT          NOT NULL AUTO_INCREMENT,
    `email`    VARCHAR(100) NOT NULL,
    `name`     VARCHAR(45)  NOT NULL,
    `lastName` VARCHAR(45)  NOT NULL,
    `age`      TINYINT(3)  NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
)
    DEFAULT CHARACTER SET = utf8;
