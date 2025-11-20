import java.util.Scanner;

public class EjercicioIf {






    public void ejercicio1Tema3() {
         /* Crea un programa que pida la edad del usuario y determine si es mayor de edad (
         18 años o más).
     Muestra un mensaje indicando si puede votar o no.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("VOTACIÓN");
        System.out.println("Introduzca su edad ");
        int edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Si puede votar");
        } else {
            System.out.println("No puede votar");
        }


        System.out.println("Terminando la votación");
        scanner.close();

    }

    public void ejercicio2Tema3() {
         /*Desarrolla un programa que pida un número al usuario y determine si es positivo,
         negativo o cero. Muestra el resultado por consola.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMEROS");
        System.out.println("Introduzca un numero");
        int numero = scanner.nextInt();
        if (numero <0) {
            System.out.println("negativo");
        } else if (0==numero){

            System.out.println("cero");
        }else{
            System.out.println("positivo");
        }


        System.out.println("FIN");
        scanner.close();

    }

    public void ejercicio3Tema3() {
         /*scribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno ha
         aprobado (nota mayor o igual a 5) o ha suspendido.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("NOTA EXAMEN");
        System.out.println("Introduzca la nota");
        int nota = scanner.nextInt();
        if (nota>0 && nota<=10) {
            System.out.println("dentro de rango");
        }if (nota>=5){//si pongo if else no me entra por aqui
            System.out.println("aprobado");
        } else {
            System.out.println("suspenso");
        }


        System.out.println("FIN");
        scanner.close();

    }

    public void ejercicio4Tema3() {
         /*Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€, aplica un descuento
         del 10%. Muestra el importe original y el importe final a pagar.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("COMPRA");
        System.out.println("Introduzca importe compra");

        Double importeCompra= scanner.nextDouble();
        System.out.println("Valor original "+importeCompra+"€");

        if (importeCompra>=100) {
            double compraDescuento= importeCompra-((importeCompra*10)/100);

            System.out.println("Tiene descuento del 10%, TOTAL COMPRA C0N DESCUENTO:"+compraDescuento+"€");

        } else {
            System.out.println("NO TIENE DESCUENTO");
        }


        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio5Tema3() {
         /*Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
          Muestra un mensaje personalizado para cada caso..*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("PAR O IMPAR");
        System.out.println("Introduzca un numero");

        int numero= scanner.nextInt();


        if (numero%2==0) {


            System.out.println("ES NUMERO PAR");

        } else {
            System.out.println("ES IMPAR");
        }


        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio6Tema3() {
         /*Escribe un programa que pida la edad del usuario y determine si puede acceder a
         contenido para mayores de 16 años.
          Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONTENIDO ADULTO");
        System.out.println("Introduzca edad del usuario");

        int edad= scanner.nextInt();


        if (edad>=16) {


            System.out.println("ACCESO PERMITIDO");

        } else {
            System.out.println("ACCESO DENEGADO");
        }


        System.out.println("FIN");
        scanner.close();

    }


    public void ejercicio7Tema3() {
         /*Crea un programa que pida una nota numérica (0-10) y determine la calificación:
          Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONTENIDO ADULTO");
        System.out.println("Introduzca nota de examen");
        int nota =scanner.nextInt();
        // suspenso -> 0-4.99
        // aprobado -> 5-7.99
        // notable ->  8-8.99
        // sobresaliente -> 9-9.99
        // MH -> 10
        // nota = 9
        String resultadoExamen;// se inicializa para no tener que poner un syste.out.print.. en cada caso
        if (nota>0 && nota<=10){

            if (nota<5){
                resultadoExamen = "suspenso";
                //System.out.println("El examen esta suspenso");
            } else if (nota<8) {
                resultadoExamen = "aprobado";
                // System.out.println("El examen esta aprobado");
            } else if (nota<9) {
                resultadoExamen = "notable";
                // System.out.println("El examen es notable");
            } else if (nota<10) {
                resultadoExamen = "sobresaliente";
                // System.out.println("El examen es sobresaliente");
            } else {
                resultadoExamen = "MH";
                //System.out.println("El examen esta de MH");
            }
        } else {
            // System.out.println("La nota no esta en la escala correcta");
            resultadoExamen = "fuera de rango";
        }
        System.out.println(resultadoExamen);


        System.out.println("FIN");
        scanner.close();

    }



    public void ejercicio8Tema3() {
        /*Desarrolla un programa que pida dos números al usuario y
        determine cuál es mayor, o si son iguales. Muestra el resultado por consola.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("COMPARAR NUMEROS");
        System.out.println("Introduzca Numero 1:");
        int n1= scanner.nextInt();
        System.out.println("Introduzca Numero 2:");
        int n2= scanner.nextInt();

        if (n1>n2) {

            System.out.println("el numero "+n1+ " es mayor que "+n2);

        } else if (n2>n1) {
            System.out.println("el numero "+n2+ " es mayor que "+n1);
        }else if (n1==n2) {
            System.out.println("el numero " + n1 + " es igual que " + n2);
        }
        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio9Tema3() {
        /*Escribe un programa que pida el peso (en kg) y la altura (en metros)
         del usuario. Calcula el IMC (peso / altura²) y determina si está en peso normal
          (IMC entre 18.5 y 24.9), por
         debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("IMC");
        System.out.println("Introduzca el peso en kg del usuario: ");
        double peso= scanner.nextDouble();
        System.out.println("Introduzca la altura en metros del usuario: ");
        double altura= scanner.nextDouble();
        //calculos
        double imc = peso/ Math.pow(altura,2);
        if (imc >= 18.5 && imc <= 24.9) {// decimales se escibren con punto no con coma si no da error

            System.out.println("peso normal");

        } else if (imc<18.5) {
            System.out.println("por debajo del peso normal ");
        }else if (imc<24.9) {
            System.out.println("por encima del peso normal ");
        }
        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio10Tema3() {
        /*Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción. La altura mínima es 120 cm y la
        máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no, indica el motivo (demasiado bajo o demasiado alto).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("ALTURA ATRACCION");
        System.out.println("Introduzca el altura del usuario en cm");
        int altura = scanner.nextInt();

        //calculos

        if (altura >= 120 && altura <= 200) {// decimales se escibren con punto no con coma si no da error

            System.out.println("PUEDES SUBIR");

        } else if (altura<120) {
            System.out.println("demasiado bajo ");
        }else if (altura>200) {
            System.out.println("demasiado alto ");
        }
        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio11Tema3() {
        /*Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false). Aplica descuentos según estas reglas:
         Si es socio Y la compra es mayor o igual a 200€, descuento del 20%. Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€, descuento
         del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado y el importe final.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("COMPRA");
        System.out.println("Introduzca el importe de la compra");
        double compra = scanner.nextDouble();
        System.out.println("cliente es socio (true/false)");
        boolean socio = scanner.nextBoolean();
        //calculos

        if (socio && compra>= 200) {// el boolean se pone directamente para comparar no se iguala a true
            double compraDescuento20= compra-((compra*20)/100);
            System.out.println("descuento del 20% "+compraDescuento20+" €");

        } else if (socio && compra< 200) {
            double compraDescuento10= compra-((compra*10)/100);
            System.out.println("descuento del 20% "+compraDescuento10+" €");

        }else if (!socio && compra>= 300){
            double compraDescuento5= compra-((compra*5)/100);
            System.out.println("descuento del 20% "+compraDescuento5+" €");
        }
        System.out.println("FIN");
        scanner.close();

    }
    public void ejercicio12Tema3() {
        /*Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos: tener
        al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
         El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la contraseña es
         válida o no, indicando qué requisitos no cumple.

Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("CONTRASEÑA");
        System.out.println("Introduzca el importe de la compra");
        double compra = scanner.nextDouble();
        System.out.println("cliente es socio (true/false)");
        boolean socio = scanner.nextBoolean();
        //calculos

        if (socio && compra>= 200) {// el boolean se pone directamente para comparar no se iguala a true
            double compraDescuento20= compra-((compra*20)/100);
            System.out.println("descuento del 20% "+compraDescuento20+" €");

        } else if (socio && compra< 200) {
            double compraDescuento10= compra-((compra*10)/100);
            System.out.println("descuento del 20% "+compraDescuento10+" €");

        }else if (!socio && compra>= 300){
            double compraDescuento5= compra-((compra*5)/100);
            System.out.println("descuento del 20% "+compraDescuento5+" €");
        }
        System.out.println("FIN");
        scanner.close();

    }



    public void ejercicio13Tema3() {
        /*Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la
         semana (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17
         años: 5€ (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€.
         Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTRADAS");
        System.out.println("Introduzca la edad del usuario");
        int edadUsuario = scanner.nextInt();
        System.out.println("Introduce el dia de la semana día de la semana (1=Lunes, 2=Martes... 7=Domingo)");
        int dia = scanner.nextInt();

        //calculos

        double precio=0;// se inicializa para no tener que ponerlo constantemente
        //PRIMER BLOQUE
        if (edadUsuario <12) {

            precio=0;

        }
        //SEGUNDO BLOQUE
        else if (edadUsuario > 12 && edadUsuario < 17 ) {// 12<edadUsuario<17 no se puede poner asi la comparacion xk no funciona


            if (dia == 2) { // Martes un if dentro de un else if
                precio = 0;
            } else {
                precio = 5;
            }
        }
        //TERCER BLOQUE
        else if (edadUsuario >= 18 && edadUsuario <= 64){
                if (dia==4) { //jueves otro if dentro del else if
                    precio = 7;
                }else{
                 precio=10;
                }
            }
        //CUARTO BLOQUE
            else if (edadUsuario>=65){
                precio=6;
            }

        System.out.println("El precio de tu entrada es "+ precio +"€");
        scanner.close();

        }


    public void ejercicio14Tema3() {
        /*Desarrolla un programa que determine si una persona es elegible para un préstamo bancario. Pide: edad,
         ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son: Edad entre 21 y 65 años,
          ingresos mensuales de al menos 1000€, y NO tener deudas pendientes. El programa debe evaluar cada condición y
           mostrar si es elegible o no, explicando qué requisitos no cumple.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("PRESTAMO HIPOTECARIO");
        System.out.println("Introduzca la edad del usuario");
        int edad = scanner.nextInt();
        System.out.println("Introduce los ingresos mensuales");
        float ingresos = scanner.nextFloat();
        System.out.println("Tiene deudas pendientes (true/false) ");
        boolean deudas = scanner.nextBoolean();

        //variables booleanas se usan para guardar el resultado de cada condición por separado.
        boolean cumpleEdad = edad >= 21 && edad <= 65;// será true si la edad está entre 21 y 65.
        boolean cumpleIngresos = ingresos >= 1000;//será true si los ingresos son al menos 1000€.
        boolean sinDeudas = !deudas;// será true si NO tiene deudas (!deudas).

        /*¿Por qué se hace esto?
        - Para organizar el código y que sea más legible.
        - Para reutilizar esas condiciones en el if principal y también en los mensajes de error.
        - Para evitar repetir lógica como edad >= 21 && edad <= 65 varias veces.*/

        //decision final

        if (cumpleEdad && cumpleIngresos && sinDeudas) {
            System.out.println("Eres elegible para el préstamo.");
        }
        //explicacion de errores para prestamo
        else {
            System.out.println("No eres elegible para el préstamo. Motivos:");
            if (!cumpleEdad) {
                System.out.println("- La edad debe estar entre 21 y 65 años.");
            }
            if (!cumpleIngresos) {
                System.out.println("- Los ingresos mensuales deben ser de al menos 1000€.");
            }
            if (!sinDeudas) {
                System.out.println("- No debes tener deudas pendientes.");
            }
        }

        scanner.close();

    }


























    }


