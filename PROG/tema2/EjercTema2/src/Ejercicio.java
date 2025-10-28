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


        scanner.close();



    }
    public void ejercicio5NotionTema2(){
        /*Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
        Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).

        */
        //1.pide edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la edad");
        int edad = scanner.nextInt();
        System.out.println("Introduce si tiene carnet de conducir (true/false)");
        boolean carnet =scanner.nextBoolean();
        //2.operaciones y 3.salida datos

        boolean alquilarcoche = (edad>=21 && carnet==true);
        System.out.println("Puede alquilar coche?"+alquilarcoche);

        scanner.close();


    }
    public void ejercicio6NotionTema2(){
        /*Escribe un programa que pida el precio de un producto y el porcentaje de descuento. Calcula el precio fina
        l después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
        */
        //1.pide edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precioInicial = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de descuento");
        double descuento =scanner.nextDouble();
        //2.operaciones y 3.salida datos
        double precioFinal = precioInicial *(descuento/100);
        System.out.println("El precio inicial del producto es "+precioInicial+ "€");
        System.out.println("El valor del descuento es "+descuento+ "%");
        System.out.println("El precio final del producto es "+precioFinal+ "€");
        scanner.close();

    }


    public void ejercicio7NotionTema2(){
        /*Crea un programa que pida al usuario su edad y si es estudiante (true/false).
        Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos: descuento joven (menor de 26 años),
         descuento estudiante, o descuento especial (menor de 26 Y estudiante).*/


        //1.pide edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad = scanner.nextInt();
        System.out.println("Eres estudiante? (true/false):");
        boolean estudiante =scanner.nextBoolean();


        //2.operaciones y 3.salida datos
        boolean descuentojoven = edad<26;//se pone boolean y no double xk queremos saber si le pertenece el % no el monto
        boolean descuentoestudiante= estudiante==true;
        boolean descuentoespecial= (edad<26)&&(estudiante==true);


            System.out.println("\nResultados de descuentos:");
            System.out.println("Descuento joven: " + descuentojoven);
            System.out.println("Descuento estudiante: " + descuentoestudiante);
            System.out.println("Descuento especial (joven y estudiante): " + descuentoespecial);

        scanner.close();

    }



    public void ejercicio8NotionTema2(){
        /*Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres, el promedio, el resultado de multiplicar
el primero por el segundo y dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.*/


        //1.pide edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce N1:");
        int n1 = scanner.nextInt();
        System.out.println("Introduce N2");
        int n2 = scanner.nextInt();
        System.out.println("Introduce N3");
        int n3 = scanner.nextInt();


        //2.operaciones y 3.salida datos
      int suma = n1+n2+n3;
      double promedio =suma/3;
      double resultado= (n1*n2)/n3;



        System.out.println("La suma de los 3 es:  " + suma);
        System.out.println("El promedio: " + promedio);
        System.out.println("Multiplicacion del primero por el segundo entre el tercero: " + resultado);


        scanner.close();

    }

    public void ejercicio9NotionTema2(){
        /*Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media y usa operadores
         relacionales para determinar si ha aprobado (>=5),
         si tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.*/

        //1.pide edad por consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce nota1:");
        int nota1 = scanner.nextInt();
        System.out.println("Introduce nota2");
        int nota2 = scanner.nextInt();
        System.out.println("Introduce nota3");
        int nota3 = scanner.nextInt();


        //2.operaciones y 3.salida datos
        int suma = nota1+nota2+nota3;
        double media =suma/3;
        boolean aprobado =(media>=5);
        boolean notable=(media >=7);
        boolean sobresaliente =(media >=9);




        System.out.println("La media es:  " + media);
        System.out.println("¿ha aprobado? " + aprobado);
        System.out.println("¿tiene notable? " + notable);
        System.out.println("¿tiene sobresaliente? " + sobresaliente);


        scanner.close();

    }


    public void ejercicioNotion10Tema2(){
        /*
        Crea un programa que pida el salario base por hora,
        las horas trabajadas y si ha hecho horas extra (true/false).
        Si ha hecho horas extra y trabajó más de 40 horas,
        las horas que excedan de 40 se pagan al doble.
        Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
         */
        //1.pide datos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el salario base");
        int salarioBaseHora = scanner.nextInt();
        System.out.println("Indica horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has realizado horas extas");
        boolean horasExtras = scanner.nextBoolean();
        // 60
        //2.calculos
        boolean condicionExtras = horasTrabajadas>40 && horasExtras;
        // si condicionExtras es true
        int horasExtrasTotal = horasTrabajadas -40;
        int salarioBase = 40*salarioBaseHora;
        int salarioBaseExtra = horasExtrasTotal* salarioBaseHora*2;
        int salarioTotal = salarioBase+salarioBaseExtra;
        System.out.println("Has cobrado un total de "+salarioTotal);
        System.out.println("Has cobrado un base de "+salarioBase);
        System.out.println("Has cobrado un extra de "+salarioBaseExtra);

        // en caso contrario
        salarioBase = 40*salarioBaseHora;

    }















}
