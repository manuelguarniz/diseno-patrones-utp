package com.utp.solid.interfacesegregation.bad;

public class Avestruz implements Ave {
    @Override
    public void nadar() {
        System.out.println("La avestruz no nada");
    }

    @Override
    public void camina() {
        System.out.println("La avestruz camina");
    }

    @Override
    public void vuela() {
        System.out.println("La avestruz no vuela");
    }
}
