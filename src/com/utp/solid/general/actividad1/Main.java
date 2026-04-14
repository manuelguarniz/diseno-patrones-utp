package com.utp.solid.general.actividad1;

public class Main {
    static void main() {
        Empleado empleado = new Empleado("Manuel", 40, 35);
        Planilla planilla = new Planilla();
        Impresora impresora = new Impresora();

        double sueldo = planilla.calcularSueldo(empleado.horasTrabajadas, empleado.tarifaHora);
        impresora.imprimirBoleta(empleado, sueldo);
    }
}
