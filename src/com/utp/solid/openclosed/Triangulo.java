package com.utp.solid.openclosed;

public class Triangulo implements FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        if (esTriangulo()) {
            double s = semiperimetro();
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        }
        return 0;
    }

    @Override
    public double calcularPerimetro() {
        if (esTriangulo()) {
            return lado1 + lado2 + lado3;
        }
        return 0;
    }

    private double semiperimetro() {
        return calcularPerimetro() / 2;
    }

    private boolean esTriangulo() {
        return lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2;
    }
}
