/*
*Ejercicio 2
*Escribir un programa que pregunte al usuario su edad, y luego le diga cuántos años tendrá en 10 años.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte edad_usuario;
        System.out.println("hola usuario cual es tu edad?");
        edad_usuario = sc.nextByte();
        System.out.println("en 10 años tendras " + (edad_usuario+10) + " años");
    }
}