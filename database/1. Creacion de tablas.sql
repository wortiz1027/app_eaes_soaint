----------------------------------------
--Tabla ROL
CREATE TABLE rol
( id_rol varchar2(20) NOT NULL,
  nombre varchar2(50) NOT NULL,
  descripcion varchar2(50),
  CONSTRAINT rol_pk PRIMARY KEY (id_rol)
);

--Tabla VACANTE
CREATE TABLE vacante
( id_vacante varchar2(20) NOT NULL,
  nombre varchar2(50),
  estado varchar2(20),
  descripcion varchar2(100),
  CONSTRAINT vacante_pk PRIMARY KEY (id_vacante)
);

--Tabla CANDIDATO
CREATE TABLE candidato
( id_candidato varchar2(20) NOT NULL,
  primer_nombre varchar2(20) NOT NULL,
  segundo_nombre varchar2(20),
  primer_apellido varchar2(20) NOT NULL,
  segundo_apellido varchar2(20),
  tipo_identificacion varchar2(2) NOT NULL,
  numero_identificacion varchar2(20) NOT NULL,
  email varchar2(20),
  telefono varchar2(20),
  fecha_nacimiento DATE NOT NULL,
  CONSTRAINT candidato_pk PRIMARY KEY (id_candidato)
);

--Tabla Colaborador
CREATE TABLE colaborador
( id_colaborador varchar2(20) NOT NULL,
  id_rol varchar2(20),
  primer_nombre varchar2(20) NOT NULL,
  segundo_nombre varchar2(20),
  primer_apellido varchar2(20) NOT NULL,
  segundo_apellido varchar2(20),
  email varchar2(20),
  telefono varchar2(20),
  CONSTRAINT colaborador_pk PRIMARY KEY (id_colaborador),
  CONSTRAINT fk_rol_colaborador
    FOREIGN KEY (id_rol)
    REFERENCES rol(id_rol)
);

--Tabla CURRICULUM
CREATE TABLE curriculum
( id_curriculum varchar2(20) NOT NULL,
  id_candidato varchar2(20),
  id_documento varchar2(20) NOT NULL,
  nivel_academico varchar2(20),
  titulo_academico varchar2(20),
  CONSTRAINT curriculum_pk PRIMARY KEY (id_curriculum),
  CONSTRAINT fk_candidato_curriculum
    FOREIGN KEY (id_candidato)
    REFERENCES candidato(id_candidato)
);

--Tabla ENTREVISTA
CREATE TABLE entrevista
( id_entrevista varchar2(20),
  id_curriculum varchar2(20) NOT NULL,
  id_colaborador varchar2(20),
  id_vacante varchar2(20) NOT NULL,
  fecha_realizacion DATE,
  resultado varchar2(20),
  fecha_emision_resultado DATE,
  observaciones varchar2(100),
  CONSTRAINT entrevista_pk PRIMARY KEY (id_entrevista),
  CONSTRAINT fk_entrevista_curriculum
    FOREIGN KEY (id_curriculum)
    REFERENCES curriculum(id_curriculum),
  CONSTRAINT fk_entrevista_colaborador
    FOREIGN KEY (id_colaborador)
    REFERENCES colaborador(id_colaborador),
  CONSTRAINT fk_entrevista_vacante
    FOREIGN KEY (id_vacante)
    REFERENCES vacante(id_vacante)
);

--Tabla PROTOTIPO
CREATE TABLE prototipo
( id_prototipo varchar2(20) NOT NULL,
  titulo varchar2(50) NOT NULL,
  fecha_inicio DATE,
  fecha_cierre DATE,
  detalle varchar2(2000),
  estado varchar2(20),
  CONSTRAINT prototipo_pk PRIMARY KEY (id_prototipo)
);

--Tabla FASE
CREATE TABLE fase
( id_fase varchar2(20),
  id_prototipo varchar2(20),
  fecha_inicio DATE,
  fecha_fin DATE,
  CONSTRAINT fase_pk PRIMARY KEY (id_fase),
  CONSTRAINT fk_fase_prototipo
    FOREIGN KEY (id_prototipo)
    REFERENCES prototipo(id_prototipo)
);

--Tabla RECOMENDACION
CREATE TABLE recomendacion
( id_recomendacion varchar2(20),
  id_prototipo varchar2(20),
  observacion varchar2(2000),
  CONSTRAINT recomendacion_pk PRIMARY KEY (id_recomendacion),
  CONSTRAINT fk_recomendacion_prototipo
    FOREIGN KEY (id_prototipo)
    REFERENCES prototipo(id_prototipo)
);

--Tabla PROBLEMA
CREATE TABLE problema
( id_problema varchar2(20),
  id_prototipo varchar2(20),
  fecha_incidencia DATE,
  observacion varchar2(2000),
  CONSTRAINT problema_pk PRIMARY KEY (id_problema),
  CONSTRAINT fk_problema_prototipo
    FOREIGN KEY (id_prototipo)
    REFERENCES prototipo(id_prototipo)
);
COMMIT;