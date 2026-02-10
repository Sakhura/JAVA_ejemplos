import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EstructuraDoWhile2 {
    /**
     * Realizar un programa que permita ingresar el peso (en kilogramos) de piezas.
     * El proceso termina cuando ingresamos el valor 0. Se debe informar:
     * a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.?
     * y cuántas con menos de 9.8 Kg.?
     * b) La cantidad total de piezas procesadas.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cant1, cant2, cant3, suma;
        float peso;
        cant1 = 0;
        cant2 = 0;
        cant3 = 0;
        do {
            System.out.println("Ingrese peso (0 para terminar): ");
            peso = teclado.nextFloat();

            if (peso > 10.2) {
                cant1++;
            } else {
                if (peso >= 9.8) {
                    cant2++;
                } else {
                    if (peso > 0) {
                        cant3++;
                    }
                }
            }
        } while (peso!=0);
        suma = cant1 + cant2 + cant3;
        System.out.println("Piezas aptas:");
        System.out.println(cant2);
        System.out.println("Piezas con peso superior a 10.2");
        System.out.println(cant1);
        System.out.println("Piezas con peso inferior a 9.8");
        System.out.println(cant3);

    }
}