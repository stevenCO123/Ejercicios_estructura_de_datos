/*
*Ejercicio 4
*Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cateto1,cateto2,hipotenusa;
        System.out.println("calculadora de hipotenusa");
        System.out.println("ingrese el valor del cateto numero 1");
        cateto1 = sc.nextFloat();
        System.out.println("ingrese el valor del cateto numero 2");
        cateto2 = sc.nextFloat();
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("el valor de la hipotenusa es: " + hipotenusa);
    }
}