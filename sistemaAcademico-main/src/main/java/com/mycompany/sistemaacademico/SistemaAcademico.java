package com.mycompany.sistemaacademico;

import com.mycompany.profesores.Profesor;
import com.mycompany.profesores.IProfesores;    
import com.mycompany.profesores.Profesores;
import com.mycompany.profesores.Escalafon;

import com.mycompany.decanos.Decano;
import com.mycompany.decanos.Decanos;
import com.mycompany.decanos.IDecanos;

import com.mycompany.estudiantes.Estudiante;
import com.mycompany.vistas.VEstudiantes;
import com.mycompany.vistas.VPrincipal;
/**
 *
 * @author Calavera
 */
public class SistemaAcademico {

    public static void main(String[] args) {
        
        
        VPrincipal vprincipal=new VPrincipal();
        vprincipal.setVisible(true);

System.out.println("---------------Sistema Academico-----------------\n");


    System.out.println("---------------Estudiantes-----------------\n");
        
        // Crear un arreglo de Estudiantes
        Estudiante estudiante1 = new Estudiante("juan@espoch.edu.ec", 101, 1, "Juan", "juan@gmail.com", "01010101");
         System.out.println(estudiante1);



/* 
    System.out.println("---------------Personal Academico-----------------");

    System.out.println("---------------Profesor-----------------\n");
        
        // Crear un arreglo de Profesores
        Profesor profesror1 = new Profesor(Escalafon.AUXILIAR,"Tiempo Completo", 1500.00, "eduardo.edu.ec", 1, "Eduardo", "eduar1010@gmail.com", "01010101");
        Profesor profesror2 = new Profesor(Escalafon.AUXILIAR, "Medio Tiempo", 1000.00, "cristian.edu.ec", 3, "Cristian", "cristian@gmail.com", "03030303");  
        IProfesores profesores = new Profesores(2);
        
        profesores.agregarProfesor(profesror1);
        profesores.agregarProfesor(profesror2);
        profesores.imprimirDatos();

        System.out.println("---------------------------------");
        System.out.println("Datos del Profesor Modificado:\n");

        //actualizar un profesor
        Profesor profesror3 = new Profesor(Escalafon.PRINCIPAL, "Tiempo Completo", 1800.00, "maria.edu.ec", 2, "Maria", "maria12@gmail.com", "02020202");
        profesores.actualizarProfesor(1, profesror3); // Cambia el índice a 1
        profesores.imprimirDatos();

        System.out.println("Eliminando Profesor:\n");
        // Eliminar un profesor
        profesores.eliminarProfesor(0);
        profesores.imprimirDatos();
        System.out.println("\n");
        
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println(" ---------------Decano-----------------\n");
        
        // Crear un arreglo de Decanos
        
        Decano decano1 = new Decano("Nivel 1", "Tiempo Completo", 2000.00, "kerly,edu,ec", 1, "Kerly", "kerly1010@gmail.com", "01010");
        Decano decano2 = new Decano("Nivel 2", "Medio Tiempo", 1800.00, "maria,edu,ec", 2, "Maria", "maria22@gmail.com", "02020");

        IDecanos decanos = new Decanos(2); 

        decanos.agregarDecano(decano1);
        decanos.agregarDecano(decano2);

        decanos.imprimirDatos();

        System.out.println("Datos del Decano Modificado:\n");
        Decano decano3  = new Decano   ("Nivel 3", "Tiempo Completo", 2200.00, "diego,edu,ec", 3, "Diego", "diego1212@gmail,com", "15721321");

        decanos.actualizarDecano(1, decano3);
        decanos.imprimirDatos();
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("Eliminando Decano:\n");
        // Eliminar un decano
        decanos.eliminarDecano(0);
        decanos.imprimirDatos();
        */
    }

}
