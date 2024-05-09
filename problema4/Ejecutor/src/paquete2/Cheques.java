/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Cheques {

    private String nombre;
    private String nombreBanco;
    private double valor;
    private double comision;

    public Cheques(String x, String c, double b) {
        String nombre = x;
        String nombreBanco = c;
        valor = b;

    }

    public Cheques(String m, String c) {
        String nombre = m;
        String nombreBanco = c;
        valor = 150;

    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecernombreBanco(String x) {
        nombreBanco = x;
    }

    public void establecerValor(double x) {
        valor = x;
    }

    public void establecerComision() {
        comision = valor * 0.003;
    }

    public String obtenernombre() {
        return nombre;
    }

    public String obtenernombreBanco() {
        return nombreBanco;
    }

    public double obteneValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los siguientes chesques tienen\n"
                + "El nombre del cliente: %s\n El nombre del banco %s\n"
                + "El valor del cheque %.2f \n La comision del banco %.2f\n",
                nombre, nombreBanco, valor, comision);
        return cadena;
    }
}
