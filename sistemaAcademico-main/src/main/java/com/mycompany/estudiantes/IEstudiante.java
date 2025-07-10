package com.mycompany.estudiantes;

public interface IEstudiante {

    public boolean agregarEstudiante(Estudiante estudiante);
    public void mostrarEstudiante();
    public boolean eliminarEstudiante(int id);
    public Estudiante buscarEstudiante(int id);
    public boolean actualizarEstudiante(int id, Estudiante estudiante);

}
