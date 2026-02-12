/*
*Ejercicio 26
*Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente.
* Si introducimos otro número nos da un error.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("ingrese el dia de la semana (del 1 al 7)");
        input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("error el numero introducido no es valido");
                break;
        }
    }
}