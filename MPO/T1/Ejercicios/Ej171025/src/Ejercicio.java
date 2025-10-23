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

    }
}
