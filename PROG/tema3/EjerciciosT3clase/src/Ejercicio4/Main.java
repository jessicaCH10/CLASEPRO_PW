package Ejercicio4;

import java.util.Scanner;

public class Main {


/*4. Crea un programa para jugar una partida virtual de dardos entre dos
    jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
    partiendo desde 301.
    Reglas:

            • Nada más empezar pide el nombre de cada jugador
            • Cada jugador comienza con 301 puntos.
            • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
                aleatorio entre 0 y 60 (simulando puntuación en dardos).
            • La puntuación del turno es la suma de los 3 dardos.
            • Resta la puntuación del turno al total de puntos del jugador.
            • Si la puntuación restante es menor que 0, se considera que el jugador "se
                pasa" y su total no cambia ese turno.
            • El primer jugador que llegue exactamente a 0 gana la partida.
            • Después de cada turno, muestra las puntuaciones actuales y quién va
                ganando (el que tiene menos puntos).
             • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.*/


 /* do-while
            // for -> 3 tiradas
                aleatorio entre 0 60 -> restando a cada jugador
                // si en una tirada un jugador va a quedarse en negativo, no se resta
                    // puntosJ1 = 24
            mientras uno de los dos jugadores no haya llegado a 0 continua
         */






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Pedir nombres
        System.out.println("Nombre de jugador 1");
        String J1= scanner.nextLine();
        System.out.println("Nombre de jugador 2");
        String J2= scanner.nextLine();
        // 2. Puntuaciones iniciales
        int PuntosJ1 =301;
        int PuntosJ2 =301;
        // 3. Control de turnos
        boolean turnoJugador1 = true;//variable para saber de quién es el turno true = turno del jugador 1, false = turno del jugador
        int turnos = 0;//contador de turnos




                // Bucle principal del juego: se repite hasta que alguien llegue a 0
                do {

                    turnos++; // Contamos el turno

                    // Variables para trabajar con el jugador que está tirando
                    String jugadorActual;
                    int puntosActuales;

                    // Elegimos quién juega según el turno
                    if (turnoJugador1) {
                        jugadorActual = J1;
                        puntosActuales = PuntosJ1;
                    } else {
                        jugadorActual = J2;
                        puntosActuales = PuntosJ2;
                    }

                    System.out.println("\nTurno " + turnos + " - Juega: " + jugadorActual);

                    // Aquí guardaremos la suma de los 3 dardos
                    int sumaTurno = 0;

                    // FOR: cada turno tiene 3 dardos (empieza en 1 el for no en 0)
                     for (int i = 1; i <3 ; i++) {
                        int Dardo= (int) (Math.random()*61); // número aleatorio entre 0 y 60
                        System.out.println("Dardo " + i + ": " + Dardo);//i es el valor del dardo1,2 o 3
                        sumaTurno += Dardo;
                    }

                    System.out.println("Puntuación del turno: " + sumaTurno);

                    // Comprobamos si se pasa de 0
                    if (puntosActuales - sumaTurno < 0) {
                        System.out.println("¡Te has pasado! Tus puntos no cambian.");
                    } else {
                        puntosActuales -= sumaTurno; // Restamos la puntuación del turno
                    }

                    // Actualizamos la puntuación real del jugador correspondiente
                    if (turnoJugador1) {
                        PuntosJ1 = puntosActuales;
                    } else {
                        PuntosJ2= puntosActuales;
                    }

                    // Mostramos el marcador
                    System.out.println("\nMarcador actual:");
                    System.out.println(J1 + ": " + PuntosJ1);
                    System.out.println(J2 + ": " + PuntosJ2);

                    // Indicamos quién va ganando (el que tiene menos puntos)
                    if (PuntosJ1 < PuntosJ2) {
                        System.out.println("Va ganando: " + J1);
                    } else if (PuntosJ2< PuntosJ1) {
                        System.out.println("Va ganando: " + J2);
                    } else {
                        System.out.println("Están empatados.");
                    }

                    // Cambiamos de turno para el siguiente ciclo, cambio de turno
                    turnoJugador1 = !turnoJugador1;

                } while (PuntosJ1 != 0 && PuntosJ2 != 0); // Se repite mientras nadie haya llegado a 0

                // Cuando salimos del bucle, alguien ha ganado
                System.out.println("\n=== FIN DE LA PARTIDA ===");

                if (PuntosJ1 == 0) {
                    System.out.println("Ganador: " + J1);
                } else {
                    System.out.println("Ganador: " + J2);
                }

                System.out.println("La partida ha durado " + turnos + " turnos.");
            }
        }



























