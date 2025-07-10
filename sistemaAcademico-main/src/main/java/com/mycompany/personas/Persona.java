/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personas;


/**
 *
 * @author Calavera
 */
public class Persona {
    
    private  int id;
    private String nombre;
    private String correoPersonal;
    private String cedula;

    public Persona(int id, String nombre, String correoPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correoPersonal = correoPersonal;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setId(int id){
        this.id =id;
    }

    public String setCedula(){

        return this.cedula=cedula;
    }
    public String setNombre(String nombre){
        return this.nombre=nombre;
    }
    public String setCorreoPersonal(String correoPersonal){
        return this.correoPersonal=correoPersonal;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", correoPersonal=" + correoPersonal + ", cedula=" + cedula + '}';
    }
    /*abstract boolean verificarCedula();*/
    
}






    
   
    
    

