package com.example.demo.ServiciosExternos.DatosGeoRef;

public class Departamento extends Localizacion{

  public Provincia provincia;
  public Departamento(int id, String nombre, Coordenadas coordenadas, Provincia provincia) {
    super(id, nombre, coordenadas);
    this.provincia = provincia;
  }
}
