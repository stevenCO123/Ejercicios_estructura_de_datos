/*
*Ejercicio 14
*Algoritmo que pida dos números e indique si el primero es mayor que el segundo.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1,numero2;
        System.out.println("ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = sc.nextInt();
        if(numero1>numero2){
            System.out.println("el primer numero introducido es mayor al segundo");
        }
        else {
            System.out.println("el primer numero introducido no es mayor al segundo");
        }
    }
}