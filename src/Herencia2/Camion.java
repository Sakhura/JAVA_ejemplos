package Herencia2;

public class Camion extends Vehiculo {
    protected double capacidadCarga;
    protected int numeroEjes;

    public Camion() {
        super();
    }

    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga, int numeroEjes) {
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public void cargarDatosCamion() {
        super.cargarDatos();
        System.out.print("Ingrese capacidad de carga (toneladas): ");
        capacidadCarga = teclado.nextDouble();
        System.out.print("Ingrese número de ejes: ");
        numeroEjes = teclado.nextInt();
    }

    public void mostrarDatosCamion() {
        System.out.println("\n===== CAMION =====");
        super.mostrarDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
        System.out.println("Número de ejes: " + numeroEjes);
    }
}