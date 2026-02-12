import java.util.Scanner;

public class CadenaCaracteres2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //varibles
        String apellido1, apellido2;

        System.out.println("Ingrese primer apellido");
        apellido1 = teclado.next();

        System.out.println("Ingrese segundo apellido");
        apellido2 = teclado.next();

        if(apellido1.equals(apellido2)){
            System.out.println("Los apellidos son iguales");
        }else {
            System.out.println("Los apellidos son distintos");
        }

    }
}
