package com.mycompany.empleado;

import com.mycompany.personasinstitucionales.PersonaInstitucional;

public class Empleado extends PersonaInstitucional {

private double sueldo;


// Constructor
public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
    super(correoInstitucional, id, nombre, correoPersonal, cedula);
    this.sueldo = sueldo;
}

public double getSueldo(){
    return sueldo;
}
public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

@Override
public String toString() {
    return "Empleado{" +super.toString()+ "sueldo=" + sueldo + '}';
}
}
