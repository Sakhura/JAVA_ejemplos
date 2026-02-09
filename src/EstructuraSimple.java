import java.util.Scanner;

public class EstructuraSimple {
    // pago de impuestos

    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);

        float sueldo;
        System.out.println("Ingrese su sueldo:");
        sueldo = teclado.nextFloat();
        if (sueldo > 4000) {
            System.out.println("Debe pagar impuesto");
        }
    }
}
