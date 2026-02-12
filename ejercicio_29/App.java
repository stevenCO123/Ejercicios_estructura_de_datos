/*
*Ejercicio 29
*Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma
* y la media de todos los números introducidos.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input, suma=0, media=0;
        do {
            System.out.println("ingrese un numero");
            input = sc.nextDouble();
            suma = suma + input;
            media++;
        }while(input != 0);
        media = suma/media;
        System.out.println("la suma de los numeros es: " + suma + "\nla media es: " + media);


    }
}