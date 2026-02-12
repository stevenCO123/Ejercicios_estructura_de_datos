/*
*Ejercicio 23
*La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
*  la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
* Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño,
* se requiere determinar cuánto recibirá un productor por la uva que entrega en un embarque, considerando lo siguiente:
*Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
*Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
*Realice un algoritmo para determinar la ganancia obtenida.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioInicial, kilos, ajuste, precioFinal, ganancia;
        int tamaño;
        String tipo;
        System.out.println("ingrese el precio inicial de la uva");
        precioInicial = sc.nextDouble();
        System.out.println("ingrese el peso (en kilos)");
        kilos = sc.nextDouble();
        System.out.println("ingrese el tipo de uva (A o B)");
        sc.nextLine();
        tipo = sc.nextLine();
        System.out.println("ingrese el tipo de tamaño (1 o 2)");
        tamaño = sc.nextInt();
        ajuste = 0;

        if (tipo.equals("A")) {
            if (tamaño == 1) {
                ajuste = 0.20;
            } else if (tamaño == 2) {
                ajuste = 0.30;
            }
        } else if (tipo.equals("B")) {
            if (tamaño == 1) {
                ajuste = -0.30;
            } else if (tamaño == 2) {
                ajuste = -0.50;
            }
        }

        precioFinal = precioInicial + ajuste;
        ganancia = precioFinal * kilos;
        System.out.println("el precio final es: " + precioFinal + "\nla ganancia es de: " + ganancia);
    }
}