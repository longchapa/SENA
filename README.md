Proyecto Final SENA

  #entradas
  id serial primary key,
  tipo varchar(255)NOT NULL default entrada,
  fecha date,
  nombre varchar(255) NOT NULL,
  descripcion varchar(255) NOT NULL,
  provedor varchar(255) NOT NULL,
  cantidad bigint,
  costo bigint,
  saldo bigint

  #salidas
  id serial primary key,
  tipo varchar(255)NOT NULL default salida,
  fecha date,
  nombre varchar(255) NOT NULL,
  descripcion varchar(255) NOT NULL,
  provedor varchar(255) NOT NULL,
  cantidad bigint,
  costo bigint,
  saldo bigint

  #clientes
  id serial primary key,
  nombre varchar(255) NOT NULL,
  correo varchar(255) NOT NULL,

  #productos
  nombre varchar(255) primary key NOT NULL,
  descripcion varchar(255) DEFAULT 'Nuevo Producto'

