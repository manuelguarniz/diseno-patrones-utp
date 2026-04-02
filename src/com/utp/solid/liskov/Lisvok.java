package com.utp.solid.liskov;

public class Lisvok {
    static void main() {
        CuentaBancaria c1 = new CuentaSueldo("Frank", 500);
        CuentaBancaria c2 = new CuentaAhorro("Lucia", 300);

        c1.depositar(100);
        c2.retirar(50);

        System.out.println("saldo en cuenta de sueldo: " + c1.saldo);
        System.out.println("saldo en cuenta de ahorro: " + c2.saldo);
    }
}
