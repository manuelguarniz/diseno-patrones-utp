package com.utp.solid.interfacesegregation.task;

import java.util.Date;

public class Factura {
    String codigo;
    Date fechaEmision;
    double importeFactura;
    double iva;
    double deduccion;

    public Factura(String codigo, Date fechaEmision, double importeFactura) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
    }

    double calcularTotal(CalculadorDeduccion calculadorDeduccion, CalculadorImpuestos calculadorImpuestos) {
        deduccion = calculadorDeduccion.calcular();
        iva = calculadorImpuestos.calcular();
        return (importeFactura - deduccion) + iva;
    }
}
