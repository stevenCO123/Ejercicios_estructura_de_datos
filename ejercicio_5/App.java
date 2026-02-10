/*
*Ejercicio 5
*Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero_1, numero_2;
        System.out.println("ingrese el primer numero");
        numero_1 = sc.nextDouble();
        System.out.println("ingrese el segundo numero");
        numero_2 = sc.nextDouble();
        System.out.println("suma = " + (numero_1+numero_2) + "\nresta = " + (numero_1 - numero_2) +
                "\ndivision = " + (numero_1/numero_2) + "\nmultiplicacion = " + (numero_1*numero_2));
    }
}