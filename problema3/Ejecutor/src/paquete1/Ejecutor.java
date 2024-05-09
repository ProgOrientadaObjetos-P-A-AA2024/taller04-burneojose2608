/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Automotor;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automotor auto1 = new Automotor(102525248,"ford",2026,150);
        auto1.establecervalorMatricula();
        Automotor auto2 = new Automotor("ford",2026,150);
        auto2.establecervalorMatricula();
         System.out.printf("%s\n ",auto1);
         System.out.printf("%s\n",auto2);
    }
    
}
