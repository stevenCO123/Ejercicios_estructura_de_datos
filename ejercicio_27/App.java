/*
*Ejercicio 27
*Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los
* enteros entre 1 y el propio número y se representa por el número seguido de un signo de exclamación.
* Por ejemplo 5! = 1x2x3x4x5=120),
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, resultado=1;
        System.out.println("ingrese el numero que desea conocer su factorial");
        input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            resultado = resultado * i;
        }
        System.out.println("factorial: " + resultado);
    }
}