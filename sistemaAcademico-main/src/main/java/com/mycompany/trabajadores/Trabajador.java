package com.mycompany.trabajadores;

import com.mycompany.empleado.Empleado;

public class Trabajador extends Empleado {
    

    private String gremio;


    // Constructor
   public Trabajador(String gremio, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }
    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    @Override
    public String toString() {
        return "Trabajador{" + super.toString() + "gremio='" + gremio + '\'' + '}';
    }
}