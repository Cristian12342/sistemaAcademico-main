package com.mycompany.estudiantes;

import com.mycompany.personasinstitucionales.PersonaInstitucional;

public class Estudiante extends PersonaInstitucional {
    

    public int codigo;
//constructor

    public Estudiante(String correoInstitucional, int codigo, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String agregarEstudiante() {
        return "Estudiante agregado con éxito.";
    }
    public boolean verificarCedula(){
    
        return true;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() + "codigo=" + codigo + '}';
    }
}

