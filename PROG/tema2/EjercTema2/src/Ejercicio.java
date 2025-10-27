import java.util.Scanner;

public class Ejercicio {

    public void ejercicio1NotionTema2(){
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

    public void ejercicio2NotionTema2(){
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
        boolean igual = numero1==numero2;
        System.out.println("¿el n1 es igual que el n2? "+igual);
        boolean mayorque = numero1>numero2;
        System.out.println("¿el n1 es mayor que el n2? "+mayorque);
        boolean menorque = numero1<numero2;
        System.out.println("¿el n1 es mayor que el n2? "+menorque);
        boolean mayorigualque = numero1>=numero2;
        System.out.println("¿el n1 es mayor que el n2? "+mayorigualque);
        boolean menorigualque = numero1<=numero2;
        System.out.println("¿el n1 es mayor que el n2? "+menorigualque);
        boolean diferente = numero1!=numero2;
        System.out.println("¿el n1 es mayor que el n2? "+diferente);
        scanner.close();

    }

    public void ejercicio3NotionTema2(){
        /*
       Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores de asignación
        compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.
         */
        //1.valor inicial
        int numero =100;

        //2.operaciones y 3.salida datos
        System.out.println("Valor inicial: " + numero);

        numero += 50; // Suma 50
        System.out.println("Después de += 50: " + numero);

        numero -= 30; // Resta 30
        System.out.println("Después de -= 30: " + numero);

        numero *= 2; // Multiplica por 2
        System.out.println("Después de *= 2: " + numero);

        numero /= 4; // Divide entre 4
        System.out.println("Después de /= 4: " + numero);

    }

    public void ejercicio4NotionTema2(){
        /*
       Desarrolla un programa que pida un número al usuario y determine si
        es par o impar usando el operador módulo. Muestra el resultado por consola.
         */
        //1.pide numero por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero 1");
        int numero = scanner.nextInt();

        //2.operaciones y 3.salida datos

        boolean numeroPar = numero%2==0;
        System.out.printf("El numero %d es par: %b",numero,numeroPar);






    }










}
