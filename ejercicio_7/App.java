/*
*Ejercicio 7
*Calcular la media de tres números pedidos por teclado
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("ingrese el primer numero para calcular la media");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero para calcular la media");
        numero2 = sc.nextInt();
        System.out.println("ingrese el tercer numero para calcular la media");
        numero3 = sc.nextInt();
        System.out.println("la media es: " + (numero1+numero2+numero3)/3);

    }
}