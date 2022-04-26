package traduciendoAJava.Matrices;

import java.util.Scanner;

import java.util.Random;

public class matrices {
    static int indicea1, indicea2, indiceb1, indiceb2;

    public static void main(String[] args) {
        Scanner sel = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);
        /*
         * System.out.print("\033[H\033[2J");
         * System.out.flush();
         * comando limpiar pantalla
         */
        boolean automatico;
        Scanner limite = new Scanner(System.in);
        do {
            boolean acceso;

            do {

                limpiarPantalla();
                acceso = false;
                indicea1 = indices(limite, "Ingrese la cantidad de filas de la primera matriz: ");
                indicea2 = indices(limite, "Ingrese la cantidad de columnas de la primera matriz: ");
                indiceb1 = indices(limite, "Ingrese la cantidad de filas de la segunda matriz: ");
                indiceb2 = indices(limite, "Ingrese la cantidad de columnas de la segunda matriz: ");
                if (indicea1 == indiceb1 && indicea2 == indiceb2) // comprobamos que las matrices tengan la misma
                                                                  // cantidad de filas y columnas
                {
                    System.out.println("PODEMOS SUMAR Y RESTAR WUUU");
                    acceso = true;
                } else {
                    System.out.println("QUE LASTIMA, NO PODEMOS RESTAR NI SUMAR :C");
                    System.out
                            .println(
                                    "Las matrices que quieres crear no cuentan con la misma cantidad de filas y columnas");

                }

                if (indicea2 == indiceb1) {
                    System.out.println("PODEMOS MULTIPLICAR ESOOO!!!");
                    acceso = true;
                } // * comprobamos que la primera matriz tenga la misma cantidad de columnas que
                  // filas de la segunda matriz
                else {
                    System.out.println("NO PODEMOS MULTIPLICAR, QUE SAD :(");
                    System.out.println(
                            "Para poder multiplicar matrices, necesitas crear dos matrices en donde la primera matriz tenga la misma cantidad de columnas que filas de la segunda matriz");

                }
                pausa(letra);
            } while (!acceso || preguntar(letra, "Desea volver a ingresar filas y columnas distintas ? S/N:", false));
            int[][] mat1 = new int[indicea1][indicea2]; // * se creo la matriz con el tamaño ingresado por el usario
            int[][] mat2 = new int[indiceb1][indiceb2]; // *aqui tambien

            llenarMatriz(mat1, 100);
            llenarMatriz(mat2, 100);
            mostrarMatriz(mat1, "MATRIZ 1");
            pausa(letra);
            mostrarMatriz(mat2, "MATRIZ 2");
            pausa(letra);
            limpiarPantalla();
            int opcion;
            while (true) {
                limpiarPantalla();
                opcion = presentacionYSeleccion(sel);
                if (opcion == 1) {
                    if (indicea1 != indiceb1 && indicea2 != indiceb2) {
                        System.out.println("Como te avisamos al inicio, no podemos sumar");
                        pausa(letra);
                        continue;
                    }
                    mostrarMatriz(mat1, "MATRIZ 1 ");
                    mostrarMatriz(mat2, "MATRIZ 2 ");
                    mostrarMatriz(sumaYResta(mat1, mat2, false), "SUMA");
                }
                if (opcion == 2) {
                    if (indicea1 != indiceb1 && indicea2 != indiceb2) {
                        System.out.println("Como te avisamos al inicio, no podemos restar");
                        pausa(letra);
                        continue;
                    }
                    mostrarMatriz(mat1, "MATRIZ 1 ");
                    mostrarMatriz(mat2, "MATRIZ 2 ");
                    mostrarMatriz(sumaYResta(mat1, mat2, true), "RESTA");
                }
                if (opcion == 3) {
                    if (indicea2 != indiceb1) {

                        System.out.println("Como te avisamos al inicio, no podemos multiplicar");
                        pausa(letra);
                        continue;
                    }
                    mostrarMatriz(mat1, "MATRIZ 1 ");
                    mostrarMatriz(mat2, "MATRIZ 2 ");
                    mostrarMatriz(multiplicacion(mat1, mat2), "MULTIPLICACION");
                }
                if (opcion == 4) {
                    sel.close();
                    limite.close();
                    letra.close();
                    System.exit(0);
                }
                if (opcion == 5)
                    break;
                pausa(letra);
            }
            automatico = false;
            if (opcion == 5)
                automatico = true;
        } while (preguntar(letra, "DESEA REPETIR EL PROGRAMA? S/N ", automatico));

    }

    public static int indices(Scanner limite, String texto) {

        System.out.print(texto);
        int indice = limite.nextInt();
        return indice;

    }

    public static int presentacionYSeleccion(Scanner sel) {
        int seleccion;

        while (true) {

            System.out.println("     OPERACIONES CON MATRICES  ");
            System.out.println("Cual operacion desea realizar?");
            System.out.println("1) SUMA");
            System.out.println("2) RESTA");
            System.out.println("3) MULTIPLICACION");
            System.out.println("4) SALIR");
            System.out.println("5) REINGRESAR MATRICES ");
            System.out.println("Escriba aqui su seleccion: ");
            seleccion = sel.nextInt();
            if (seleccion <= 5 && seleccion >= 1)
                break;
            else
                System.out.println("Ingrese una opcion valida:");

        }
        return seleccion;
    }

    public static void llenarMatriz(int[][] matriz, int max) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) // filas
        {
            for (int j = 0; j < matriz[0].length; j++) // columnas
            {
                matriz[i][j] = rand.nextInt(max);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, String texto) {
        System.out.println(texto);
        for (int i = 0; i < matriz.length; i++) // filas
        {
            for (int j = 0; j < matriz[0].length; j++) // columnas

                System.out.printf(" %3d", matriz[i][j]);

            System.out.println(" ");
        }

    }

    public static int[][] sumaYResta(int[][] matriz1, int[][] matriz2, boolean negativo) {

        int[][] respuesta = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) // filas
        {
            for (int j = 0; j < matriz1[0].length; j++) // columnas
            {
                if (negativo)
                    respuesta[i][j] = matriz1[i][j] - matriz2[i][j];// vamos ahora a la 77
                else
                    respuesta[i][j] = matriz1[i][j] + matriz2[i][j];
            }

        }
        return respuesta;

    }
    // okay pa multiplicar matrices hay q acordase q se toma las filas del primero y
    // las columnas del segundo po q de ese tamaño sera la matris resultante
    // paso 2 multiplicar fila por columna

    public static int[][] multiplicacion(int[][] matriz1, int[][] matriz2) {

        if (indicea2 != indiceb1)
            System.out.println("Como te avisamos al inicio, no podemos multiplicar");
        int[][] respuesta = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < respuesta.length; i++) // filas
        {
            for (int j = 0; j < respuesta[0].length; j++) // columnas
            {
                respuesta[i][j] = 0;
                for (int k = 0; k < matriz1[0].length; k++)
                    respuesta[i][j] += matriz1[i][k] * matriz2[k][j];

            }

        }
        return respuesta;
    }

    public static boolean preguntar(Scanner letra, String texto, boolean automatico) {
        if (automatico)
            return true;
        char letrita;
        boolean control = false;
        boolean resul = false;
        do {
            System.out.println(texto);
            letrita = letra.next().charAt(0);
            if (letrita == 's' || letrita == 'S' || letrita == 'N' || letrita == 'n')
                control = true;

        } while (!control);

        switch (letrita) {
            case 's':
            case 'S':
                resul = true;
                break;

            case 'n':
            case 'N':
                resul = false;
                break;

        }
        return resul;
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

    public static void pausa(Scanner letra) {
        System.out.println("Pulse Enter para continuar... ");
        letra.nextLine();
    }
}

/**
 * mira xdxd
 * X X X --- X X - X X
 * X X X --- X X = X X
 * --------- X X
 * vez q tienen alli diq 2x3 y 3x2 eso nos da una matriz 2x2
 * y weno esas X X X se van a multiplicar por
 * X esas otras equis y adivina xdxd
 * X cuantas x hay xd en ambos lados xd
 * X la de las columnas de A
 */
