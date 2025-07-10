package com.mycompany.profesores;

import com.mycompany.decanos.Decano;

public class Profesores implements IProfesores {
 
    private Profesor[] profesores;
    private int totalProfesores;

    public Profesores (int dimension) {
        
        profesores = new Profesor [dimension];
        totalProfesores = 0;

    }
    @Override
    public boolean agregarProfesor(Profesor profesor) {
        if (totalProfesores == profesores.length) {
            System.out.println("No se puede agregar más decanos, el arreglo está lleno.");
            return false;
        }else {
            profesores[totalProfesores] = profesor;
            totalProfesores = totalProfesores + 1;  
            return true;
        }
    }
    @Override
    public void imprimirDatos() {
        for (int i = 0; i < totalProfesores; i++) {
           if (profesores[i] != null) {
                System.out.println("----PROFESOR----" + "|" + (i + 1) + "|");
                System.out.println("Nombre :" + profesores[i].getNombre());
                System.out.println("Correo del profesor: " + profesores[i].getcorreoInstitucional());
                System.out.println("Correo Personal:" + profesores[i].getCorreoPersonal());
                System.out.println("Cedula: " + profesores[i].getCedula());
                System.out.println("Sueldo:" + profesores[i].getSueldo());
                System.out.println("Escalafon: " + profesores[i].getEscalafon());
                System.out.println("ID :" + profesores[i].getId());
                System.out.println(" ");
            }
        }
    }

    public boolean actualizarProfesor(int id, Profesor nuevoProfesor) {
         for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i] != null && profesores[i].getId() == id) {
                profesores[i] = nuevoProfesor;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProfesor(int id) {
         for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i].getId() == id) {

                for (int j = i; j < totalProfesores - 1; j++) {
                    profesores[j] = profesores[j + 1];
                }
                profesores[totalProfesores - 1] = null;
                totalProfesores--;
                System.out.println("Profesor eliminado");
                return true;
            }
        }
        return false;
    }
    public Profesor buscarProfesor(int id) {
        for (int i = 0; i < totalProfesores; i++) {
            if (profesores[i] != null && profesores[i].getId() == id) {
                return profesores[i];
            }
        }
        return null;
    }


    

    
}
