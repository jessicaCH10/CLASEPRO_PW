import java.util.Scanner;

public class EjerciciosFor {



    public void ejercicio61For() {
         /*Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tablas de multiplicar");
        System.out.println("Introduce un numero del 1 al 10");
        int opcion =scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, opcion, i * opcion);
        }

        System.out.println("fin");
        scanner.close();

    }



    public void ejercicio71For() {
        /*Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde
         1 hasta N. Muestra el resultado final.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();

        int suma = 0;
        String cadena = "Sumando: ";

        for (int i = 1; i <= n; i++) {
            suma += i;
            cadena += i;              // concatenamos el número
            if (i < n) {
                cadena += " + ";      // añadimos el + si no es el último
            }
        }

        System.out.println(cadena);
        System.out.println("La suma de números del 1 al " + n + " es: " + suma);





        System.out.println("fin");
        scanner.close();


    }



    public void ejercicioejemplo() {
        /*Crea un programa ue pida un número N y use un bucle for para calcular la suma de todos los números desde
         1 hasta N. Muestra el resultado final.*/


        for (int i = 0; i < 5; i++) {
            System.out.println("Iteración número: " + i);
        }




        System.out.println("fin");



    }
    public void Rombo() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura de la mitad del rombo (n >= 1): ");
        int n = scanner.nextInt();// el tamaño del rombo

        if (n < 1) {
            System.out.println("El valor debe ser >= 1.");
            return;
        }

        // Mitad superior
        for (int i = 1; i <= n; i++) {// variable i es la variable que necesita el bucle
            // Espacios
            for (int s = 1; s <= n - i; s++) {// variable s para los espacios
                System.out.print(" ");
            }
            // Asteriscos
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Mitad inferior
        for (int i = n - 1; i >= 1; i--) {
            // Espacios
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int a = 1; a <= (2 * i - 1); a++) {
                System.out.print("*");
            }
            System.out.println();
        }




        System.out.println("fin");
        scanner.close();


    }



    public void ejercicio6For() {
        /*Escribe un programa que pida un número y use un bucle for para mostrar su tabla de multiplicar del 1 al 10.*/

        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla del 1 al 10
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }



        System.out.println("fin");
        scanner.close();


    }

    public void ejercicio7For() {
        /*Crea un programa que pida un número N y use un bucle for para calcular la suma de todos los números desde 1 hasta N.
         Muestra el resultado final.*/

        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla del 1 al 10
        System.out.println("Tabla del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }



        System.out.println("fin");
        scanner.close();


    }
    public void ejercicio8For() {
        /*Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números
        pares e impares hay desde 1 hasta N. Muestra ambos contadores.*/

        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        //contadores
        int pares=0;
        int impares=0;

        System.out.println("Recorriendo numeros del 1 al "+n);
        // numeros pares

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                pares++;     // si es par
            } else {
                impares++;   // si es impar
            }

        }

        // Mostrar resultados
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);



        System.out.println("fin");
        scanner.close();


    }

    public void ejercicio9For() {
        /*Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for.
         El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1*/

        Scanner scanner = new Scanner(System.in);

        // Pedir número al usuario
        System.out.print("Introduce un número: ");
        int n = scanner.nextInt();
        // Validar que sea positivo
       /* if (n < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = 1; // usamos long por si el número es grande

            // Bucle for para calcular el factorial
            for (int i = 1; i <= n; i++) {
             factorial = factorial * i;//porque el bucle va cambiando *1,*2.,*3...n
            }

            // Mostrar resultado
            System.out.println("El factorial de " + n + " es: " + factorial);*/




            if (n < 0) {
                System.out.println("El número debe ser positivo.");
            } else {
                System.out.println("Calculando " + n + "!");

                // Mostrar la cadena de multiplicación con print(i) para que sea la misma linea
                for (int i = n; i >= 1; i--) {
                    if (i != 1) {
                        System.out.print(i + " x ");
                    } else {//cuando i==1
                        System.out.print(i); // último número sin "x"
                    }
                }
                System.out.println(); // salto de línea

                // Calcular el factorial
                int factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial = factorial * i;
                }

                // Mostrar resultado
                System.out.println("El factorial de " + n + " es: " + factorial);
            }

        System.out.println("fin");
        scanner.close();

    }


    public void ejercicio10For() {
        /*Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones,
         2=Abdominales, 3=Sentadillas. Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer
         . Usa un switch para determinar el ejercicio y un for para contar las repeticiones una a una.*/

        Scanner scanner = new Scanner(System.in);

        // Mostrar menú
        System.out.println("Elige un ejercicio:");
        System.out.println("1 = Flexiones");
        System.out.println("2 = Abdominales");
        System.out.println("3 = Sentadillas");

        // Leer opción
        System.out.print("Introduce el número de tu elección: ");
        int opcion = scanner.nextInt();

        // Leer repeticiones
        System.out.print("¿Cuántas repeticiones quieres hacer?: ");
        int repeticiones = scanner.nextInt();

        // Switch para determinar el ejercicio
        switch (opcion) {
            case 1:
                System.out.println("Has elegido FLEXIONES");
                for (int i = 1; i <= repeticiones; i++) {
                    System.out.println("Flexión " + i);
                }
                break;

            case 2:
                System.out.println("Has elegido ABDOMINALES");
                for (int i = 1; i <= repeticiones; i++) {
                    System.out.println("Abdominal " + i);
                }
                break;

            case 3:
                System.out.println("Has elegido SENTADILLAS");
                for (int i = 1; i <= repeticiones; i++) {
                    System.out.println("Sentadilla " + i);
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }




        System.out.println("fin");
        scanner.close();


    }






    }























