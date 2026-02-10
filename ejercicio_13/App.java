/*
*Ejercicio 13
*Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia d.
*  El que está detrás viaja a una velocidad mayor.
* Se pide hacer un algoritmo para ingresar la distancia entre los dos vehículos (km) y
*  sus respectivas velocidades (km/h) y
* con esto determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double velocidad1, velocidad2, distancia,tiempo;
        System.out.println("ingrese la velocidad del auto de adelante");
        velocidad1 = sc.nextDouble();
        System.out.println("ingrese la velocidad del auto de atras");
        velocidad2 = sc.nextDouble();
        System.out.println("ingrese la distancia entre los coches");
        distancia = sc.nextDouble();
        tiempo = distancia/(velocidad2-velocidad1)*60;
        System.out.println("el tiempo que se demora en alcanzarlo es: " + tiempo);
    }
}