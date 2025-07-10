package com.mycompany.profesores;

public interface IProfesores {

    public boolean agregarProfesor(Profesor profesor);

    public void imprimirDatos( );
    
    public boolean actualizarProfesor(int i, Profesor nuevoProfesor);
    public boolean eliminarProfesor(int i);
     public Profesor buscarProfesor(int id);

}
