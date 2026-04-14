package com.utp.solid.interfacesegregation.task;

import java.util.Date;

public class Main {
    static void main() {
        double importe = 1000;
        int porcentajeDeduccion = 3;

        CalculadorDeduccion calculadorDeduccion = () -> importe * porcentajeDeduccion;
        CalculadorImpuestos calculadorImpuestos = () -> importe * 1.18;

        Factura factura = new Factura("001", new Date(), importe);
        double total = factura.calcularTotal(calculadorDeduccion, calculadorImpuestos);

        System.out.println("total: " + total);
    }
}
