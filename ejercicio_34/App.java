/*
*Ejercicio 34
*Una empresa les paga a sus empleados con base en las horas trabajadas en la semana. Realice un algoritmo para
*determinar el sueldo semanal de N trabajadores y, además, calcule cuánto pagó la empresa por los N empleados.
*/

import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad_trabajadores;
        double cantidad_horas, valor_hora, sueldo_trabajador, gastos_empresa = 0;
        System.out.println("ingrese la cantidad de trabajadores");
        cantidad_trabajadores = sc.nextInt();
        System.out.println("ingrese el valor de la hora trabajada");
        valor_hora = sc.nextDouble();
        for(int i = 1; i<=cantidad_trabajadores; i++){
            System.out.println("trabajador numero " + i);
            System.out.println("ingrese la cantidad de horas trabajas");
            cantidad_horas = sc.nextDouble();
            sueldo_trabajador = cantidad_horas * valor_hora;
            System.out.println("el trabajador " + i + " gana: " + sueldo_trabajador);
            gastos_empresa = gastos_empresa + sueldo_trabajador;
        }
        System.out.println("la empresa paga: " + gastos_empresa);
    }

}