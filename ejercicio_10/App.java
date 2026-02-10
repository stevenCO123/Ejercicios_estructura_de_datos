/*
*Ejercicio 10
*Un alumno desea saber cual será su calificación final en la materia de Estructura de Datos.
*  Dicha calificación se compone de los siguientes porcentajes:
*55% del promedio de sus tres calificaciones parciales.
*30% de la calificación del examen final.
*15% de la calificación de un trabajo final.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double parcial1, parcial2, parcial3,promedio, examen_final, trabajo_final;
        System.out.println("ingrese la nota del parcial 1");
        parcial1 = sc.nextDouble();
        System.out.println("ingrese la nota del parcial 2");
        parcial2 = sc.nextDouble();
        System.out.println("ingrese la nota del parcial 3");
        parcial3 = sc.nextDouble();
        System.out.println("ingrese la nota del examen final");
        examen_final = sc.nextDouble();
        System.out.println("ingrese la nota del trabajo final");
        trabajo_final = sc.nextDouble();
        promedio = ((parcial1 + parcial2 + parcial3)/3) * 0.55;
        examen_final = examen_final * 0.3;
        trabajo_final = trabajo_final * 0.15;
        System.out.println("su nota final seria: " + (promedio + examen_final + trabajo_final));
    }
}