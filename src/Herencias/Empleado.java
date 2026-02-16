package Herencias;

public class Empleado extends Persona{
    protected int sueldo;

    public void cargarSueldo(){
        System.out.println("Ingrese el sueldo $ ");
        sueldo = teclado.nextInt();
    }

    public void imprimirSueldo(){
        System.out.println("El sueldo es $ " + sueldo);
    }

}
