/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Profesores;

/**
 *
 * @author USUARIO
 */
public class EJecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Profesores profesor1 = new Profesores ("Juan","Riquelme",450,10136214);
        profesor1.establecersueldoTotal();
         Profesores profesor2 = new Profesores("Jose" ,"Burneo",111025552);
         profesor2.establecersueldoTotal();
         System.out.printf("%s\n ",profesor1);
         System.out.printf("%s\n",profesor2);
    }
    
}
