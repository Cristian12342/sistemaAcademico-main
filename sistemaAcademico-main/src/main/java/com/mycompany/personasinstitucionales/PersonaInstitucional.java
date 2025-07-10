
package com.mycompany.personasinstitucionales;

import com.mycompany.personas.Persona;

public class PersonaInstitucional extends Persona {
    
    
    private String correoInstitucional;

    // Constructor


     public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }
    
     public  String setcorreoInstitucional(String correoInstitucional){
        return this.correoInstitucional = correoInstitucional;

    }
    public String getcorreoInstitucional(){
        return correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" + super.toString() + "correoInstitucional='" + correoInstitucional + '\'' + '}';
    }

    //public abstract boolean verificarCedula();

   
}
