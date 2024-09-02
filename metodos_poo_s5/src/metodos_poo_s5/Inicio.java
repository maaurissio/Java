/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos_poo_s5;

import models.Persona;

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
            Persona p = new Persona();
            p.setNombre("Wacoldo");
            p.setApellido("Soto");
            p.setEdad(25);

            Persona q = new Persona();
            q.setNombre("Diogenes");
            q.setApellido("Carrasco");
            q.setEdad(46);

            System.out.println(p.datosPersona());

            System.out.println(q.datosPersona());

            System.out.println("****CUMPLEAÑOS DE WACOLDO****");
            p.cumpleaños();

            System.out.println(p.datosPersona());
            
            q.cumpleaños();
            q.cumpleaños();
            q.cumpleaños();
            q.cumpleaños();
            
            System.out.println(q.datosPersona());
            
            /*imprimir el objeto en pantalla*/
            System.out.println("**imprimir el objeto en pantalla**");
            System.out.println(p);
            System.out.println(q);

            /*Dando comida a wacoldo*/
            p.comer();
            p.comer();
            
            System.out.println(p);
            
            /*wacoldo con bajon*/
            for (int i = 0; i < 40; i++) {
                p.comer();
            }
            
            System.out.println(p);
            p.caminar(1);
            System.out.println(p);
            p.caminar(10);
            System.out.println(p);
            
        } catch (Exception ex) {
            //Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR: " + ex.getMessage());
        }

    }

}
