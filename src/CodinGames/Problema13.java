package CodinGames;

import Thais.th;

public class Problema13 {
    // te van a dar la cantidad de digitos que vas a tener q transformar
    // vas a tener q aplicar la transformacion, osea q si tenemos lo siguiente
    // "0123456789" -> "9876543210"
    // asiq si te doy el numero 3 me tienes q dar el numero 6
    // y si te doy el numero 0 me tienes q dar el 9

    // fijemonos en las pocisiones de los numeros :D
    // "9876543210"
    // "0123456789"

    // "Hola q tal"
    // "0123456789"
    public static void main(String[] args) {
        int digitos = th.entero(th.leer("Ingrese la cantidad de digitos: "));
        int[] numeros = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        for (int i = 0; i < digitos; i++) {
            int numero = th.entero(th.leer("Ingrese un numero:  "));
            th.println(numeros[numero]);
        }

        amadito1();
        amadito2();
    }

    static void amadito1(){
        int digitos = th.entero(th.leer("Ingrese la cantidad de digitos: "));
        String numeros = "9876543210";
        for (int i = 0; i < digitos; i++) {
            int numero = th.entero(th.leer("Ingrese un numero:  "));
            th.println(numeros.charAt(numero));
        }

    }
    static void amadito2(){
        int digitos = th.entero(th.leer("Ingrese la cantidad de digitos: "));
        for (int i = 0; i < digitos; i++) {
            int numero = th.entero(th.leer("Ingrese un numero:  "));
            th.println(9 - numero);
        }

    }
    // "0123456789"

}

/**
 * 5
 * 2
 * 4
 * 5
 * 6
 * 7
 */
