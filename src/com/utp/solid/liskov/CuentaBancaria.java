package com.utp.solid.liskov;

public abstract class CuentaBancaria {
    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract double calcularComision();

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) saldo -= monto;
    }
}

