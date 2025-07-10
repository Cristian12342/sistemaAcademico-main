package com.mycompany.decanos;

public class Decanos implements IDecanos {

    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        
        decanos = new Decano[dimension];
        totalDecanos = 0;

    }
    @Override
    public boolean agregarDecano(Decano decano) {
        if (totalDecanos == decanos.length) {
            return false;
        } else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;
            return true;
        }
    }

@Override
    public void imprimirDatos() {
         for (int i = 0; i < totalDecanos; i++) {
            System.out.println("------DECANO------" + "|" + (i + 1) + "|");
            System.out.println("Nombre :" + decanos[i].getNombre());
            System.out.println("Id :" + decanos[i].getId());
            System.out.println("Cedula :" + decanos[i].getCedula());
            System.out.println("Correo personal :" + decanos[i].getCorreoPersonal());
            System.out.println("Correo institucional :" + decanos[i].getcorreoInstitucional());
            System.out.println("Nivel jerarquico: " + decanos[i].getNivel());
            System.out.println(" ");

        }
    }
@Override
    public boolean actualizarDecano(int id, Decano decano) {
        for (int i = 0; i < totalDecanos; i++) {
            if(decanos[i].getId()==id){
            decanos[i]=decano;
            return true;
            }
        }
        return false;
    }
@Override
    // Metodfo para eliminar un decano
    public boolean eliminarDecano(int id) {
         for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j < totalDecanos - 1; j++) {
                    decanos[j] = decanos[j + 1];
                }
                decanos[totalDecanos - 1] = null;
                totalDecanos--;
                System.out.println("Profesor eliminado");
                return true;
            }
        }
        return false;
    }
    @Override
    public Decano buscarDecano(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i] != null && decanos[i].getId() == id) {
                return decanos[i];
            }
        }
        return null;
    }



}

