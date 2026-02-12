/*
*Ejercicio 24
*El director de una escuela está organizando un viaje de estudios,
*  y requiere determinar cuánto debe cobrar a cada alumno
* y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
*si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
*de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros,
*y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
*Realice un algoritmo que permita determinar el pago a la compañía de autobuses
* y lo que debe pagar cada alumno por el viaje.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alumnos;
        double costoPorAlumno, pagoCompañia;
        System.out.println("ingrese la cantidad de alumnos");
        alumnos = sc.nextInt();

        if (alumnos >= 100) {
            costoPorAlumno = 65;
            pagoCompañia = alumnos * costoPorAlumno;
        }
        else if (alumnos >= 50) {
            costoPorAlumno = 70;
            pagoCompañia = alumnos * costoPorAlumno;
        }
        else if (alumnos >= 30) {
            costoPorAlumno = 95;
            pagoCompañia = alumnos * costoPorAlumno;
        }
        else {
            pagoCompañia = 4000;
            costoPorAlumno = pagoCompañia / alumnos;
        }

        System.out.println("a la compañia se le paga: " +pagoCompañia);
        System.out.println("los alumnos deben pagar: " + costoPorAlumno);

    }
}