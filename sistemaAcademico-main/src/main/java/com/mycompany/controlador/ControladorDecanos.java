package com.mycompany.controlador;

import com.mycompany.vistas.VDecanos;
import com.mycompany.decanos.Decano;
import com.mycompany.decanos.IDecanos;
import com.mycompany.decanos.Decanos;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorDecanos {
    private VDecanos vista;
    private IDecanos iDecanos;

    public ControladorDecanos(VDecanos vista) {
        this.vista = vista;
        this.iDecanos = new Decanos(10); // max 10 decanos
    }

    public void agregarDecano() {
        try {
            String nivel = vista.getNivel();
            String nombre = vista.getNombre();
            String correoPersonal = vista.getCorreoPersonal();
            String correoInstitucional = vista.getCorreoInstitucional();
            double sueldo = Double.parseDouble(vista.getSueldo());
            int id = Integer.parseInt(vista.getID());
            String cedula = vista.getCedula();

            Decano nuevo = new Decano(nivel, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
            boolean agregado = iDecanos.agregarDecano(nuevo);

            if (agregado) {
                JOptionPane.showMessageDialog(null, "Decano agregado con éxito");
                vista.agregarFilaATabla(nivel, nombre, correoPersonal, correoInstitucional, String.valueOf(sueldo), cedula, String.valueOf(id));

            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un decano con ese ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar decano: " + e.getMessage());
        }
    }

    public void eliminarDecano() {
        int fila = vista.getTablaDecanos().getSelectedRow();
        if (fila != -1) {
            DefaultTableModel modelo = (DefaultTableModel) vista.getTablaDecanos().getModel();
            int id = Integer.parseInt(modelo.getValueAt(fila, 5).toString());
            iDecanos.eliminarDecano(id);
            modelo.removeRow(fila);
            JOptionPane.showMessageDialog(null, "Decano eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }
    }

    public void buscarDecano() {
        try {
            int id = Integer.parseInt(vista.getID());
            Decano d = iDecanos.buscarDecano(id);

            if (d != null) {
                vista.setNivel(d.getNivel());
                vista.setNombre(d.getNombre());
                vista.setCorreoPersonal(d.getCorreoPersonal());
                vista.setCorreoInstitucional(d.getcorreoInstitucional());
                vista.setSueldo(String.valueOf(d.getSueldo()));
                JOptionPane.showMessageDialog(null, "Decano encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el decano");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        }
    }

    public void actualizarDecano() {
        try {
            int id = Integer.parseInt(vista.getID());
            Decano dExistente = iDecanos.buscarDecano(id);

            if (dExistente != null) {
                String nivel = vista.getNivel();
                String nombre = vista.getNombre();
                String correoPersonal = vista.getCorreoPersonal();
                String correoInstitucional = vista.getCorreoInstitucional();
                double sueldo = Double.parseDouble(vista.getSueldo());
                String cedula = vista.getCedula();

                Decano actualizado = new Decano(nivel, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
                iDecanos.actualizarDecano(id, actualizado);
                JOptionPane.showMessageDialog(null, "Decano actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Decano no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
        }
    }
}
