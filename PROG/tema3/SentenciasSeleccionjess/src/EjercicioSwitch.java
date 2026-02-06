import java.util.Scanner;

public class EjercicioSwitch {



    public void ejercicio1Switch() {
         /*Crea un programa que pida un número del 1 al 7 y use un switch para mostrar el día de la semana
          correspondiente (1=Lunes, 2=Martes, etc.)..*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                // cuerpo cuando la variable toma valor 1

                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor no contemplado");

        }

        System.out.println("fin");
        scanner.close();

    }

    public void ejercicio2Switch() {
         /*Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para
         mostrar el mensaje correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una letra de calificación (A, B, C, D, F)");
        char letra = scanner.next().charAt(0);

        switch (letra) {
            case 'A':
                // cuerpo cuando la variable toma valor 1

                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Muy bien");
                break;
            case 'C':
                System.out.println("Bien");
                break;
            case 'D':
                System.out.println("Suficiente");
                break;
            case 'F':
                System.out.println("Insuficiente");
                break;

            default:
                System.out.println("Valor no contemplado");

        }

        System.out.println("fin");
        scanner.close();

    }

    public void ejercicio3Switch() {
         /*Escribe un programa que pida dos números y una operación (+, -, *, /). Usa un switch para realizar
         la operación correspondiente y mostrar el resultado..*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int n1 = scanner.nextInt();
        System.out.println("Introduzca un numero");
        int n2 = scanner.nextInt();
        System.out.println("Introduzca una operación (+, -, *, /)");
        char operacion = scanner.next().charAt(0);
        double resultado;
        switch (operacion) {
            case '+':
                resultado =n1+n2;
                System.out.println("el resultado de la operación suma es: " +resultado);
                break;
            case '-':
                resultado=n1-n2;
                System.out.println("el resultado de la operación resta es: " +resultado);
                break;
            case '*':
                resultado=n1*n2;
                System.out.println("el resultado de la operación multi es: "+resultado);
                break;
            case '/':
                resultado=n1/n2;
                System.out.println("el resultado de la operación divi es: "+resultado);
                break;


            default:
                System.out.println("Valor no contemplado");

        }

        System.out.println("fin");
        scanner.close();

    }

    public void ejercicio4Switch() {
         /*Crea un programa que muestre un menú con 4 opciones: 1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir.
         Pide al usuario que elija una opción y usa un switch para mostrar el mensaje correspondiente a cada opción.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.println("Elige una opción");
        int opcion =scanner.nextInt();

        switch (opcion) {
            case 1:

                System.out.println("Has seleccionado:Ver perfil");
                break;
            case 2:
                System.out.println("Has seleccionado:Configuración");
                break;
            case 3:
                System.out.println("Has seleccionado:Ayuda");
                break;
            case 4:
                System.out.println("Has seleccionado:Salir");
                break;


            default:
                System.out.println("Valor no contemplado");

        }

        System.out.println("fin");
        scanner.close();

    }

    public void ejercicio5Switch() {
         /*Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación
          del año: Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Estaciones");
        System.out.println("Introduce un mes del año con numero del 1 al 12");
        int opcion =scanner.nextInt();

        switch (opcion) {
            case 12,1,2 -> {
                System.out.println("Invierno");

            }
            case 3,4,5 -> {
                System.out.println("Primavera");

            }
            case 6,7,8 -> {
                System.out.println("Verano");

            }
            case 9,10,11 -> {
                System.out.println("Otoño");

            }

            default -> {
                System.out.println("Datos incorrectos");
                // resultado = 0
            }
        }

        System.out.println("fin");
        scanner.close();

    }

    







}
