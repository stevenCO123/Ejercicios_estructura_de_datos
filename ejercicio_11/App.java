/*
*Ejercicio 11
*Pide al usuario dos pares de números x1,y2 y x2,y2, que representen dos puntos en el plano.
*  Calcula y muestra la distancia entre ellos.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double posicio_x1,posicio_x2,posicio_y1,posicio_y2,distancia;
        System.out.println("ingrese la posicion x del primer punto");
        posicio_x1 = sc.nextDouble();
        System.out.println("ingrese la posicion y del primer punto");
        posicio_y1 = sc.nextDouble();
        System.out.println("ingrese la posicion x del segundo punto");
        posicio_x2 = sc.nextDouble();
        System.out.println("ingrese la posicion y del segundo punto");
        posicio_y2 = sc.nextDouble();
        distancia = Math.sqrt(Math.pow((posicio_x2 - posicio_x1),2)+ Math.pow((posicio_y2 - posicio_y1),2));
        System.out.println("la distancia entre los dos puntos es: " + distancia);
    }
}