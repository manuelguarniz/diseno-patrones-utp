package com.utp.solid.liskov;

public class CuentaSueldo extends CuentaBancaria {
    public CuentaSueldo(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularComision() {
        return 0;
    }
}

