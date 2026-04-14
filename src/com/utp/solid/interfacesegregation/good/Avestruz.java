package com.utp.solid.interfacesegregation.good;

public class Avestruz implements ICorredor, ICaminador{

    @Override
    public void caminar() {
        System.out.println("El avestruz camina");
    }

    @Override
    public void correr() {
        System.out.println("El avestruz corre");
    }
}
