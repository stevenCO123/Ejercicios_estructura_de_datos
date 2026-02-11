/*
*Ejercicio 21
*Escribir un programa que lea un año indicar si es bisiesto.
*Nota: un año es bisiesto si es un número divisible por 4,
*  pero no si es divisible por 100, excepto que también sea divisible por 400.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año
        System.out.println("ingrese un año para saber si es bisiesto o no");
        año = sc.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("es bisiesto");
        } else {
            System.out.println("no es bisiesto");
        }
    }
}