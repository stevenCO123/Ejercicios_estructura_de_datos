/*
*Ejercicio 32
*Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el
*resultado de la potencia. No se puede utilizar el operador de potencia.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, resultado=1;
        int exponente;
        System.out.println("ingrese la base");
        base = sc.nextDouble();
        System.out.println("ingrese el exponente");
        exponente = sc.nextInt();
        for (int i = 1; i<exponente; i++){
            resultado = resultado * base;
        }
        System.out.println("el resultado es: " + resultado);
    }
}