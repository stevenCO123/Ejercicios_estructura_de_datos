/*
*Ejercicio 15
*Algoritmo que pida un número y diga si es positivo, negativo o 0.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero = sc.nextInt();
        if(numero>0){
            System.out.println("el numero es positivo");
        } else if (numero < 0) {
            System.out.println("el numero es negativo");
        }
        else{
            System.out.println("el numero es 0");
        }
    }
}