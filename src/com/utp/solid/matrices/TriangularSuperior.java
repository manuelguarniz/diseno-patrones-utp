package com.utp.solid.matrices;

public class TriangularSuperior {
    private int[][] matriz;
    private int filas;
    private final int columnas = 4;

    public TriangularSuperior(int[][] matriz, int filas) {
        this.matriz = matriz;
        this.filas = filas;
    }

    public boolean esTriangularSuperior() {
        for (int i = 1; i < filas; i++) {
            for (int j = 0; j < i && j < columnas; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
