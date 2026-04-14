package com.utp.solid.general.actividad2;

public class BadFactura {
    String codigo;
    String cliente;
    double monto;

    public BadFactura(String codigo, String cliente, double monto) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.monto = monto;
    }

    public double calcularIGV() {
        return monto * 0.18;
    }

    public void guardarArchivo() {
        System.out.println("Guardando factura en archivo...");
    }

}
