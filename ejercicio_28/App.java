/*
*Ejercicio 28
*Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100.
* A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
* a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta
* el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra
* el número que había generado.
*/
import java.util.Scanner;
import java.util.Random;
public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto;
        int intento;
        int intentosMaximos;
        int intentosUsados;
        int intentosRestantes;
        boolean acertado;

        numeroSecreto = random.nextInt(100) + 1;
        intentosMaximos = 10;
        intentosUsados = 0;
        acertado = false;

        while (intentosUsados < intentosMaximos && !acertado) {

            intento = sc.nextInt();
            intentosUsados++;
            intentosRestantes = intentosMaximos - intentosUsados;

            if (intento == numeroSecreto) {
                acertado = true;
                System.out.println("Correcto en " + intentosUsados + " intentos");
            } else if (intento < numeroSecreto) {
                System.out.println("Mayor. Intentos restantes: " + intentosRestantes);
            } else {
                System.out.println("Menor. Intentos restantes: " + intentosRestantes);
            }
        }

        if (!acertado) {
            System.out.println("Perdiste. El numero era: " + numeroSecreto);
        }
    }
}