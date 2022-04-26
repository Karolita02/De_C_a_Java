package traduciendoAJava.Bingo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//
// ────────────────────────────────────────────────────────────────────── I ──────────
//   :::::: C L A S E   D E L   B I N G O : :  :   :    :     :        :          :
// ────────────────────────────────────────────────────────────────────────────────
//

public class bingo {
    private static Scanner leer = new Scanner(System.in);
    private static ArrayList<Carton> cartones = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            int seleccion = menuPrincipal();
            if (seleccion == 1) {
                while (true) {

                    boolean ganar = false;
                    seleccion = menu();
                    if(seleccion > 1 && cartones.size() == 0)
                    {
                        System.out.println("No hay cartones :C ");
                        continue;
                    }
                    if (seleccion == 1)
                        cartones.add(new Carton());
                    else if (seleccion == 2)
                        cartones.remove(removerYMostrar("Ingrese el numero del jugador para eliminar el carton: ") - 1);
                
                    else if (seleccion == 3)
                            cartones.get(removerYMostrar("Ingrese el numero del jugador para mostrar el carton: ") - 1).mostrarCarton();
                    else if (seleccion == 4) {
                        Random rand = new Random();
                        while (true) {
                            for (Carton cartonAux : cartones)
                                cartonAux.mostrarCarton();

                            int num = Math.abs(rand.nextInt(100));
                            System.out.println("El número sacado es.... " + num);

                            for (Carton cartonAux : cartones)
                                cartonAux.marcarCarton(num);

                            ganar = false;
                            for (Carton cartonAux : cartones)
                                if (cartonAux.verificarVictoria()) {
                                    ganar = true;
                                    break;
                                }

                            if (ganar) {
                                System.out.println("GANADOR :D ");
                                for (Carton cartonAux : cartones)
                                    if (cartonAux.verificarVictoria())
                                        cartonAux.mostrarCarton();
                                cartones.clear();
                                break;
                            }

                        }

                    }
                    if (ganar)
                        break;
                }

            } else
                System.exit(0);

        }

    }

    public static boolean preguntar(String texto) {
        while (true) {
            System.out.println(texto);
            String respuesta = leer.nextLine().toLowerCase();
            if (respuesta.equals("si"))
                return true;
            else if (respuesta.equals("no"))
                return false;
        }
    }

    public static void cerrarScanner() {
        leer.close();
    }

    public static int menuPrincipal() {

        while (true) {
            System.out.println("BIENVENIDO AL JUEGO DE BINGOOO!!!");
            System.out.println("1) Jugar");
            System.out.println("2) Salir");
            System.out.print("Ingrese una opción valida: ");
            int seleccion = leer.nextInt();

            if (seleccion == 1 || seleccion == 2)
                return seleccion;
            System.out.println("Ingrese 1 o 2 grax :D");
        }

    }

    public static int menu() {

        while (true) {
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("1) Crear carton");
            System.out.println("2) Borrar carton");
            System.out.println("3) Mostrar carton");
            System.out.println("4) Jugar");
            System.out.print("Ingrese una opción valida: ");
            int seleccion = leer.nextInt();

            if (seleccion >= 1 && seleccion <= 4)
                return seleccion;
            System.out.println("Ingrese una opción entre 1 y 4");
        }

    }

    public static int removerYMostrar(String texto) {
        while (true) {
            int num = 1;

            for (Carton carton : cartones)
                System.out.println(num++ + ")" + carton.obtenerNombre());

            System.out.print(texto);
            int seleccion = leer.nextInt();

            if (seleccion >= 1 && seleccion < num)
                return seleccion;

            System.out.println("Ingrese una opción valida");
        }

    }
}

class Carton {

    private Scanner leer = new Scanner(System.in);
    private String jugador; // * atributo del nombre del jugador de cada carton
    private final int MEDIDA = 5; // * hicimos el tamaño del carton constante (final nos permite hacer constantes
    // :D)
    private int[][] carton = new int[MEDIDA][MEDIDA];

    public Carton() {
        /*
         * Se creó el metodo constructor de la clase carton, esto para que
         * podamos crear objetos de tipo carton en el main :D
         */
        ponerNombre();
        generarCarton();

    }

    private void generarCarton() { // no necesitamos parametro po q carton el global
        for (int f = 0; f < MEDIDA; f++) {
            for (int c = 0; c < MEDIDA; c++)
                carton[f][c] = verificarNumCarton();
        }
    }

    public int verificarNumCarton() {
        Random random = new Random();
        int num;
        do {
            num = Math.abs(random.nextInt(100));
        } while (!(encontrarEnCarton(num)[0] == -1));
        return num;
    }

    /*
     * []
     * public int[][] existeNumeroEnElArreglo(int num){
     * for (int i = 0; i < MEDIDA; i++) {
     * for (int j = 0; j <MEDIDA; j++) {
     * if(carton[i][j] == num)
     * return true; en vez de esto
     * return int[][]{i, j}; lito me guta xD y weno luego alla
     * }
     * } y ya xd seh asi podias usar esto mimo en encontrar en carton
     * return int[][]{-1,-1}; alli ta xd
     * }
     */

    /**
     * diq
     * public void encontrarEncarton(int num){
     * 
     * }
     */
    public int[] encontrarEnCarton(int num) {
        for (int f = 0; f < MEDIDA; f++)
            for (int c = 0; c < MEDIDA; c++)
                if (carton[f][c] == num)
                    return new int[] { f, c };
        return new int[] { -1, -1 };
    }

    public void marcarCarton(int num) {
        int[] coordenada = encontrarEnCarton(num);
        if (coordenada[0] == -1)
            return;
        carton[coordenada[0]][coordenada[1]] = 0;
    }

    public void mostrarCarton() {
        System.out.println(jugador.toUpperCase());
        System.out.println();
        System.out.println("  B   I   N   G   O");
        for (int i = 0; i < MEDIDA; i++) // filas
        {
            for (int j = 0; j < MEDIDA; j++) // columnas

                System.out.printf("%3d ", carton[i][j]);

            System.out.println();
        }
        System.out.println();

    }

    public boolean verificarVictoria() {
        boolean h, v, dI, dD;
        for (int i = 0; i < MEDIDA; i++) // filas y columnas :c 
        {
            h = v = dI = dD = true;
            for (int k = 0; k < MEDIDA; k++) // para iterar
            {
                if (0 != carton[i][k]) // para verificar todas las filas
                    h = false;
                if (0 != carton[k][i]) // para verificar todas las columnas
                    v = false;
                if (0 != carton[k][k]) // verificar diagonal \
                    dI = false;
                if (0 != carton[k][MEDIDA - k - 1]) // verificar diagonal /
                    dD = false;
            }
            if (h || v || dI || dD)
                return true;

        }

        return false;
    }

    public String obtenerNombre() {
        return jugador;
    }

    private void ponerNombre() {
        System.out.print("Ingrese el nombre del jugador: ");
        jugador = leer.nextLine();
    }

    public void cerrarScanner() {
        leer.close();
    }
}