/*
*Ejercicio 31
*Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroA, numeroB;
        System.out.println("ingrese el primer numero");
        numeroA = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroB = sc.nextInt();
        System.out.println("numeros pares entre estos dos numeros:");
        for (int i = numeroA+1; i < numeroB; i++) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}