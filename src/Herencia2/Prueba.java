package Herencia2;

public class Prueba {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   SISTEMA DE REGISTRO DE VEHICULOS");
        System.out.println("========================================");

        // --- AUTO: ingreso por teclado ---
        System.out.println("\n>> Registrar un Auto:");
        Auto auto1 = new Auto();
        auto1.cargarDatosAuto();

        // --- MOTO: ingreso por teclado ---
        System.out.println("\n>> Registrar una Moto:");
        Moto moto1 = new Moto();
        moto1.cargarDatosMoto();

        // --- CAMION: datos directos con constructor ---
        System.out.println("\n>> Camión registrado con datos directos");
        Camion camion1 = new Camion("Volvo", "FH16", 2023, 85000000, 25.0, 3);

        // --- BICICLETA: datos directos con constructor ---
        System.out.println(">> Bicicleta registrada con datos directos");
        Bicicleta bici1 = new Bicicleta("Trek", "Marlin7", 2024, 750000, 21, "Montaña");

        // --- MOSTRAR TODOS LOS VEHICULOS ---
        System.out.println("\n========================================");
        System.out.println("   LISTADO DE VEHICULOS REGISTRADOS");
        System.out.println("========================================");

        auto1.mostrarDatosAuto();
        moto1.mostrarDatosMoto();
        camion1.mostrarDatosCamion();
        bici1.mostrarDatosBicicleta();
    }
}

