/*
*Ejercicio 12
*Dadas dos variables numéricas A y B,
*  que el usuario debe teclear,
*  se pide realizar un algoritmo que intercambie los valores de ambas variables y
*  muestre cuanto valen al final las dos variables.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int variableA, variableB, contenedor=0;
        System.out.println("ingrese el valor entero de la variable A");
        variableA = sc.nextInt();
        System.out.println("ingreese el valor entero de la variable B");
        variableB = sc.nextInt();
        contenedor = variableA;
        variableA = variableB;
        variableB = contenedor;
        System.out.println("variable A: " + variableA + "\nvariable B: " + variableB);
    }
}