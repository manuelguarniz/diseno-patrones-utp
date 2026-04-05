package com.utp.solid.openclosed;

public class Trapecio implements FiguraGeometrica{
    double baseMayor;
    double baseMenor;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (altura/2) * (baseMenor + baseMayor);
    }

    @Override
    public double calcularPerimetro() {
        double delta = (baseMenor + baseMayor) / 2;
        double lado = Math.sqrt(delta * delta + altura * altura);
        return baseMenor + baseMayor + lado * 2;
    }
}
