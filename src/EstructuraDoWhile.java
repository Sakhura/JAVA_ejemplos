import java.util.Scanner;

public class EstructuraDoWhile {
    /**
     * carga de nro  0 y 999 , nos muestre un msj de cuanto digitos tiene el nro y que
     * finalice cuando se cargue el valor CERO
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nro;
        do {
            System.out.println("Ingrese un nro entre 0 y 999 (0 finaliza): ");
            nro = teclado.nextInt();
            if (nro >= 100) {
                System.out.println("Tiene 3 Digitos ");
            } else {
                if (nro >= 10) {
                    System.out.println("Tiene 2 Digitos ");
                } else {
                    System.out.println("Tiene 1 Digitos ");
                }
            }

        } while (nro != 0);
    }

}