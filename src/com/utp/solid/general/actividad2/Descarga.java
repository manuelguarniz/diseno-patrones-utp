package com.utp.solid.general.actividad2;

import static java.lang.IO.println;

public class Descarga {
    public void guardarArchivo(Factura factura, double igv) {
        println("Guardando factura en archivo...");
        println("Factura #" + factura.codigo());
        println("Cliente: " + factura.cliente());
        println("Monto: " + factura.monto());
        println("Igv: " + igv);
    }
}
