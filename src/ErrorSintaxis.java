import java.util.Scanner;

public class ErrorSintaxis {
    // calcular la superficie de un cuadrado
    public static void main (String[] arg){
        //que el usuario ingre info a traves del teclado
        Scanner teclado = new Scanner(System.in);
        //variables
        int lado;
        int superficie;

        // Solicitud al usuario que ingrese los datos
        System.out.println("Ingrese el valor del lado del cuadrado : ");
        lado=teclado.nextInt();
        superficie = lado * lado;
        System.out.println("La superficie del cuadrado es: ");
        System.out.println(superficie);

    }
}
// Error de sintaxis es no respetar CamelCase o hacer calculos errados