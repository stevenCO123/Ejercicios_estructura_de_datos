/*
*Ejercicio 8
*Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el vendedor desea saber cuanto
*  dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes y
*  el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double venta1,venta2,venta3,sueldo_base,comision;
        System.out.println("ingrese su sueldo base: ");
        sueldo_base = sc.nextDouble();
        System.out.println("ingrese la venta numero 1 del mes");
        venta1 = sc.nextDouble();
        System.out.println("ingrese la venta numero 2 del mes");
        venta2 = sc.nextDouble();
        System.out.println("ingrese la venta numero 3 del mes");
        venta3 = sc.nextDouble();
        comision = 0.1 * (venta1 + venta2 + venta3);
        System.out.println("el dinero que obtiene por las comisiones de las ventas es: " + comision);
        System.out.println("el total que recibira es: " + (sueldo_base + comision));
    }
}