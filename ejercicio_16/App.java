/*
*Ejercicio 16
*Escribe un programa que lea un número e indique si es par o impar.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero = sc.nextInt();
        if(numero % 2 == 0){
            System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
    }
}