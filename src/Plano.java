import java.util.Scanner;

public class Plano {
    /**
     * Desarrollar una clase que represente un punto en el plano
     * metodos: inicializar, imprimirCuadrante,
     * psvm
     */
    private Scanner teclado;
    int x, y;

    public void inicializar(){
        teclado = new Scanner(System.in);
        System.out.println("Ingrese coordenada X: ");
        x= teclado.nextInt();
        System.out.println("Ingrese coordenada Y: ");
        y= teclado.nextInt();

    }

    void imprimirCuadrante(){
        if (x>0 && y>0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x<0 && y>0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x<0 && y<0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x>0 && y<0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no está en un cuadrante.");
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Plano punto1;
        punto1 = new Plano();
        punto1.inicializar();
        punto1.imprimirCuadrante();
    }

}



