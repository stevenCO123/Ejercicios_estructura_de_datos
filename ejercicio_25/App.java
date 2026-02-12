/*
*Ejercicio 25
*La política de cobro de una compañía telefónica es: cuando se realiza una llamada,
*  el cobro es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
*  los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del décimo minuto,
*  50 céntimos. Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de mañana,
*  15 %, y en turno de tarde, 10 %.
*  Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
*/
import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos;
        String dia, turno;
        double costoBase=0, impuesto,total;

        System.out.println("ingrese la duracion de la llamada en minutos");
        minutos = sc.nextInt();
        System.out.println("ingrese el dia");
        sc.nextLine();
        dia = sc.nextLine();
        System.out.println("ingrese el turno");
        turno = sc.nextLine();

        if (minutos <= 5) {
            costoBase = minutos * 1.0;
        } else if (minutos <= 8) {
            costoBase = 5 * 1.0 + (minutos - 5) * 0.8;
        } else if (minutos <= 10) {
            costoBase = 5 * 1.0 + 3 * 0.8 + (minutos - 8) * 0.7;
        } else {
            costoBase = 5 * 1.0 + 3 * 0.8 + 2 * 0.7 + (minutos - 10) * 0.5;
        }

        if (dia.equals("domingo")) {
            impuesto = costoBase * 0.03;
        } else {
            if (turno.equals("mañana")) {
                impuesto = costoBase * 0.15;
            } else {
                impuesto = costoBase * 0.10;
            }
        }

        total = costoBase + impuesto;

        System.out.println("costo base: " + costoBase + "\nimpuesto: " + impuesto + "\ntotal: " + total);

    }
}