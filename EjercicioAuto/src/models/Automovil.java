/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CETECOM
 */
public class Automovil {

    private String patente;
    private String marca;
    private String modelo;
    private double estanque;
    private int km_totales;

    public Automovil() {

    }
    
    public Automovil(String patente, String marca, String modelo) throws Exception{
        this.setPatente(patente);
        this.setMarca(marca);
        this.setModelo(modelo);
    }
    

    public void setPatente(String patente) throws Exception {
        if (!patente.isBlank() && !patente.isEmpty()) {
            this.patente = patente;
        } else {
            throw new Exception("La patente no puede estar vacia");
        }
    }

    public String getPatente() {
        return this.patente;
    }

    public void setMarca(String marca) throws Exception {
        if (!marca.isBlank() && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            throw new Exception("La marca no puede estar vacia");
        }
    }

    public String getMarca() {
        return this.marca;

    }

    public void setModelo(String modelo) throws Exception {
        if (!modelo.isBlank() && !modelo.isEmpty()) {
            this.modelo = modelo;
        } else {
            throw new Exception("El modelo no puede estar vacia");
        }
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void cargar_gasolina(int gasolina) throws Exception{
        if(gasolina+this.estanque<=50 && gasolina>0){
            this.estanque+=gasolina;
        }
        else
        {
            throw new Exception("Sobrepasa la capacidad del estanque");
        }
    }
    
    
    public void trasladarse(double kms) throws Exception
    {
        if(this.estanque*10>=kms){
            this.estanque-=kms*0.1;
            this.km_totales+=kms;
        }
        else
        {
            throw new Exception("No hay combustible suficiente");
        }
    }
    
    @Override
    public String toString(){
        return this.patente +  " " + this.marca + " " +this.modelo +
                " gas: " + this.estanque + " kms:" + this.km_totales;
    }
            

}
