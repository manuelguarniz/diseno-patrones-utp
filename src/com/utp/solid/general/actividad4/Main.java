package com.utp.solid.general.actividad4;

public class Main {
    static void main() {
        Pedido pedido = new Pedido(99, "compu", 5, 2499.9);
        Factura factura = new Factura();
        Facturador facturador = new Facturador();

        double total = factura.calcularTotal(pedido.cantidad(), pedido.precioUnitario());

        facturador.generarConfirmacion(pedido.numero());
    }
}
