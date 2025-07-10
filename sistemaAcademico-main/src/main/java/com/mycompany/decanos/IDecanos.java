package com.mycompany.decanos;

public interface IDecanos {

    //public boolean verificarCedula();
   
    public void imprimirDatos();
    public boolean agregarDecano(Decano decano);
    public boolean actualizarDecano(int i, Decano decano);
    public boolean eliminarDecano(int i);
    public Decano buscarDecano(int id);

}
