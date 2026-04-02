package com.utp.solid.openclosed;

public class OpenClosed {
    static void main() {
        Rectangulo rectangulo = new Rectangulo(10, 13);
        Circulo circulo = new Circulo(7);
        Triangulo triangulo = new Triangulo(3, 4, 5);
        //Triangulo triangulo = new Triangulo(3, 4, 1);
        //Triangulo triangulo = new Triangulo(3, 0, 5);
        //Triangulo triangulo = new Triangulo(1, 1, 1);
        Calculador calculador = new Calculador();

        System.out.println("Area del rectangulo: " + calculador.calcularArea(rectangulo));
        System.out.println("Perimetro del rectangulo: " + calculador.calclarPerimetro(rectangulo));
        System.out.println("Area del circulo: " + calculador.calcularArea(circulo));
        System.out.println("Perimetro del circulo: " + calculador.calclarPerimetro(circulo));
        System.out.println("Area del triangulo: " + calculador.calcularArea(triangulo));
        System.out.println("Perimetro del triangulo: " + calculador.calclarPerimetro(triangulo));
    }
}
