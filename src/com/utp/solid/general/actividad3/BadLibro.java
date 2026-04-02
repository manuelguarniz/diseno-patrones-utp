package com.utp.solid.general.actividad3;

public class BadLibro {
    String titulo;
    String autor;
    double precio;

    public BadLibro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public double aplicarDescuento() {
        return precio * 0.85;
    }

    public void mostrarLibro() {
        System.out.println("Libro: " + titulo);
        System.out.println("Precio con descuento: " + aplicarDescuento());
    }

}
