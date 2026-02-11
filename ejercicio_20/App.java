/*
*Ejercicio 20
*Programa que lea 3 datos de entrada A, B y C.
*  Estos corresponden a las dimensiones de los lados de un triángulo.
*  El programa debe determinar que tipo de triángulo es, teniendo en cuenta:
*Si se cumple Pitágoras entonces es triángulo rectángulo
*Si sólo dos lados del triángulo son iguales entonces es isósceles.
*Si los 3 lados son iguales entonces es equilátero.
*Si no se cumple ninguna de las condiciones anteriores, es escaleno.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1,lado2,lado3, mayor, cateto1, cateto2;
        System.out.println("indentificador de triangulos");
        System.out.println("ingrese el primer lado del triangulo: ");
        lado1 = sc.nextDouble();

        System.out.println("ingrese el segundo lado del triangulo: ");
        lado2 = sc.nextDouble();

        System.out.println("ingrese el tercer lado del triangulo: ");
        lado3 = sc.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("Los valores ingresados no forman un triángulo.");
            return;
        }

        mayor = Math.max(lado1, Math.max(lado2, lado3));

        if (mayor == lado1) {
            cateto1 = lado2;
            cateto2 = lado3;
        } else if (mayor == lado2) {
            cateto1 = lado1;
            cateto2 = lado3;
        } else {
            cateto1 = lado1;
            cateto2 = lado2;
        }

        if (Math.pow(cateto1, 2) + Math.pow(cateto2, 2) == Math.pow(mayor, 2)) {
            System.out.println("Es un triángulo rectángulo.");
        }

        else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Es un triángulo equilátero.");
        }
        else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Es un triángulo isósceles.");
        }

        else {
            System.out.println("Es un triángulo escaleno.");
        }

    }
}