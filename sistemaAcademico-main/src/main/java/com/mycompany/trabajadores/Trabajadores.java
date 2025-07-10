package com.mycompany.trabajadores;

public class Trabajadores implements ITrabajadores {

    private Trabajador[] trabajadores;
    private int totalTrabajadores;

    public Trabajadores(int dimension) {
        trabajadores = new Trabajador[dimension];
        totalTrabajadores = 0;
    }

    public boolean agregarTrabajador(Trabajador trabajador) {
        if (totalTrabajadores == trabajadores.length) {
            return false;
        } else {
            trabajadores[totalTrabajadores] = trabajador;
            totalTrabajadores++;
            return true;
        }
    }

    public void imprimirDatos() {
        for (int i = 0; i < totalTrabajadores; i++) {
            System.out.println("----- TRABAJADOR " + (i + 1) + " -----");
            System.out.println("Nombre: " + trabajadores[i].getNombre());
            System.out.println("Cédula: " + trabajadores[i].getCedula());
            System.out.println("Correo Institucional: " + trabajadores[i].getcorreoInstitucional());
            System.out.println("Correo Personal: " + trabajadores[i].getCorreoPersonal());
            System.out.println("Gremio: " + trabajadores[i].getGremio());
            System.out.println("Sueldo: " + trabajadores[i].getSueldo());
            System.out.println("ID: " + trabajadores[i].getId());
        }
    }

    public boolean actualizarTrabajador(int id, Trabajador trabajadorActualizado) {
        for (int i = 0; i < totalTrabajadores; i++) {
            if (trabajadores[i].getId() == id) {
                trabajadores[i] = trabajadorActualizado;
                System.out.println("Trabajador actualizado:");
                imprimirDatos();
                return true;
            }
        }
        return false;
    }

    public boolean eliminarTrabajador(int id) {
        for (int i = 0; i < totalTrabajadores; i++) {
            if (trabajadores[i].getId() == id) {
                for (int j = i; j < totalTrabajadores - 1; j++) {
                    trabajadores[j] = trabajadores[j + 1];
                }
                trabajadores[totalTrabajadores - 1] = null;
                totalTrabajadores--;
                System.out.println("Trabajador eliminado.");
                return true;
            }
        }
        return false;
    }

    public boolean buscarTrabajador(int id) {
        for (int i = 0; i < totalTrabajadores; i++) {
            if (trabajadores[i].getId() == id) {
                System.out.println("Trabajador encontrado:");
                System.out.println("Nombre: " + trabajadores[i].getNombre());
                System.out.println("Correo: " + trabajadores[i].getCorreoPersonal());
                System.out.println("Gremio: " + trabajadores[i].getGremio());
                System.out.println("Sueldo: " + trabajadores[i].getSueldo());
                System.out.println("ID: " + trabajadores[i].getId());
                return true;
            }
        }
        System.out.println("Trabajador no encontrado.");
        return false;
    }
}
