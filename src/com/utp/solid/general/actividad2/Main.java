package com.utp.solid.general.actividad2;

public class Main {
    static void main() {
        Factura factura = new Factura("B0001", "Manuel", 50.6);
        Impuestos impuestos = new Impuestos();
        Descarga descarga = new Descarga();

        double igv = impuestos.calcularIGV(factura.monto());
        descarga.guardarArchivo(factura, igv);
    }
}
