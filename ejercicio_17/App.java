/*
*Ejercicio 17
*Escribe un programa que pida un nombre de usuario y una contraseña y
*  si se ha introducido correctamente indicar "Has entrado al sistema", sino se da un mensaje de error.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre_usuario, contraseña, input_usuario, input_contraseña;
        boolean indicador;
        System.out.println("hola usuario crea una cuenta");
        System.out.println("ingrese el nombre de usuario");
        nombre_usuario = sc.nextLine();
        System.out.println("ingrese la contraseña");
        contraseña = sc.nextLine();
        System.out.println("ahora inicia sesion");
        do{
            System.out.println("nombre de usuario");
            input_usuario = sc.nextLine();
            System.out.println("contraseña");
            input_contraseña = sc.nextLine();
            if(nombre_usuario.equals(input_usuario) && contraseña.equals(input_contraseña)){
                System.out.println("has entrado al sistema");
                indicador = false;
            }
            else {
                System.out.println("informacion incorrecta, vuelva a intentarlo");
                indicador = true;
            }
        }while(indicador);



    }
}