package Herencias;

public class Prueba {
    public static void main(String[] args) {
       Empleado emp1 = new Empleado("Sabina", 53, 5400);
       emp1.imprimirTodo();

        System.out.println("==============================================");

       Empleado emp2 = new Empleado();
       emp2.cargarDatosPersonales();
       emp2.cargarSueldo();
       emp2.imprimirTodo();

    }
}
