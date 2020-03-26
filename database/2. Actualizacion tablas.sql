ALTER TABLE COLABORADOR 
ADD DISPONIBLE VARCHAR2(1);

ALTER TABLE curriculum
drop column nivel_Academico;

ALTER TABLE curriculum
drop column titulo_Academico;

--Tabla COLABORADORPROTOTIPO
CREATE TABLE colaboradorprototipo(
  id_colaboradorprototipo VARCHAR2(20),
  id_prototipo VARCHAR2(20),
  id_colaborador VARCHAR2(20),
  estado VARCHAR2(20),
  CONSTRAINT colaboradorprototipo_pk PRIMARY KEY (id_colaboradorprototipo),
  CONSTRAINT fk_colaboradorprototipo_prototipo
    FOREIGN KEY (id_prototipo)
    REFERENCES prototipo(id_prototipo),
  CONSTRAINT fk_colaboradorprototipo_colaborador
    FOREIGN KEY (id_colaborador)
    REFERENCES colaborador(id_colaborador)
);

COMMIT;