import java.util.Scanner;

public class EstructuraCondicionalCompuesta {
    // 2 nros y mostra el mayor

   /** public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese el primero número: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }else {
            System.out.println(num2);
        }
    }*/



            // 3 nros y mostra el mayor

        public static void main(String[] arg){
            Scanner teclado = new Scanner(System.in);

            int num1, num2, num3;

            System.out.println("Ingrese el primero número: ");
            num1 = teclado.nextInt();
            System.out.println("Ingrese el segundo número: ");
            num2 = teclado.nextInt();
            System.out.println("Ingrese el tercer número: ");
            num3 = teclado.nextInt();

            if (num1>num2 && num1>num3){
                System.out.println(num1);
            }else {
                if (num2>num3){
                    System.out.println(num2);
                } else {
                    System.out.println(num3);
                }
            }
        }
    }



