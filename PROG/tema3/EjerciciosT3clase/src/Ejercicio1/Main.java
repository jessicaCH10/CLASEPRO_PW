package Ejercicio1;

import java.util.Scanner;

public class Main {


    /*
        Crea un programa de adivinación de números El programa genera de manera
        aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
        máximo de 7 intentos. Después de cada intento, indica si el número es mayor
        o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
        de intentos utilizado; si no, mostrar un aviso de que debe introducir
        nuevamente un número.
         */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 7;
        // 0-50 esta funcion hace num aleatorios entre 0-0.9999 entonces como max si ponemos ej *10 sienpre va a ser un numero menor x eso se pone un nº+ del que queremos
        int numeroSistema= (int) (Math.random()*50)+1;//ojo te pide entre 1 (no 0) y 50 x eso se suma fuera 1 tambien adecta al 50 variable num aleatorio

        int numeroUsuario;//definimos variable fuera
        boolean acertado = false;//para poner si ha sido acertado
        System.out.println("El numero del sistema es " + numeroSistema);
        do {
            System.out.println("Introduce el numero para ver si aciertas");
            numeroUsuario = scanner.nextInt();//leemos numero
            intentos--;//ponemos en decremento  los intentos cada vez que introduce usuario un numero
            //condicion 1
            if (numeroUsuario == numeroSistema) {
                System.out.println("Numero acertado");
                acertado = true;
                break;//rompemos para no volver a preguntar cerramos bucle
            }
            System.out.println("Te quedan " + intentos + " intentos");//aqui va apareciendo el numero de intentos decrementando si lo has puesto anteriormente
            //condicion 2
            if (numeroSistema > numeroUsuario) {//otra condicion para saber si el numero a acertar es mayor o menor que el numero introducido por el usuario
                System.out.println("Numero mas pequeño");
            } else {
                System.out.println("Numero mas grande");
            }
        } while (intentos > 0);//repite el do siempre y cuando te queden intentos


        if (!acertado) {//si no es acertado
            System.out.println("Lo siento has perdido");
        }
        System.out.printf("Terminando el juego con %d intentos", 7 - intentos);// para poner el numero de intentos que vas llevando, formateo printf
    }









}
