import java.util.Scanner;

public class EstructuraWhile {
    // mostrar por consola los nros de 1 al 100
  /**  public static void main(String[] arg){
        int x;
        x=-50;
        while (x <= 10) {
            System.out.print(x);
            System.out.print(" / ");
            x = x + 1;
        }
    }*/
  //While: por teclado se ingresen 10 nros , luego muestre la suma y el promedio
  /**  public static void main (String[] arg){
        Scanner teclado = new Scanner(System.in);
        int x, suma, valor, promedio;
        x = 1;
        suma = 0;
        while (x<=10){
            System.out.println("Ingrese un valor: ");
            valor = teclado.nextInt();
            suma  = suma + valor;
            x = x+1;
        }
        promedio =  suma/10;
        System.out.println("La suma de 10 nros/ valores es:  ");
        System.out.println(suma);
        System.out.println("El promedio es: ");
        System.out.println(promedio);
    }*/

  // n empleados , sueldos entre 100 y 500
  // informar empleados que cobren entre 100-300 // +300 // +400 // cuanto es el total que pagare
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);
        //variables
        int empleados, conta1, cont2, x;
        float sueldo, gastos;
        System.out.println("Ingrese el número de empleados: ");
        empleados = teclado.nextInt();
        x=1;
        conta1= 0;
        cont2 =0;
        gastos=0;
        while (x<= empleados){
            System.out.println("Ingrese el sueldo del empleado: $  ");
            sueldo = teclado.nextFloat();
            if (sueldo <=300){
                conta1 = conta1 +1;
            }else {
                cont2 = cont2 +1;
            }
            gastos = gastos+sueldo;
            x = x + 1;
        }
        System.out.println("Cantidad de empleados con sueldos entre 100 y 300");
        System.out.println(conta1);
        System.out.println("Cantidad de empleados con sueldos entre 300 y 400");
        System.out.println(cont2);
        System.out.println("agregar ");
        System.out.println("agregar");
        System.out.println("Gastos total de empresa por concepto sueldos es : $");
        System.out.println(gastos);

    }

}
