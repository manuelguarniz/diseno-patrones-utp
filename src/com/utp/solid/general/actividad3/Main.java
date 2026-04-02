package com.utp.solid.general.actividad3;

public class Main {
    static void main() {
        Libro libro = new Libro("SOLID", "XXXX", 180.0);
        Promocion promocion = new Promocion();
        Pantalla pantalla = new Pantalla();

        double total = promocion.aplicarDescuento(libro.precio());
        pantalla.mostrarLibro(libro, total);
    }
}
