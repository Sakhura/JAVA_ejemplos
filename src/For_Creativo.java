import java.util.Scanner;

public class For_Creativo {
    /** tenemos la sgte informacion de estudiantes:
     *  las edades de 10 est de la jornada de la mañana (grupo 1)
     *  las edades de 15 est de la jornada de la tarde (grupo 2)
     *  las edades de 18 est de la jornada de la noche (grupo 3)
     *  estas edades deben ser ingresadas por teclado.
     *  1. obtener el promedio de las edades de cada turno
     *  2. imprimir promedio por cada jornada
     *  3. imprimir un mensaje que indique cual de las 3 jornadas tiene un promedio de edad menor.
     */
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int f, edad, suma1,suma2, suma3, pro1, pro2, pro3;
        suma1=0;
        suma2=0;
        suma3=0;
        for (f=1; f<=10; f++){
            System.out.println("Ingrese la Edad: ");
            edad = teclado.nextInt();
            suma1= suma1 + edad;
        }
        pro1 = suma1 / 10;
        System.out.println("El promedio de edad de la jornada de la mañana es: ");
        System.out.println(pro1);

        for (f=1; f<=15; f++){
            System.out.println("Ingrese la Edad: ");
            edad = teclado.nextInt();
            suma2= suma2 + edad;
        }
        pro2 = suma2 / 15;
        System.out.println("El promedio de edad de la jornada de la tarde es: ");
        System.out.println(pro2);

        for (f=1; f<=18; f++){
            System.out.println("Ingrese la Edad: ");
            edad = teclado.nextInt();
            suma3= suma3 + edad;
        }
        pro3 = suma3 / 18;
        System.out.println("El promedio de edad de la jornada de la noche es: ");
        System.out.println(pro3);

        if (pro1<pro2 && pro1<pro3){
            System.out.println("La jornada de la mañana tiene un promedio menor de edades");
        }else {
            if (pro2<pro3){
                System.out.println("La jornada de la tarde tiene un promedio menor de edades");
            } else {
                System.out.println("La jornada de la noche tiene un promedio menor de edades");
            }
        }

    }
}
