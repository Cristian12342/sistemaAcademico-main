package com.mycompany.decanos;

public class Decanos implements IDecanos {

    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        
        decanos = new Decano[dimension];
        totalDecanos = 0;

    }
    public boolean agregarDecano(Decano decano) {
        if (totalDecanos == decanos.length) {
            System.out.println("No se puede agregar más decanos, el arreglo está lleno.");
            return false;
        }else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;  
            return true;
        }
    }

    public void imprimirDatos() {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i] != null) {
                System.out.println(decanos[i].toString());
            }
        }
    }

    public boolean actualizarDecano(int i, Decano decano) {
         decanos [i]= decano;
         return true;
    }

    // Metodfo para eliminar un decano
    public boolean eliminarDecano(int i) {
        decanos[i] = null;
        return true;


}
}
