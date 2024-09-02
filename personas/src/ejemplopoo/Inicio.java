/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopoo;
import model.Persona;
/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        /*p.nombre = "Tomas";
        p.apellido = "Corteiz";
        System.out.println(p.nombre + " " + p.apellido);*/
        try {
            Persona p = new Persona();
            p.setNombre("Tomas");
            p.setApellido("Corteiz");
            p.setEdad(20);
            p.setVivo(false);
            System.out.println(p.getNombre() + " " + p.getApellido());
            System.out.println(p.getEdad());
            System.out.println(p.isVivo);
            Persona q = new Persona();
            q.setNombre("Vichente");
            q.setApellido("Colisex");
            System.out.println(q.getNombre() + " " + q.getApellido());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}
