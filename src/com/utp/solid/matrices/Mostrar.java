package com.utp.solid.matrices;

public class Mostrar {
    private int[][] matriz;
    private int filas;
    private final int columnas = 4;

    public Mostrar(int[][] matriz, int filas) {
        this.matriz = matriz;
        this.filas = filas;
    }
    public void mostrarMatriz() {
        System.out.println("\n Matriz resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
