/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private double suledoBasico;
    private double sueldoTotal;
    private double cedula;

    public Profesores(String n, String x, double a, double c) {
        nombre = n;
        apellido = x;
        suledoBasico = a;
        cedula = c;
    }

     public Profesores(String n, String x, double c) {
        nombre = n;
        apellido = x;
        suledoBasico = 450;
        cedula = c;
    }


    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecersuledoBasico(double a) {
        suledoBasico = a;
    }

    public void establecersueldoTotal() {
        sueldoTotal = suledoBasico * 0.20;
    }

    public void establecercedula(double x) {
        cedula = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenersuledoBasico() {
        return suledoBasico;
    }

    public double obtenersueldoTotal() {
        return sueldoTotal;
    }

    public double obetnercedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Los profesores de la institucion son:\n"
                + "El nombre es: %s\n El apellido es :%s\n El sueldo basico es: %.2f\n"
                + " La cedula es %.2f \n El suldo total es %.2f\n ", nombre,
                apellido, suledoBasico, cedula, sueldoTotal);
        return cadena;
    }
}
