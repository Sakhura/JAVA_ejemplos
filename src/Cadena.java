import java.util.Locale;
import java.util.Scanner;

public class Cadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena1;
        String cadena2;
        System.out.println("ingrese la primera cadena");
        cadena1 = teclado.nextLine();
        System.out.println("ingrese la segunda cadena");
        cadena2 = teclado.nextLine();

        if(cadena1.equals(cadena2)== true){
            System.out.println(cadena1 + " ES igual a " +cadena2);
        } else {
            System.out.println(cadena1 + " NO es igual a " + cadena2);
        }
        if (cadena1.equalsIgnoreCase(cadena2)==true){
            System.out.println(cadena1 + " ES igual " + cadena2 + " sin considerar mayusculas / minusculas");
        }else{
            System.out.println(cadena1 + " NO es igual " + cadena2 + " sin considerar mayusculas / minusculas");
        }
        if (cadena1.compareTo(cadena2)== 0){
            System.out.println(cadena1 + " ES exactamente igual a " +cadena2);
        }else {
            if (cadena1.compareTo(cadena2)>0){
                System.out.println(cadena1 + " ES MAYOR ALFABETICAMENTE que " +cadena2);
            } else {
                System.out.println(cadena2 + " ES MAYOR ALFABETICAMENTE que " +cadena1);
            }
        }

        char caract1 = cadena1.charAt(0);
        System.out.println("El primer caracter de " + cadena1 +" es " +caract1 );

        int largo= cadena1.length();
        System.out.println("El largo del String es " + cadena1+ " es " + largo);

        String cadena3=cadena1.substring(0,3);
        System.out.println("Los primeros 3 caracteres de "+ cadena1 + " son " + cadena3);

        int posicion = cadena1.indexOf(cadena2);
        if (posicion == -1){
            System.out.println(cadena2 + " no esta contenido en " + cadena1);
        }else {
            System.out.println(cadena2 + " no esta contenido en " + cadena1 + " a partir de la posicion " + posicion);
        }
        System.out.println(cadena1 + " convertido a mayusculas es " + cadena1.toUpperCase());
        System.out.println(cadena1 + " convertido a mayusculas es " + cadena1.toLowerCase());
    }

}

/**
 * compareTo
 * String a : "Hola";
 * String b = "Mundo";
 *
 * indexOF(String) busca la posicion exacta del caracter que se designe
 *
 * String texto = "Hola Mundo";
 * int pos = texto.indexOf("Mundo"); // 5
 *
 */
