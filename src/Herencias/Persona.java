package Herencias;

import java.util.Scanner;

public class Persona {
    protected static Scanner teclado = new Scanner(System.in);
    protected String nombre;
    protected int edad;
   /** public Persona(){
        teclado = new Scanner(System.in);
    }*/

   public Persona(String nombre, int edad){
       this.nombre=nombre;
       this.edad=edad;
   }
    public  Persona(){

    }

    public void cargarDatosPersonales(){
        System.out.println("Ingrese nombre: ");
        nombre= teclado.next();
        System.out.println("Ingrese edad: ");
        edad = teclado.nextInt();

    }

    public void imprimirDatosPersonales(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
