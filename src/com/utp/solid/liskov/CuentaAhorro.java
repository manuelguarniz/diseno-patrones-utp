package com.utp.solid.liskov;

public class CuentaAhorro extends CuentaBancaria {
    public CuentaAhorro(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public double calcularComision() {
        return saldo * 0.001;
    }
}

