package com.utp.solid.general.actividad4;

public class BadPedido {
    int numero;
    String producto;
    int cantidad;
    double precioUnitario;

    public BadPedido(int numero, String producto, int cantidad, double precioUnitario) {
        this.numero = numero;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void generarConfirmacion() {
        System.out.println("Pedido confirmado: " + numero);
    }

}
