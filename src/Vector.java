import java.util.Scanner;

public class Vector {
    private int[] sueldos;
    private Scanner teclado;

    public void  cargar(){
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for (int f=0; f<5; f++){
            System.out.println(" Ingrese valor");
            sueldos[f]= teclado.nextInt();
        }
    }

    public void imprimir() {
        for (int f = 0; f < 5; f++) {
            System.out.println(sueldos);
        }
    }

    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.cargar();
        vc.imprimir();
    }

}

