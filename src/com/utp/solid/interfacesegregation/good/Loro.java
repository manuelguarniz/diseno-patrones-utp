package com.utp.solid.interfacesegregation.good;

public class Loro implements ICaminador, IVolador, IHablador {
    @Override
    public void caminar() {
        System.out.println("El loro camina");
    }

    @Override
    public void hablar() {
        System.out.println("El loro habla");
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }
}
