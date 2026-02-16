package Herencia2;

public class Moto extends Vehiculo {
    protected int cilindrada;
    protected String tipoMoto;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int anio, double precio, int cilindrada, String tipoMoto) {
        super(marca, modelo, anio, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    public void cargarDatosMoto() {
        super.cargarDatos();
        System.out.print("Ingrese cilindrada (cc): ");
        cilindrada = teclado.nextInt();
        System.out.print("Ingrese tipo de moto (Deportiva/Urbana/Scooter): ");
        tipoMoto = teclado.next();
    }

    public void mostrarDatosMoto() {
        System.out.println("\n===== MOTO =====");
        super.mostrarDatos();
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Tipo: " + tipoMoto);
    }
}