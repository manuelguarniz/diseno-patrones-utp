package com.utp.solid.general.actividad1;

public class BadEmpleado {
    String nombre;
    int horasTrabajadas;
    double tarifaHora;

    public BadEmpleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }

    public void imprimirBoleta() {
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo: " + calcularSueldo());
    }

}
