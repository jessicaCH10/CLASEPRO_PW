package EjercicioPalabras;

import java.util.Scanner;

public class Main {

 /*
    Pedir por consola una frase. Una vez introducida. Indicar:
        1. Cuantas oraciones tiene -> separadas por un .
        2. Cuantas letras tiene
        3. Cuantas palabras tiene
        4. Cuantas letras tiene cada oracion (sin contar espacios ni símbolos de puntuación)
     */





    public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);
System.out.println("Introduce una frase");
String frase = scanner.nextLine();
        System.out.println("la frase es "+frase);
        //cuantas frases                            //si solo es una frase para analizar no poner array
        String[] frases = frase.split("\\.");// se ponen las barras \\ para que coja el caracter de manera literal y no sea un caracter especial,
        System.out.println("El numero de oraciones es " + frases.length);//cuenta las frases con frases.length longitud
        //cuantas letras tiene
        String fraseLetras = frase.replaceAll(",", "")//se hace un string nuevo(armario)metemos reemplazar , por nada
                .replaceAll(" ", "")//reemplazar espacios por nada
                .replaceAll("\\.", "");//reemplazar punts por nada

        System.out.println("El resultado es " + fraseLetras);
        System.out.println("El numero de letras es " + fraseLetras.length());//cuenta la longitud del string que hemos reemplazado previamente dejandolo sin nada
        //cuantas palabras
        String palabraFrase = frase.replaceAll(",", " ").replaceAll("\\.", " ");//sustituir coma por espacio y punto por espacio
        String[] palabras = palabraFrase.split(" ");//hacer el split (cortar) por espacio
        //System.out.println("El numero de letras es " + palabras.length()); en string es con parentesis final en array no
        System.out.println("El numero de palabras es " + palabras.length);
        //cuantas letras tiene cada oracion
        //hay que poner un nombre si o si item xejemplo
        for (String item : frases) { //uamos foreach por que queremos repetirlo por cada frase y asi lo hacemos mas corto y sencillo
            int contador = item.split(" ").length;//se hace un contador dentro para que se vaya reiniciando y cuente las palabras por intem (array frases previo)
            System.out.println("El numero de palabras de la oracion es "+contador);
        }



    }
















}
