package Herencia2;

public class Auto extends Vehiculo {
    protected int numeroPuertas;
    protected String tipoCombustible;

    public Auto() {
        super();
    }

    public Auto(String marca, String modelo, int anio, double precio, int numeroPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precio);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public void cargarDatosAuto() {
        super.cargarDatos();
        System.out.print("Ingrese número de puertas: ");
        numeroPuertas = teclado.nextInt();
        System.out.print("Ingrese tipo de combustible (Bencina/Diesel/Electrico): ");
        tipoCombustible = teclado.next();
    }

    public void mostrarDatosAuto() {
        System.out.println("\n===== AUTO =====");
        super.mostrarDatos();
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Combustible: " + tipoCombustible);
    }
}