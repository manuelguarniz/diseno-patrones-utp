package com.utp.solid.matrices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el número de registros a ingresar: ");
        int filas = scanner.nextInt();
        int[][] matriz = new int[filas][4];

        do {
            System.out.println("""
                    ---- Menú de Opciones ----
                    1. Llenar matriz
                    2. Mostrar Matriz
                    3. Verificar si es Matriz Triangular Superior
                    4. Verificar si es Matriz Triangular Ingerior
                    5. Salir
                    
                    Seleccione una opción:
                    """);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> (new Ingresar(matriz, filas)).llenarMatriz();
                case 2 -> (new Mostrar(matriz, filas)).mostrarMatriz();
                case 3 -> {
                    boolean isSuperior = (new TriangularSuperior(matriz, filas)).esTriangularSuperior();
                    System.out.println("Es triangular superior?\n" + (isSuperior ? "Si\n" : "No\n"));
                }
                case 4 -> {
                    boolean isInferior = (new TriangularInferior(matriz, filas)).esTriangularInferior();
                    System.out.println("Es triangular inferior?\n" + (isInferior ? "Si\n" : "No\n"));
                }
            }
        } while (opcion != 5);
    }
}
