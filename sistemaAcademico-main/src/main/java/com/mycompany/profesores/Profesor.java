package com.mycompany.profesores;

import com.mycompany.personalacademico.PersonalAcademico;

public class Profesor extends PersonalAcademico {

    private Escalafon escalafon;

    // Constructor

    public Profesor(Escalafon escalafon, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.escalafon = escalafon;
        super.toString();
    }
    

    public Escalafon getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }
    

    @Override
    public String toString() {
        return "Profesor{" +super.toString()+ "escalafon=" + escalafon + '}';
    }
   
    
}
