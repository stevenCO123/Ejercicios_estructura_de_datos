/*
*Ejercicio 22
*Escribe un programa que reciba un mes y diga cuantos dias tiene este mes.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        System.out.println("ingrese un mes para saber sus dias");
        mes = sc.nextInt();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 ||
                mes == 8 || mes == 10 || mes == 12) {
            System.out.println("tiene 31 dias");
        }
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("tiene 30 dias");
        }
        else if (mes == 2) {
            System.out.println("tiene 28 dias");
        }
        else {
            System.out.println("mes invalido");
        }
    }
}