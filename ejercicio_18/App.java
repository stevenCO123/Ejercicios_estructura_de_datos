/*
*Ejercicio 18
*Realiza un algoritmo que calcule la potencia, para ello pide por teclado,
*  la base y el exponente. Pueden ocurrir tres cosas:
*El exponente sea positivo, sólo tienes que imprimir la potencia.
*El exponente sea 0, el resultado es 1.
*El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, exponente, resultado;
        System.out.println("calculadora de potencias");
        System.out.println("ingrese la base");
        base = sc.nextDouble();
        System.out.println("ingrese el exponente");
        exponente = sc.nextDouble();
        if(exponente == 0){
            resultado = 1;
        }
        else {
            resultado = Math.pow(base,exponente);
        }
        System.out.println("el resultado es:" + resultado);
    }
}