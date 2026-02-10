import java.util.Scanner;

public class EstructuraFor {
   public static void main (String[] args){
       Scanner teclado = new Scanner(System.in);

       double suma = 0;
       double numero;

       for (int i = 1; i <= 10 ; i++) {
           System.out.println("Ingrese el número " + i + ": ");
           numero = teclado.nextDouble();

           suma += numero;
       }

       double promedio = suma/10;

       System.out.println("La suma es: " + suma);
       System.out.println("El promedio es: " + promedio);

       teclado.close();
    }


}
/**int x;
 for (x=1; x<=100; x++){
 System.out.print(x);
 System.out.print(" - ");
 }*/