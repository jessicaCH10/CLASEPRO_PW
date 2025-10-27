import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos() {

        // unarios
        int operandoUno = 5;
        // incremento -> para poder hacer un contador
        operandoUno++; // le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;

        System.out.println("El valor del operando uno despues de los incrementos es " + operandoUno);
        System.out.println("El valor del operando uno despues de los incrementos es "+operandoUno);
        // decremento -> le resta uno al valor que ya tenia ej pin movil
        operandoUno--;
        operandoUno--;
        operandoUno--;



        System.out.println("El valor del operando uno despues de los decrementos es "+operandoUno);
        // binaros -> dos operadores: suma (+) resta (-) multi (*) div (/) modulo-resto division (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        int resta = operandoUno-operandoDos;
        System.out.println("El resutaldo de la resta es "+ resta);
        int multi = operandoUno*operandoDos;
        System.out.println("El resultado de la multi es "+multi);
        double division = (double) operandoUno/operandoDos; // 8.0/3
        System.out.println("El resultado de la division es "+division);
        int modulo = operandoUno%operandoDos;
        System.out.println("El modulo de la division es "+modulo);
        // me vale para saber si un numero es par o impar

    }

//seran utilizados como condiciones para ejecutar una parte del codigo u otra
    public void operadoresComparacion(){
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno>operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operandoUno<operandoDos;
        System.out.println("El resultado de la comparacion es "+resultado);
        resultado = operandoUno<=operandoDos;
        resultado = operandoUno>=operandoDos;
        resultado = operandoUno==operandoDos;
        resultado = operandoUno!=operandoDos;
        // cuanto quieres cobrar
        // cuantos años tienes
        // tienes carnet
    }

    // operadorComparacion
    public void operadoresLogicos(){
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = true;
        // conducir = !conducir;

        System.out.println("El candidato puede conducir: "+!conducir);
        // cuando quiere cobrar menos de 30000 y tiene menos de 40 y puede conducir
        boolean candidatoValido = sueldo<30000 && edad<40 && conducir; // true
        candidatoValido = (sueldo<20000) || (edad<25 ||conducir && sueldo>25000 && edad >60);
        // F           ||  T || T
        // T && F && F -> F
        System.out.println("El candidato es valido: "+candidatoValido);
    }

    public void cambioTipos(){
        double numeroDecimal = 5.98;
        int numeroEntero = 6;
        double numero = numeroEntero;
        // System.out.println((int)numeroDecimal);
        // System.out.println((double) numeroEntero);
        // System.out.println(numeroEntero);
        String palabra = "12";
        int numeroPalabra = Integer.parseInt(palabra);

        String palabraBool = "true";
        boolean palabraBoolean = Boolean.parseBoolean(palabraBool);
        // System.out.println(palabraBoolean);
        // System.out.println(numeroPalabra+10);

        int numeroEvaluar = 12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar);

        boolean acierto = true;
        String aciertoStr = String.valueOf(acierto); // "true"

    }
    //EXPLICACION SCANNER es como un string, es una clase tipo scanner
    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado = sueldo<=20000 && edad<40 && conducir;
        System.out.println("Evaluando al candidato "+nombre);
        System.out.println("La evaluacion del candadato es: "+resultado);
    }


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





}
