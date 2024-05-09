/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Automotor {

    private int cedula;
    private String marca;
    private int año;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(int c, String m, int b, double x) {
        cedula = c;
         marca = m;
        año = b;
        valorVehiculo = x;

    }

    public Automotor(String m, int b, double x) {
        cedula = 1105197030;
         marca = m;
        año = b;
        valorVehiculo = x;

    }

    public void establecercedula(int x) {
        cedula = x;

    }

    public void establecerMarca(String x) {
        marca = x;

    }

    public void establecerAño(int x) {
        año = x;

    }

    public void establecervalorVehiculo(double x) {
        valorVehiculo = x;

    }

    public void establecervalorMatricula() {
        valorMatricula = año * 0.002;
    }

    public int obtenercedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerAño() {
        return año;
    }

    public double obtenervalorVehiculo() {
        return valorVehiculo;
    }

    public double obtenervalorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format(" La cedula del "
                + "dueño es: %d \n La marca del vehiculo es :%s \n El año de "
                + "fabricacion es : %.d\n El valor del vehiculo es %.2f\n El valor"
                + "de la matricula es %.2f\n", cedula, marca, año,
                 valorVehiculo,valorMatricula);
        return cadena;
    }
}
