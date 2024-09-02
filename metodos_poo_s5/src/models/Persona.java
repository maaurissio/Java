/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
/*OBJECT dios de las clases*/
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double peso;

    public Persona() {
        this.peso=60;
    }

//<editor-fold defaultstate="collapsed" desc="GETTERS y SETTERS">
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre no puede estar vacío");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("El apellido no puede estar vacío");
        }
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setEdad(int edad) throws Exception {
        if (edad >= 0 && edad <= 150) {
            this.edad = edad;
        } else {
            throw new Exception("Edad no valida");
        }
    }

    public int getEdad() {
        return this.edad;
    }
//</editor-fold>

    /*METODOS PERSONALIZADOS o CUSTOMER*/
    public void cumpleaños() {
        this.edad++;
    }

    public String datosPersona() {
        return "NOMBRE: " + this.getNombre() + " "
                + this.getApellido()
                + " EDAD:" + this.getEdad();
    }

    @Override
    public String toString() {
        return this.nombre + " "
                + this.apellido  + " " 
                +  this.edad + " "
                + "PESO:" + this.peso + " kgs";
        
    }
    
    public void comer(){
        this.peso+=0.5;
    }
    
    public void caminar(double kilometros){
        //por cada km caminado baja 0.25 kgrs
        /*for (int i = 0; i < kms; i++) {
            this.peso -= 0.25;
        }*/
        this.peso-=kilometros*0.25;
    }
}
