package com.utp.solid.matrices;

public class TriangularInferior {
    private int[][] matriz;
    private int filas;
    private final int columnas = 4;

    public TriangularInferior(int[][] matriz, int filas) {
        this.matriz = matriz;
        this.filas = filas;
    }

    public boolean esTriangularInferior() {
        for (int i = 0; i < filas; i++) {
            for (int j = i + 1; j < columnas; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
