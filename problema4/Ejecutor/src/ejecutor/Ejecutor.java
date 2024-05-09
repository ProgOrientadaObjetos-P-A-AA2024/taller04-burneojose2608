/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import paquete2.Cheques;

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
        Cheques cheque1 = new Cheques("Jose", "Banco de loja", 150);
        cheque1.establecerComision();
        Cheques cheque2 = new Cheques("Juan", "Banco Pichincha");
        cheque2.establecerComision();
        System.out.printf("%s", cheque1);
        System.out.printf("%s", cheque2);
    }

}
