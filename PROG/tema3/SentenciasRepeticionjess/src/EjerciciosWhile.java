import java.time.LocalTime;
import java.util.Scanner;

public class EjerciciosWhile {

    public void ejercicio1While() {
        /*Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N, mostrando cada número.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");

        System.out.println("Introduce un número N:");
        int N = scanner.nextInt();

        int contador = 1;//queremos empezar a contar en 1

        while (contador <= N) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("Fin del programa");

    }

    public void ejercicio2While() {
        /*Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta
         es "1234". Usa un bucle do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");

        System.out.println("Introduce contraseña");
        String password;

        do {
            password = scanner.nextLine();
            if (!password.equals("1234")) { //if se ejecuta cada vez que entras al bucle Su función es mostrar un mensaje si la contraseña está mal.
                //Si la contraseña NO es 1234 muestra error


                System.out.println("Contraseña incorrecta. Intenta de nuevo.");
            }
        } while (!password.equals("1234"));//decide si el bucle debe repetirse.controla la repetición del programa, no los mensajes. while no lleva llave de cierre porque mo abre un vloque
        //“Mientras la contraseña NO sea 1234, vuelve a pedirla.”

        System.out.println("contraseña valida");
        System.out.println("Fin del programa");


     /*Porque usan la misma condición:
•
•
Pero:
• 	El if controla qué pasa dentro del bucle.
• 	El while controla si el bucle continúa.
Imagina que estás en una puerta con un guardia.
🔹 El  sería el guardia diciendo: tu contraseña esta mal

🔹 El  sería la puerta diciendo: esta mal vuelve a intentarlo

Son dos cosas distintas aunque miran lo mismo.
  */
    }

