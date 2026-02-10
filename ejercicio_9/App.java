/*
*Ejercicio 9
*Una tienda ofrece un descuento del 15% sobre el total de la compra y
*  un cliente desea saber cuanto deberá pagar finalmente por su compra.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio_base;
        System.out.println("ingrese el precio base de la compra");
        precio_base = sc.nextDouble();
        System.out.println("el precio con el 15% de descuento aplicado es: " + (precio_base-(precio_base*0.15)));
    }
}