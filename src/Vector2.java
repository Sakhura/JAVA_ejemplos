import java.util.Scanner;
import java.util.Vector;

public class Vector2 {
    private Scanner teclado;
    private Vector<Integer> sueldos;


    public void cargar(){
        teclado = new Scanner(System.in);
        sueldos = new Vector<>();
        for ( int f=0; f <5 ; f++){
            System.out.println("Ingresa monto: ");
            sueldos.add(teclado.nextInt());
        }
    }

    public void imprimir() {
        for (int f = 0; f < 5; f++) {
            System.out.println(sueldos.get(f));
        }
    }

    public static void main(String[] args) {
        Vector2 vc2 = new Vector2();
        vc2.cargar();
        vc2.imprimir();

    }

}
