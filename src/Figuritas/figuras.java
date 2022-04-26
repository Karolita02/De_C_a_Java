package Figuritas;

import Thais.th;

public class figuras {
    public static void main(String[] args) {
        int valor = 8;
        // rombo(valor);

        String linea = "* ".repeat(valor);
        for (int f = 0; f < valor; f++) {
            th.println("  ".repeat(valor - f) + linea);
            linea = linea.substring(linea.length() > 4 ? 4 : 0);
        }
        for (int f = 0; f < valor; f++) {
            th.println("  ".repeat(valor - f - 1) + linea);
            linea += "* ".repeat(2);
        }

    }

    public static void rombo(int valor) {
        String linea = "* ";
        for (int f = 0; f < valor; f++) {
            th.println("  ".repeat(valor - f) + linea);
            linea += "* ".repeat(2);
        }

        for (int abajo = 0; abajo <= valor; abajo++) {
            th.println("  ".repeat(abajo) + linea);
            linea = linea.substring(linea.length() > 4 ? 4 : 0);
        }
    }

    public static void trianguloPuntaDerecha(int valor) {
        String linea = "* ";
        for (int f = 0; f < valor; f++) {
            th.println(linea.repeat(f + 1));
        }

        for (int abajo = valor; abajo > 0; abajo--) {
            th.println(linea.repeat(abajo - 1));
        }
    }

    public static void triangulo(int valor) {
        String linea = "* ";
        for (int f = 0; f < valor; f++) {
            th.println("  ".repeat(valor - f - 1) + linea);
            linea += "* ".repeat(2);
        }
    }

    public static void cuadrado(int valor) {

        for (int f = 0; f < valor; f++) {
            for (int c = 0; c < valor; c++) {
                th.print("* ");
            }
            System.out.println();
        }
    }

}
