/*
*Ejercicio 33
*Escribe un programa que diga si un número introducido por teclado es o no primo. Un número primo es aquel
*que sólo es divisible entre él mismo y la unidad.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, contador = 0;
        System.out.println("ingrese un numero para saber si es primo");
        input = sc.nextInt();
        for(int i = 2; i<input; i++ ){
            if(input % i == 0){
                contador++;
            }
        }
        if (input == 1 || contador != 0){
            System.out.println("no es primo");
        }
        else {
            System.out.println("es primo");
        }
    }
}