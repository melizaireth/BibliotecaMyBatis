CREATE DATABASE `biblioteca` /*!40100 DEFAULT CHARACTER SET utf8 */;
CREATE TABLE `cliente` (
  `dni` varchar(100) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `primer_apellido` varchar(45) DEFAULT NULL,
  `segundo_apellido` varchar(45) NOT NULL,
  `email` varchar(100) NOT NULL,
  `movil` varchar(50) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `libro` (
  `isbn` varchar(45) NOT NULL,
  `nombre_libro` varchar(45) NOT NULL,
  `autor` varchar(45) DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `categoria` varchar(45) NOT NULL,
  `total_copias` int(11) DEFAULT '1',
  `pestamos` int(11) DEFAULT '0',
  PRIMARY KEY (`isbn`),
  UNIQUE KEY `isbn_UNIQUE` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `reserva` (
  `penalizacion` int(11) DEFAULT NULL,
  `fecha_solicitud` date DEFAULT NULL,
  `fecha_devolucion` date DEFAULT NULL,
  `dni` varchar(45) NOT NULL,
  `isbn_libro` varchar(45) DEFAULT NULL,
  KEY `dni_idx` (`dni`),
  KEY `isbn_idx` (`isbn_libro`),
  CONSTRAINT `dni` FOREIGN KEY (`dni`) REFERENCES `cliente` (`dni`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `isbn` FOREIGN KEY (`isbn_libro`) REFERENCES `libro` (`isbn`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
