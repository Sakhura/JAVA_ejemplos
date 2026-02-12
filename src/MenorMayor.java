import java.util.Scanner;

public class MenorMayor {
    /**
     * una clase = ingresar 3 nros. luego mostrar el mayor y el menor
     *
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] v = new int[3];
        for (int i = 0; i<3; i++){
            System.out.println("Ingrese valor " + (i+1)+": ");
            v[i] =teclado.nextInt();
        }
        int mayor = Math.max(v[0], Math.max(v[1], v[2]));
        int menor = Math.min(v[0], Math.min(v[1], v[2]));
        System.out.println("El valor mayor de los tres es: " + mayor);
        System.out.println("El valor menor de los tres es: " + menor);
    }
}
