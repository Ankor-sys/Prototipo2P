CREATE DATABASE sin;
USE sin;

CREATE TABLE puesto (
	codigo_puesto VARCHAR(5) PRIMARY KEY,
    nombre_puesto VARCHAR(60),
    estatus_puesto VARCHAR(1)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE departamento (
	codigo_departamento VARCHAR(5) PRIMARY KEY,
    nombre_departamento VARCHAR(80),
    estatus_departamento VARCHAR(1)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE concepto (
	codigo_concepto VARCHAR(5) PRIMARY KEY,
    nombre_concepto VARCHAR(60),
    efecto_concepto VARCHAR(1),
    estatus_concepto VARCHAR(1)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE empleado (
    codigo_empleado VARCHAR(5) PRIMARY KEY,
    nombre_empleado VARCHAR(60),
    codigo_puesto VARCHAR(5),
    codigo_departamento VARCHAR(5),
    sueldo_empleado FLOAT(10,2),
    estatus_empleado VARCHAR(1),
    FOREIGN KEY (codigo_puesto) REFERENCES puesto (codigo_puesto),
    FOREIGN KEY (codigo_departamento) REFERENCES departamento (codigo_departamento)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE nominaE (
    codigo_nomina VARCHAR(5) PRIMARY KEY,
    fecha_inicial_nomina DATE,
    fecha_final_nomina DATE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE nominaD (
	codigo_nomina VARCHAR(5),
    codigo_empleado VARCHAR(5),
    codigo_concepto VARCHAR(5),
    valor_nominaD FLOAT(10,2),
    PRIMARY KEY (codigo_nomina, codigo_empleado, codigo_concepto),
    CONSTRAINT FK_conceptonominaD FOREIGN KEY (codigo_concepto) REFERENCES concepto (codigo_concepto),
    CONSTRAINT FK_nominaEnominaD FOREIGN KEY (codigo_nomina) REFERENCES nominaE (codigo_nomina),
    CONSTRAINT FK_empleadonominaD FOREIGN KEY (codigo_empleado) REFERENCES empleado (codigo_empleado)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE percepciones(
codigo_percepcion int primary key auto_increment,
codigo_empleado varchar(5),
total_percepcion float,
FOREIGN KEY (codigo_empleado) REFERENCES empleado (codigo_empleado)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE deducciones(
codigo_deduccion int primary key auto_increment,
codigo_empleado varchar(5),
total_deduccion float,
FOREIGN KEY (codigo_empleado) REFERENCES empleado (codigo_empleado)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE totales(
codigo_totales int primary key auto_increment,
codigo_empleado varchar(5),
total float,
FOREIGN KEY (codigo_empleado) REFERENCES empleado (codigo_empleado))ENGINE=InnoDB DEFAULT CHARSET=latin1;


SELECT * FROM puesto;
SELECT * FROM departamento;
SELECT * FROM empleado;	
SELECT * FROM percepciones;
SELECT * FROM deducciones;