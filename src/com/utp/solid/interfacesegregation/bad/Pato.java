package com.utp.solid.interfacesegregation.bad;

public class Pato implements Ave{
    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }

    @Override
    public void camina() {
        System.out.println("El pato camina");
    }

    @Override
    public void vuela() {
        System.out.println("El pato vuela");
    }
}
