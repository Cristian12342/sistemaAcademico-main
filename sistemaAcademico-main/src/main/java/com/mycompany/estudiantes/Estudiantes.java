package com.mycompany.estudiantes;

public class Estudiantes implements IEstudiante {




    private Estudiante [] estudiantes;
    private int totalEstudiantes;

    public Estudiantes(int dimension) {
        estudiantes = new Estudiante[dimension]; // Capacidad inicial
        totalEstudiantes = 0;
    }

    @Override
    public boolean agregarEstudiante(Estudiante estudiante) {
        if (totalEstudiantes == estudiantes.length) {
            return false;
        } else {
            estudiantes[totalEstudiantes] = estudiante; // Crear nuevo estudiante
            totalEstudiantes += 1;
            return true;
        }
    }
    
    @Override
    public void  mostrarEstudiante() { //mostrar es imrprimir 
        System.out.println("Mostrando estudiantes.");
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": ");
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Correo Institucional: " + estudiantes[i].getcorreoInstitucional());
            System.out.println("Código: " + estudiantes[i].getCodigo());
            System.out.println("ID: " + estudiantes[i].getId());
            System.out.println("Correo Personal: " + estudiantes[i].getCorreoPersonal());
        }
        
    }
    public boolean actualizarEstudiante(int id, Estudiante estudiante){
        for (int i = 0; i < totalEstudiantes; i++) {
            
                estudiantes[i] = estudiante; // Actualizar el estudiante
                mostrarEstudiante();
                return true;
        }
        return false;

    }

    @Override
    public boolean eliminarEstudiante(int id) {
        for(int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getId() == id) {
                // Desplazar los elementos hacia la izquierda
                for (int j = i; j < totalEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                estudiantes[totalEstudiantes - 1] = null; // Eliminar el último elemento
                totalEstudiantes--;
                return true;
            }
        }
        return false; // Estudiante no encontrado
    }

    @Override
    public Estudiante buscarEstudiante(int id) {
        for(int i = 0; i < totalEstudiantes; i++) {
            if (estudiantes[i].getId() == id) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Correo Institucional: " + estudiantes[i].getcorreoInstitucional());
                System.out.println("Código: " + estudiantes[i].getCodigo());
                System.out.println("ID: " + estudiantes[i].getId());
                System.out.println("Correo Personal: " + estudiantes[i].getCorreoPersonal());
                return estudiantes[i];
            }
        }
        System.out.println("Estudiante no encontrado.");
        return null; // Estudiante no encontrado
    }
}
