import java.util.Scanner;

public class Ejercicio {


    //1. introducir valores (LO PONEMOS FUERA DE LOS METOSOS XK LO VAMOS A UTILIZAR EN TODOS)
    private Scanner lecturaTeclado; // private todas las cosas que van en una clase privadas null hasta que no se utilice no damos valor xra ahorra espacio

        /*
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar)
     */

    public void ejercicio1(){ //no es necesario static xk lo llamamos desde el main
        //2. guardar en variables
        lecturaTeclado= new Scanner(System.in);
        System.out.println("cuantos boatas vais a pedir?");
        int numeroBocatas =lecturaTeclado.nextInt();
        System.out.println("cuantos bebidas vais a pedir?");
        int numeroBebidas =lecturaTeclado.nextInt();
        System.out.println("cuanto cuesta cada bocata?");
        double precioBocata =lecturaTeclado.nextDouble();
        System.out.println("cuanto cuesta cada bebida?");
        double precioBebida =lecturaTeclado.nextDouble();
        System.out.println("cuantos personas entran en la cuenta?");
        int personas =lecturaTeclado.nextInt();


        //3. Realizar calculos
        double precioBocatas = numeroBocatas*precioBocata;
        double precioBebidas = numeroBebidas*precioBebida;
        double costeTotal = precioBebidas+precioBocatas;
        double precioPersona = costeTotal/personas;
        //4. Mostrar datos
        System.out.printf("el precio total de bebidas es %.2f%n ",precioBebidas);
        System.out.printf("el precio total de bocadillos es %.2f%n",precioBocatas);
        System.out.printf("el precio total es %.2f%n",costeTotal);
        System.out.printf("el precio por persona es %.2f%n",precioPersona);
        lecturaTeclado.close();//es mejor cerrarlo el flujo de datos, buena practica
        lecturaTeclado = null;//para eliminarlo de memoria
    }


    public void ejercicio2(){

/*Permítase introducir el valor con IVA de una compra con dos decimales (la
compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha
compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto fue
el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)
*/

//1. introducir valor compra con dos decimales Y IVA tipo entero

       //decimal 0≥compra<=500
        lecturaTeclado= new Scanner(System.in);//para pedir datos siempre
        System.out.println("¿cuanto es el valor de la compra  (entre 0.00 y 500.00): ?");
        double valorCompra = lecturaTeclado.nextDouble();

        //entero 0≥iva<=25
        System.out.println("¿Cuanto es el valor del iva  (entre 0 y 25%)?");
        int valorIVA =lecturaTeclado.nextInt();
//2.operaciones
        //precio sin iva

        double precioSiniva= valorCompra / (1 + valorIVA / 100.0);

        //precio iva
        double IVAcompra= valorCompra -precioSiniva;

//3.salida de datos

        System.out.printf("El precio sin IVA es %.2f%n",precioSiniva);
        System.out.printf("El precio del IVA es %.2f%n",IVAcompra);


//4.cerrramos como buena practica
        lecturaTeclado.close();
        lecturaTeclado = null;//para eliminarlo de memoria


    }

    public void ejercicio3() {
        /*Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil,
centenas, decenas y unidades), y se obtiene el número correspondiente.
(Numero)*/

//1.introducir datos 2.guardar variables
        lecturaTeclado = new Scanner(System.in);//para pedir datos siempre
        System.out.println("¿Cuanto es las decenas de mil?");
        int decenasMil = lecturaTeclado.nextInt();
        System.out.println("¿Cuanto es unidades de mil?");
        int unidadesMil = lecturaTeclado.nextInt();
        System.out.println("¿Cuanto es las centenas");
        int centenas = lecturaTeclado.nextInt();
        System.out.println("¿Cuanto es las decenas");
        int decenas = lecturaTeclado.nextInt();
        System.out.println("¿Cuanto es las unidades");
        int unidades = lecturaTeclado.nextInt();
        //3.operaciones construit numero completo

        int numeroCompleto = decenasMil * 10000 + unidadesMil * 1000 + centenas * 100 + decenas * 10 + unidades;
        //4.salida datos
        System.out.println("el numero completo es: " + numeroCompleto);

        //5.cerrramos como buena practica
        lecturaTeclado.close();
        lecturaTeclado = null;//para eliminarlo de memoria


    }




    public void ejercicio4(){
         /*
    Hágase un programa que convierta segundos en horas, minutos y segundos.
     */
        //1.pedir datos
        lecturaTeclado= new Scanner(System.in);
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int seguntosTotal = lecturaTeclado.nextInt(); // 24973
        //2.realizar calculos
        // segundos -> 1 hora -> 3600
        // minutos -> 1 hora -> 60
        // segundos -> 1 minuto -> 60
        int horas = seguntosTotal/3600;
        int minutos = (seguntosTotal%3600)/60;
        int segundo = seguntosTotal%60;
        //3.mostras datos
        System.out.println("El numero de horas es "+horas);
        System.out.println("El numero de minutos es "+minutos);
        System.out.println("El numero de segundos es "+segundo);
        lecturaTeclado.close();
        lecturaTeclado = null;
        /*/*System.out.println("Indica un numero de 5 digitos");
        int numeroAnalizar = scanner.nextInt();
        if (numeroAnalizar >9999 && numeroAnalizar<100000){
        // 79050
            int decenasMil = numeroAnalizar/10000; // 7,9050
            // decenas de mil
            int unidadesMil = (numeroAnalizar%10000)/1000; // 9,050
            // unidades mil
            int centenas = ((numeroAnalizar%10000)%1000)/100; //0,50
            // centenas
            int decenas = (((numeroAnalizar%10000)%1000)%100)/10; // 5,0
            // decenas
            int unidades = (((numeroAnalizar%10000)%1000)%100)%10; // 0
            // unidades
        } else {
            System.out.println("Numero incorrecto");
        }

        // 98765 -> "98765"
        String numeroPalabra = String.valueOf(numeroAnalizar);
        int decenasMil = Integer.parseInt(String.valueOf(numeroPalabra.charAt(0)));
        String unidadesMil = String.valueOf(numeroPalabra.charAt(1));
        String centenas = String.valueOf(numeroPalabra.charAt(2));
        String decenas = String.valueOf(numeroPalabra.charAt(3));
        String unidades = String.valueOf(numeroPalabra.charAt(4));





    }
*/

    }
}
