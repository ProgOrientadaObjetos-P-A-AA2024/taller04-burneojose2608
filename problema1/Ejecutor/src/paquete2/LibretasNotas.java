/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author USUARIO
 */
public class LibretasNotas {

    private String nombreEstudiantes;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public LibretasNotas(String n, double c1, double c2, double c3) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public LibretasNotas(String n, double c1, double c2) {
        nombreEstudiantes = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = 10;
    }

    @Override
    public String toString() {
        String cadena = String.format("libreat de calificaciones \n "
                + "Nombre del estduantes %s \n Calificacion1: %.3f \n"
                + "Calificacion2: %.3f \n Calififacion3: %.3f \n Promedio: %.3f"
                + "", nombreEstudiantes, calificacion1, calificacion2,
                calificacion3, promedio);
        return cadena;
    }

    public void establecernombreEstudiantes(String x) {
        nombreEstudiantes = x;
    }

    public void establecercalificacion1(double x) {
        calificacion1 = x;
    }

    public void establecercaclificaciom2(double x) {
        calificacion2 = x;
    }

    public void establecercalificacion3(double x) {
        calificacion3 = x;
    }

    public void establecerpromedio() {
        promedio = calificacion1 + calificacion2 + calificacion3 / 3;
    }

    public String obtenernombreEstudiantes() {
        return nombreEstudiantes;
    }

    public double obtenercalififacion1() {
        return calificacion1;
    }

    public double obtenercaififcaion2() {
        return calificacion2;
    }

    public double obtenercalificacion3() {
        return calificacion3;
    }

    public double obtenerpromedio() {
        promedio = calificacion1 + calificacion2 + calificacion3 / 3;
        return promedio;
    }
}
