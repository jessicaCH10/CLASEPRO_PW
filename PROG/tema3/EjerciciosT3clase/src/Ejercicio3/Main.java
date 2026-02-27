package Ejercicio3;

import java.util.Scanner;

public interface Main {

/*Crea un programa que permita al usuario crear una pizza personalizada
eligiendo ingredientes desde un menú.
Reglas:
• El programa muestra al usuario un menú con al menos cinco ingredientes
posibles y su precio individual. Ejemplo: queso (10), jamón (15), piña
(8), tomate (6), pepperoni (12). SWITCH
• El usuario puede agregar hasta 5 ingredientes diferentes a su pizza,
eligiendo uno por uno. El programa debe evitar la cantidad máxima no
se supere. HASTA 5 INGRED
• Por cada ingrediente elegido, el programa suma el precio
correspondiente.POR CADA ING SUMA PRECIO
• Después de cada selección, muestra al usuario la lista actual de
ingredientes y el subtotal acumulado. LISTA INGRED Y SUBTOTAL ACUMULADOS
• Cuando el usuario termina, muestra la pizza final detallada (con todos
los ingredientes seleccionados) y el total a pagar. FINAL TOTAL Y PIZZA FIINAL
Un ejemplo sería el siguiente
Bienvenido al menú de pizzas personalizadas:
1. Queso (10)
2. Jamón (15)
3. Piña (8)
4. Tomate (6)
5. Pepperoni (12)
Ingresa el número del ingrediente que quieres agregar (o 0 para terminar):
> 1 (Elige queso)
> 2 (Elige jamón)
> 5 (Elige pepperoni)
> 0 (Termina selección)
Tu pizza tendrá: Queso, Jamón, Pepperoni
El total a pagar es: $37
¡Gracias por tu pedido!*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int precioPizza=0;
        String ingredientesString ="";
        System.out.println("El menu de pizza es ");
        System.out.println("1. Queso");
        System.out.println("2. Jamon");
        System.out.println("3. Piña");
        System.out.println("4. Tomate");
        System.out.println("5. Pepperoni");
        System.out.println("0. Salir");
        System.out.println("Indica el numero de ingrendientes");
        int numeroIngredientes = scanner.nextInt();


        for (int i = 0; i < numeroIngredientes; i++) {
            System.out.println("Indica el ingrediente a agregar");//esto tiene que entrar en el for para que se repita cada vuelta
                int ingrediente= scanner.nextInt();
                if (ingrediente>5){
                    System.out.println("Ingrediente no valido");
                }
                else if (ingrediente==0){//cuando quiero que un else tenga una condicion tiene q ser else if
                    break;//rompe el bloque de repeticion mas cercano
                }
                switch (ingrediente){

                    case 1 ->{
                        precioPizza +=10;
                        ingredientesString += " Queso";
                    }
                    case 2 ->{
                        precioPizza +=15;
                        ingredientesString += " Jamon";
                    }
                    case 3 ->{
                        precioPizza +=8;
                        ingredientesString += " Piña";
                    }
                    case 4 ->{
                        precioPizza +=6;
                        ingredientesString += " Tomate";
                    }
                    case 5 ->{
                        precioPizza +=12;
                        ingredientesString += " Pepperoni";
                    }


                }
        }
        // ejecutado despues de un break o cuando termina el for
        System.out.println("El precio de la pizza es "+precioPizza);
        System.out.println("Los ingredientes de la pizza son "+ingredientesString);


    }



}
