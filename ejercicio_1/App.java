/*
*Ejercicio 1
*Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre_usuario;
        System.out.println("cual es tu nombre: ");
        nombre_usuario = sc.nextLine();
        System.out.println("hola " + nombre_usuario +" !!!");
    }
}