    public void ejercicio3While() {
        /*Escribe un programa que pida números al usuario y los vaya sumando. El bucle while
        debe continuar mientras el usuario introduzca números positivos. Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar la suma total.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");


        int numero;

        int contador = 0;

        do {
            System.out.println("Introduce un número (0 o negativo para terminar): ");//se pide numero dentro del do para que no se haga bucle infinito xk si no no cambia de numero
            numero = scanner.nextInt();// se pone sin el int porq si no declaras dos veces la variable y da error

            if (numero > 0) {//los numeros son int y para decir que sea diferente de 0 se pone!= en este caso entra cuando sea positivo

                System.out.println("numero correcto.");
                contador++;
            }
        } while (numero > 0);//decide si el bucle debe repetirse.controla la repetición del programa, no los mensajes. while no lleva llave de cierre porque mo abre un vloque
        //“Mientras la contraseña NO sea 1234, vuelve a pedirla.”

        System.out.println("numero incorrecto.");
        System.out.println("El numero total denumeros positivos es " + contador);
        System.out.println("Fin del programa");


    }

    public void ejercicio4While() {
        /*Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7).
         Usa un bucle do-while para pedir al usuario que adivine el número. El programa debe indicar si el número es mayor o menor, y continuar hasta que el usuario acierte.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");
        System.out.println("Introduce un numero ente 1 y 10 a ver si es el correcto");
        int intentos = 1;
        int aleatorio = (int) (Math.random() * 10);


        int numero;


        do {

            numero = scanner.nextInt();// se pone sin el int porq si no declaras dos veces la variable y da error

            if (numero > aleatorio) {
                System.out.println("el numero introducido es mayor que el numero correcto");

            } else if (numero < aleatorio) {
                System.out.println("el numero introducido es menor que el numero correcto");
            }

        } while (aleatorio != numero);//decide si el bucle debe repetirse.controla la repetición del programa, no los mensajes. while no lleva llave de cierre porque mo abre un vloque
        //“Mientras la contraseña NO sea 1234, vuelve a pedirla.”

        System.out.println("numero correcto.");

        System.out.println("Fin del programa");


    }
    public void ejercicio5While() {
        /*Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones: 1=Saludar,
         2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir. Usa switch para procesar cada opción.
          El programa solo debe terminar cuando el usuario elija la opción 4.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENÚ");
        int opcion;//se declara fuera la variable
        System.out.println("1.saludar");
        System.out.println("2.despedirse");
        System.out.println("3.ver hora");
        System.out.println("4.salir");
        System.out.println("Introduce una opción");

        do {

            opcion = scanner.nextInt();//se asigna dentro del do xk si no sale bucle infinito no actualizaria nunc
            //solo nombre de la variable sin int en este caso

            switch (opcion) {
                case 1 -> {
                    System.out.println("hola que tal");

                }
                case 2 -> {
                    System.out.println("adios,hasta mañana.");
                }
                case 3 -> {
                    LocalTime hora = LocalTime.now();
                    System.out.println("Hora actual: " + hora);


                }

                case 4 -> {
                    System.out.println("Saliendo......");
                }
                default -> {
                    System.out.println("Opcion no contemplada");
                }
            }


        } while (opcion!=4);//decide si el bucle debe repetirse.controla la repetición del programa, no los mensajes. while no lleva llave de cierre porque mo abre un bloque
        //“Mientras la contraseña NO sea 1234, vuelve a pedirla.”
    //nombre!=4 em mumeros y si es palabra !nombre=palabra


        System.out.println("Fin del programa");


    }
    public void ejercicio6While() {
        /*Escribe un programa que pida un número N y use un bucle while para hacer una cuenta atrás desde N hasta 1,
         mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");
        System.out.println("Introduce un número N para iniciar la cuenta atrás:");

        int N = scanner.nextInt();   // Pedimos el número

        while (N > 1) {              // Mientras N sea mayor que 1
            System.out.println(N);   // Mostramos el número actual
            N--;                     // Restamos 1
        }

        // Cuando sale del while, N ya es 1
        System.out.println("1");
        System.out.println("¡Despegue!");



    }
    public void ejercicio7While() {
        /*Crea un programa que pida al usuario cuántas calificaciones va a introducir.
         Luego, usa un bucle while para pedir cada calificación una por una, sumarlas y al final calcular y mostrar el promedio.*/
        // Creamos el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos cuántas calificaciones va a introducir el usuario
        System.out.println("¿Cuántas calificaciones vas a introducir?");
        int cantidad = scanner.nextInt();   // Guardamos ese número

        int contador = 0;   // Contará cuántas notas llevamos introducidas
        double suma = 0;    // Acumulará la suma de todas las calificaciones

        // Bucle while: se repetirá hasta que contador llegue a 'cantidad'
        while (contador < cantidad) {

            // Pedimos la calificación correspondiente
            System.out.println("Introduce la calificación " + (contador + 1) + ":");
            double nota = scanner.nextDouble();  // Leemos la nota

            suma += nota;   // Sumamos la nota a la variable 'suma'
            contador++;     // Aumentamos el contador para avanzar a la siguiente nota
        }

        // Cuando salimos del while, ya tenemos todas las notas sumadas
        double promedio = suma / cantidad;   // Calculamos el promedio

        // Mostramos los resultados
        System.out.println("La suma total de las calificaciones es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
    public void ejercicio8While() {
        /*Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad
         introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida, muestra un mensaje de confirmación.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iniciando programa");


        int edad;



        do {
            System.out.println("Introduce edad usuario (de 0 a 120) ");//se pide numero dentro del do para que no se haga bucle infinito xk si no no cambia de numero
            edad = scanner.nextInt();// se pone sin el int porq si no declaras dos veces la variable y da error

            if (edad <= 0 && edad >= 120) {//usamos &&porque quiero que se den los dos a la vez y || significa o

                System.out.println("edad no valida");

            }
        } while (edad <= 0 && edad >= 120);//decide si el bucle debe repetirse.controla la repetición del programa, no los mensajes. while no lleva llave de cierre porque mo abre un vloque
        //“Mientras la contraseña NO sea 1234, vuelve a pedirla.”

        System.out.println("edad correcta");

        System.out.println("Fin del programa");


    }
    public void ejercicio9While() {
        /*Crea un programa que pida al usuario cuántos estudiantes hay en una clase. Para cada estudiante, usa
        un bucle while para pedir su calificación numérica (0-10). Luego, usa un bucle for para mostrar todas las
         calificaciones y usa un switch para convertir cada nota numérica en letra: 9-10=A, 7-8=B, 5-6=C, 3-4=D, 0-2=F.*/
        Scanner scanner = new Scanner(System.in);

        // 1. Pedimos cuántos estudiantes hay
        System.out.println("¿Cuántos estudiantes hay en la clase?");
        int cantidad = scanner.nextInt();

        // Creamos un array para guardar todas las calificaciones
        int[] notas = new int[cantidad];

        int i = 0; // contador para el while

        // 2. Bucle WHILE para pedir cada calificación
        while (i < cantidad) {
            System.out.println("Introduce la calificación del estudiante " + (i + 1) + " (0-10):");
            int nota = scanner.nextInt();

            // Validamos que esté entre 0 y 10
            if (nota < 0 || nota > 10) {
                System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
            } else {
                notas[i] = nota; // guardamos la nota válida
                i++;             // avanzamos al siguiente estudiante
            }
        }

        // 3. Bucle FOR para mostrar todas las calificaciones
        System.out.println("\nCalificaciones y equivalencias:");
        for (int j = 0; j < cantidad; j++) {

            int nota = notas[j];
            String letra;

            // 4. Convertimos la nota numérica en letra usando SWITCH
            switch (nota) {
                case 10, 9 -> letra = "A";
                case 8, 7 -> letra = "B";
                case 6, 5 -> letra = "C";
                case 4, 3 -> letra = "D";
                case 2, 1, 0 -> letra = "F";
                default -> letra = "Error"; // no debería ocurrir
            }

            System.out.println("Estudiante " + (j + 1) + ": " + nota + " → " + letra);
        }



    }
    public void ejercicio10While() {
        /*Desarrolla un programa que simule un cajero automático. El saldo inicial es 1000€. Usa un bucle do-while para
         mostrar un menú con opciones: 1=Consultar saldo, 2=Retirar dinero, 3=Depositar dinero, 4=Salir. Usa switch
         para cada opción. Para retirar dinero, usa un bucle while para validar que no se retire más del saldo disponible
         (si intenta retirar más, debe volver a pedir la cantidad). Para depositar, valida que sea una cantidad positiva.*/
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;   // Saldo inicial
        int opcion;

        do {
            // Menú principal
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    // Consultar saldo
                    System.out.println("Tu saldo actual es: " + saldo + "€");
                    break;

                case 2:
                    // Retirar dinero
                    double retiro;
                    System.out.println("¿Cuánto deseas retirar?");
                    retiro = scanner.nextDouble();

                    // Validación con WHILE
                    while (retiro > saldo || retiro < 0) {
                        System.out.println("Cantidad inválida. No puedes retirar más de " + saldo + "€.");
                        System.out.println("Introduce otra cantidad:");
                        retiro = scanner.nextDouble();
                    }

                    saldo -= retiro;
                    System.out.println("Has retirado " + retiro + "€. Saldo restante: " + saldo + "€");
                    break;

                case 3:
                    // Depositar dinero
                    double deposito;
                    System.out.println("¿Cuánto deseas depositar?");
                    deposito = scanner.nextDouble();

                    // Validación de cantidad positiva
                    if (deposito <= 0) {
                        System.out.println("El depósito debe ser una cantidad positiva.");
                    } else {
                        saldo += deposito;
                        System.out.println("Has depositado " + deposito + "€. Nuevo saldo: " + saldo + "€");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);  // Repetir hasta que elija salir


    }


}












































