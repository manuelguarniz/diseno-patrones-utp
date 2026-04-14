package com.utp.solid.interfacesegregation.good;

public class Pato implements ICaminador, INadador, IVolador {
    @Override
    public void caminar() {
        System.out.println("El pato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela");
    }
}
