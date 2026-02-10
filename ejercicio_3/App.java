/*
*Ejercicio 3
*Calcular el perímetro y área de un rectángulo dada su base y su altura.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base_rectangulo, altura_rectangulo, perimetro_rectangulo, area_rectangulo;
        System.out.println("calculadora de perimetro y area de un rectangulo");
        System.out.println("ingrese la base del rectangulo");
        base_rectangulo = sc.nextInt();
        System.out.println("ingrese la altura del rectangulo");
        altura_rectangulo = sc.nextInt();
        perimetro_rectangulo = 2*base_rectangulo +  2*altura_rectangulo;
        area_rectangulo = base_rectangulo*altura_rectangulo;
        System.out.println("perimetro = " + perimetro_rectangulo + "\narea = " + area_rectangulo);
    }
}