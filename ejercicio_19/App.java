/*
*Ejercicio 19
*Algoritmo que pida tres números y los muestre ordenados (de mayor a menor)
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        int contenedor;
        System.out.println("ingrese 3 numeros");
        System.out.println("ingrese el primer numero");
        numeros[0] = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numeros[1] = sc.nextInt();
        System.out.println("ingrese el tercer numero");
        numeros[2] = sc.nextInt();
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 2; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    contenedor = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = contenedor;
                }
            }
        }
        System.out.println("los numeros en orden son: " + numeros[0]+ numeros[1]+ numeros[2]);
    }
}