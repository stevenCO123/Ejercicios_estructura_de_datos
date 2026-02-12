/*
*Ejercicio 30
*Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir).
*El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cantidad_numeros;
        int contador_mayores = 0, contador_menores = 0, contador_ceros = 0;
        System.out.println("cuantos numeros introducira?");
        cantidad_numeros = new int[sc.nextInt()];
        for (int i = 0; i < cantidad_numeros.length; i++) {
            System.out.println("ingrese el numero");
            cantidad_numeros[i] = sc.nextInt();
            if (cantidad_numeros[i] > 0) {
                contador_mayores++;
            } else if (cantidad_numeros[i] < 0) {
                contador_menores++;
            } else {
                contador_ceros++;
            }
        }
        System.out.println("mayores que 0: " + contador_mayores + "\nmenores que 0: " + contador_menores +
                "\niguales a 0: " + contador_ceros);
    }
}