package com.utp.solid.matrices;

import java.util.Scanner;

public class Ingresar {
    private int[][] matriz;
    private int filas;
    private final int columnas = 4;

    public Ingresar(int[][] matriz, int filas) {
        this.matriz = matriz;
        this.filas = filas;
    }

    public void llenarMatriz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Ingresar los elementos de la fila " + (i + 1) + ":");
            for (int j = 0; j < columnas; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
    }
}
