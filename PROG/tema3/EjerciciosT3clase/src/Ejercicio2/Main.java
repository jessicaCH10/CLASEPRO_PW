package Ejercicio2;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {


        /*Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
        las siguientes acciones:
        a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
        b. El programa debe seleccionar aleatoriamente una palabra del array y
        almacenarla como la palabra secreta.
        c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
        d. En cada intento, el usuario introduce una palabra por teclado.
        e. Tras cada intento, el programa debe indicar al usuario:
        i. Aciertos: cuántas letras tiene en la misma posición que la palabra
        secreta.
        ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
        posición diferente.
        iii. Fallos: cuántas letras no están presentes en la palabra secreta.
        El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.*/



        String palabraSistema = "frase", palabraUsuario;//hacemos nosotros la palabra secreta ya que aun no sabemos arrays frase
        Scanner scanner = new Scanner(System.in);//vamos a pedir datos
        int intentos = 5,numeroAcierto =0, numeroAprox=0, numeroFallos=0;//cuando tenemos varias variables con el ismot ipo lo podemos poner asi


        do{
            System.out.println("Introduce la palabra");//pedir 5 veces
            palabraUsuario = scanner.next();
            intentos--;
            //reseteamos en cada intento que si no se incrementa
            numeroAprox =0;
            numeroAcierto=0;
            numeroFallos=0;

            for (int i=0;i<5;i++) {

                if (palabraSistema.equals(palabraUsuario)){//acierta toda la palabra para comparar string .equals
                    numeroAcierto = palabraSistema.length();
                    break;
                } else if (palabraSistema.charAt(i) == palabraUsuario.charAt(i)) {//acierta 1 letra

                    numeroAcierto++;
                    // s -> frase

                } else if (palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))) {//metodo contains contiene solo admtite string, String.value es un parseo porque si no da fallo porque espera un string y le damos oslo letra
                    numeroAprox++;//aproximacion la letra esta dentro de la palabra
                }else{
                    numeroFallos++;//fallo
                }


            }
            System.out.println("Los aciertos en este intento eson "+numeroAcierto);
            System.out.println("Los aprox en este intento eson "+numeroAprox);
            System.out.println("Los fallos en este intento eson "+numeroFallos);

        }while(intentos > 0 && numeroAcierto<5);//primero pusimos || que es o y luego pusimos && que es y en este caso si uno es falso es to-do falso,
        // cuando quiero que el sistema me vuelva a pedir entrar en el bucle
        //cuadno me quedan intentos y cuando los aciertos sean menor q 5 q es la longuitud d la palabra (no todas las letras como acierto)
        //cuando termina cuando no te quedan intentos o cuando los aciertos son 5


        if (numeroAcierto==5){
            System.out.println("Palabra acertada correctamente");
        }


    }



}
