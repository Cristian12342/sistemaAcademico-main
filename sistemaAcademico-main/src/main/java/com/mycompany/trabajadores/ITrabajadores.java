package com.mycompany.trabajadores;

import com.mycompany.decanos.practica.practica;

public interface ITrabajadores {
    boolean agregarTrabajador(Trabajador trabajador);
    void imprimirDatos();
    boolean actualizarTrabajador(int id, Trabajador trabajador);
    boolean eliminarTrabajador(int id);
    boolean buscarTrabajador(int id);
}
