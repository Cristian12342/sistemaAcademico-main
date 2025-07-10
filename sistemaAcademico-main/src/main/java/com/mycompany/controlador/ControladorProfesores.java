package com.mycompany.controlador;

import com.mycompany.vistas.VProfesores;
import com.mycompany.profesores.Profesor;
import com.mycompany.profesores.Profesores;
import com.mycompany.profesores.Escalafon;
import com.mycompany.profesores.IProfesores;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorProfesores {

    private VProfesores vistaProfesor;
    private IProfesores iProfesores;

    public ControladorProfesores(VProfesores vistaProfesor) {
        this.vistaProfesor = vistaProfesor;
        this.iProfesores = new Profesores(10);
    }

    private Escalafon identificarEscalafon(String escalafon) {
        if (escalafon.equalsIgnoreCase("Principal")) return Escalafon.PRINCIPAL;
        if (escalafon.equalsIgnoreCase("Agregado")) return Escalafon.AGREGADA;
        return Escalafon.AUXILIAR;
    }

    public void agregarProfesor() {
        try {
            String id = vistaProfesor.getID();
            String nombre = vistaProfesor.getNombre();
            String correoPersonal = vistaProfesor.getCorreoPersonal();
            String correoInstitucional = vistaProfesor.getCorreoInstitucional();
            String cedula = vistaProfesor.getCedula();
            String escalafonTexto = vistaProfesor.getEscalafon();
            String sueldoTexto = vistaProfesor.getSueldo();

            Escalafon escalafon = identificarEscalafon(escalafonTexto);
            int idProfesor = Integer.parseInt(id);
            double sueldo = Double.parseDouble(sueldoTexto);

            Profesor nuevo = new Profesor(escalafon, sueldo, correoInstitucional, idProfesor, nombre, correoPersonal, cedula);
            boolean agregado = iProfesores.agregarProfesor(nuevo);

            if (agregado) {
                JOptionPane.showMessageDialog(null, "Profesor agregado con éxito");
                vistaProfesor.agregarFilaATabla(id, nombre, correoPersonal, correoInstitucional, cedula, escalafonTexto, sueldoTexto);
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el profesor (duplicado)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar profesor: " + e.getMessage());
        }
    }

    public void buscarProfesor() {
        try {
            String idTexto = vistaProfesor.getID();
            int id = Integer.parseInt(idTexto);
            Profesor profesor = iProfesores.buscarProfesor(id);

            if (profesor != null) {
                vistaProfesor.setNombre(profesor.getNombre());
                vistaProfesor.setCorreoPersonal(profesor.getCorreoPersonal());
                vistaProfesor.setCorreoInstitucional(profesor.getcorreoInstitucional());
                vistaProfesor.setCedula(profesor.getCedula());
                vistaProfesor.setEscalafon(profesor.getEscalafon().toString());
                vistaProfesor.setSueldo(String.valueOf(profesor.getSueldo()));

                JOptionPane.showMessageDialog(null, "Profesor encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "Profesor no encontrado");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID inválido");
        }
    }

    public void eliminarProfesor() {
        int filaSeleccionada = vistaProfesor.getTablaProfesores().getSelectedRow();

        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) vistaProfesor.getTablaProfesores().getModel();
            String idTexto = modelo.getValueAt(filaSeleccionada, 0).toString();
            int id = Integer.parseInt(idTexto);

            iProfesores.eliminarProfesor(id);
            modelo.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(null, "Profesor eliminado");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
        }
    }

    public void actualizarProfesor() {
        try {
            String idTexto = vistaProfesor.getID();
            int id = Integer.parseInt(idTexto);
            Profesor existente = iProfesores.buscarProfesor(id);

            if (existente != null) {
                String nombre = vistaProfesor.getNombre();
                String correoPersonal = vistaProfesor.getCorreoPersonal();
                String correoInstitucional = vistaProfesor.getCorreoInstitucional();
                String cedula = vistaProfesor.getCedula();
                String escalafonTexto = vistaProfesor.getEscalafon();
                double sueldo = Double.parseDouble(vistaProfesor.getSueldo());

                Escalafon escalafon = identificarEscalafon(escalafonTexto);

                Profesor actualizado = new Profesor(escalafon, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
                iProfesores.actualizarProfesor(id, actualizado);

                JOptionPane.showMessageDialog(null, "Profesor actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Profesor no encontrado");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar profesor");
        }
    }
}
