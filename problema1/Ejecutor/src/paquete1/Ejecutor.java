/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.LibretasNotas;
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
        LibretasNotas libreta1 = new LibretasNotas ("Jose",10,10,9);
        libreta1.establecerpromedio();
         LibretasNotas libreta2 = new LibretasNotas ("Jose",10,10);
         libreta2.establecerpromedio();
         System.out.printf("%s\n ",libreta1);
         System.out.printf("%s\n",libreta2);
    }
    
}
