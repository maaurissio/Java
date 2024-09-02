/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author CETECOM
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private boolean vivo;
    public boolean isVivo;

    //Constructor por defecto para crear objetos
    public Persona() {
    }

    //Accesadores y Mutadores - Getters y Setters
    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            throw new Exception("El nombre no puede estar vacio");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !nombre.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("El apellido no puede estar vacio");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 50) {
            this.edad = edad;
        } else {
            throw new Exception("Edad no valida");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }
}
