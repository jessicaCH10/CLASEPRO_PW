import java.util.Scanner;

public class Ejercicio {

    public void ejercicio1Notion4Tema2(){
        /*
        Crea un programa que pida al usuario dos números enteros por consola y muestre el
     resultado de las cinco operaciones aritméticas básicas: suma, resta, multiplicación, división y módulo (resto).
         */
        //1.pedir datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el numero 2");
        int numero2 = scanner.nextInt();
        //2.operaciones y 3.salida de datos
        int suma = numero1+numero2;
        System.out.println("La suma es "+suma);
        int resta =numero1-numero2;
        System.out.println("La suma es "+resta);
        int multi =numero1*numero2;
        System.out.println("La suma es "+multi);
        int divi =numero1-numero2;
        System.out.println("La suma es "+divi);
        int modulo =numero1%numero2;
        System.out.println("La suma es "+modulo);
        scanner.close();


    }

    public void ejercicio2Notion4Tema2(){
        /*
       Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones relacionales entre
        ellos (mayor que,menor que, igual, diferente, mayor o igual, menor o igual)..
         */
        //1.pedir datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el numero 2");
        int numero2 = scanner.nextInt();
        //2.operaciones y 3.salida de datos
        int suma = numero1+numero2;
        System.out.println("La suma es "+suma);
        int resta =numero1-numero2;
        System.out.println("La suma es "+resta);
        int multi =numero1*numero2;
        System.out.println("La suma es "+multi);
        int divi =numero1-numero2;
        System.out.println("La suma es "+divi);
        int modulo =numero1%numero2;
        System.out.println("La suma es "+modulo);
        scanner.close();


    }














}
