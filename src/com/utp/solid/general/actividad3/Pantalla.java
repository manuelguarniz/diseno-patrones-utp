package com.utp.solid.general.actividad3;

public class Pantalla {

    public void mostrarLibro(Libro libro, double total) {
        System.out.println("Libro: " + libro.titulo());
        System.out.println("Precio de lista: " + libro.precio());
        System.out.println("Precio con descuento: " + total);
    }
}
