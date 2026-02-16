package Herencia2;

import java.util.Scanner;

public class Vehiculo { protected static Scanner teclado = new Scanner(System.in);
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double precio;

    // Constructor vacío
    public Vehiculo() {
    }

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public void cargarDatos() {
        System.out.print("Ingrese marca: ");
        marca = teclado.next();
        System.out.print("Ingrese modelo: ");
        modelo = teclado.next();
        System.out.print("Ingrese año: ");
        anio = teclado.nextInt();
        System.out.print("Ingrese precio: ");
        precio = teclado.nextDouble();
    }

    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: $" + precio);
    }
}
