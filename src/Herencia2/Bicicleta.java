package Herencia2;

public class Bicicleta extends Vehiculo {
    protected int numeroMarchas;
    protected String tipoBicicleta;

    public Bicicleta() {
        super();
    }

    public Bicicleta(String marca, String modelo, int anio, double precio, int numeroMarchas, String tipoBicicleta) {
        super(marca, modelo, anio, precio);
        this.numeroMarchas = numeroMarchas;
        this.tipoBicicleta = tipoBicicleta;
    }

    public void cargarDatosBicicleta() {
        super.cargarDatos();
        System.out.print("Ingrese número de marchas: ");
        numeroMarchas = teclado.nextInt();
        System.out.print("Ingrese tipo (Montaña/Ruta/Urbana/BMX): ");
        tipoBicicleta = teclado.next();
    }

    public void mostrarDatosBicicleta() {
        System.out.println("\n===== BICICLETA =====");
        super.mostrarDatos();
        System.out.println("Marchas: " + numeroMarchas);
        System.out.println("Tipo: " + tipoBicicleta);
    }
}