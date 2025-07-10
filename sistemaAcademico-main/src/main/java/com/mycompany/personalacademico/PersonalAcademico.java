package com.mycompany.personalacademico;

import com.mycompany.empleado.Empleado;

public class PersonalAcademico extends Empleado{


    // Constructor
     public PersonalAcademico( double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        
    }

    @Override
    public String toString() {
        return "PersonalAcademico{" + super.toString() + '}';
    }
}