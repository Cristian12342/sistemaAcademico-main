/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.controlador;

import com.mycompany.vistas.VEstudiantes;

import javax.swing.JOptionPane;

import com.mycompany.estudiantes.Estudiante;
import com.mycompany.estudiantes.IEstudiante;
import com.mycompany.estudiantes.Estudiantes;

/**
 *
 * @author Calavera
 */
public class ControladorEstudiantes {
    private VEstudiantes vistaEstudiantes;

    public ControladorEstudiantes(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
    }

    public void procesoControladorEstudiantes() {
        try {
            String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
            String codigoEstudiante = vistaEstudiantes.getCodigoEstudiante();
            String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
            String correoPersonal = vistaEstudiantes.getCorreoPersonal();
            String correoInstitucional = vistaEstudiantes.getCorreoInstitucional();
           

            // Aquí puedes crear el objeto Estudiante y hacer lo que necesites
            System.out.println("Datos capturados:");
            System.out.println("Cédula: " + cedulaEstudiante);
            System.out.println("Código: " + codigoEstudiante);
            System.out.println("Nombre: " + nombreEstudiante);
            System.out.println("Correo Personal: " + correoPersonal);
            System.out.println("Correo Institucional: " + correoInstitucional);

        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public void agregarEstudiante() {
        String cedulaEstudiante = vistaEstudiantes.getCedulaEstudiante();
        String codigoEstudiante = vistaEstudiantes.getCodigoEstudiante();
        String nombreEstudiante = vistaEstudiantes.getNombreEstudiante();
        String correoPersonal = vistaEstudiantes.getCorreoPersonal();
        String correoInstitucional = vistaEstudiantes.getCorreoInstitucional();

        // Agregar a la tabla
    vistaEstudiantes.agregarFilaATabla(
        codigoEstudiante,
        nombreEstudiante,
        correoPersonal,
        cedulaEstudiante,
        correoInstitucional
        );
        // Imprimir datos por Consola
        System.out.println("Agregado Estudiante");
        System.out.println("Cédula: " + cedulaEstudiante);
        System.out.println("Código: " + codigoEstudiante);
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Correo Personal: " + correoPersonal);
        System.out.println("Correo Institucional: " + correoInstitucional);
    }

    //Buscar estudiante
    public void buscarEstudiante() {
    String codigoBuscado = vistaEstudiantes.getCodigoEstudiante().trim();

    javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) vistaEstudiantes.getTablaEstudiantes().getModel();

    javax.swing.JTable tabla = vistaEstudiantes.getTablaEstudiantes();

        for (int i = 0; i < modelo.getRowCount(); i++) {
    Object valorCodigo = modelo.getValueAt(i, 0);
    if (valorCodigo != null) {
        String codigo = valorCodigo.toString().trim();
        if (codigo.equalsIgnoreCase(codigoBuscado)) {
            // Selecciona la fila en la tabla
            tabla.setRowSelectionInterval(i, i);

            // Validar y asignar cada campo
            Object nombre = modelo.getValueAt(i, 1);
            Object correoPersonal = modelo.getValueAt(i, 2);
            Object cedula = modelo.getValueAt(i, 3);
            Object correoInstitucional = modelo.getValueAt(i, 4);

            vistaEstudiantes.setNombreEstudiante(nombre != null ? nombre.toString() : "");
            vistaEstudiantes.setCorreoPersonal(correoPersonal != null ? correoPersonal.toString() : "");
            vistaEstudiantes.setCedulaEstudiante(cedula != null ? cedula.toString() : "");
            vistaEstudiantes.setCorreoInstitucional(correoInstitucional != null ? correoInstitucional.toString() : "");

            javax.swing.JOptionPane.showMessageDialog(null, "Estudiante encontrado.");
            return;
        }
    }
}
    }
    //Eliminar Estudiante
    public void procesoControladorEliminarEstudiantes() {
    javax.swing.JTable tabla = vistaEstudiantes.getTablaEstudiantes();
    int filaSeleccionada = tabla.getSelectedRow();

    if (filaSeleccionada != -1) {
        ((javax.swing.table.DefaultTableModel) tabla.getModel()).removeRow(filaSeleccionada);
        javax.swing.JOptionPane.showMessageDialog(null, "Estudiante eliminado");
    } else {
        javax.swing.JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
    }
}
    
}

 