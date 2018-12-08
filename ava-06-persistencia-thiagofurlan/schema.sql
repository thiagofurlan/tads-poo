--\c postgres
DROP DATABASE IF EXISTS siamelhorado;
CREATE DATABASE siamelhorado;
--\c siamelhorado

DROP TABLE IF EXISTS alunos;
DROP TABLE IF EXISTS professores;

CREATE TABLE alunos (
  id              SERIAL      NOT NULL PRIMARY KEY,
  nome            VARCHAR(50) NOT NULL,
  data_nascimento DATE        NOT NULL,
  estado_civil    INTEGER         NULL,
  genero          CHAR(1)         NULL
);

CREATE TABLE professores (
  id              SERIAL      NOT NULL PRIMARY KEY,
  nome            VARCHAR(50) NOT NULL,
  data_nascimento DATE        NOT NULL,
  estado_civil    INTEGER         NULL,
  genero          CHAR(1)         NULL
);

-- 0:solteiro, 1:casado, 2:divorciado, 3:viuvo, 4:separado
-- genero [m, f, n]
INSERT INTO alunos (nome, data_nascimento, estado_civil, genero) VALUES ('Thiago', '1991-03-30', 0, 'm');

INSERT INTO professores (nome, data_nascimento, estado_civil, genero) VALUES ('Marcio', '2000-01-01', 1, 'm');
INSERT INTO professores (nome, data_nascimento, estado_civil, genero) VALUES ('Betito', '2000-01-01', 1, 'm');