
package com.mycompany.personasexternas;


import com.mycompany.personas.Persona;

/**
 *
 * @author Calavera
 */
public class PersonaExterna extends Persona {
    
    private String descripcion;

    public PersonaExterna(int id, String nombre, String apellido, String cedula, String descripcion) {
        super(id, nombre, apellido, cedula);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "PersonaExterna{" +super.toString()+ ", descripcion='" + descripcion + '\'' + '}';
    }
}
   


    
