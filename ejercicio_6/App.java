/*
*Ejercicio 6
*Escribir un programa que convierta un valor dado en grados Fahrenheit a grados Celsius.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double grados_F, grados_C;
        System.out.println("ingrese el valor en grados fahrenheit");
        grados_F = sc.nextDouble();
        grados_C = (grados_F - 32) * 5/9;
        System.out.println("en grados Celsius equivale a: " + grados_C);
    }
}