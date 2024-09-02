/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioauto;

import java.util.logging.Level;
import java.util.logging.Logger;
import models.Automovil;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Automovil car=new Automovil();
            System.out.println(car);
            car.setPatente("AABB12");
            car.setMarca("Lada");
            car.setModelo("Niva");
            System.out.println(car);
            car.cargar_gasolina(50);
            System.out.println("Le pónemos 50 de gasolina");
            System.out.println(car);
            
            System.out.println("andando 100 kms");
            car.trasladarse(100);
            
            System.out.println(car);
            
            car.trasladarse(20);
            System.out.println(car);
            
            
            Automovil autito=new Automovil("CCDD34", "Fiat", "600");
            System.out.println(autito);
            
        } catch (Exception ex) {
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    }
    
}
