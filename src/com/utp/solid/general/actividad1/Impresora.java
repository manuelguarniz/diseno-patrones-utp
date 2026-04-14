package com.utp.solid.general.actividad1;

public class Impresora {

    public void imprimirBoleta(Empleado empleado, double sueldo) {
        System.out.println("Empleado: " + empleado.nombre);
        System.out.println("Sueldo: " + sueldo);
    }
}
