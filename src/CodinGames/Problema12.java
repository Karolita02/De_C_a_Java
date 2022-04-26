package CodinGames;

import Thais.th;

public class Problema12 {
    public static void main(String[] args) {
        // *En este problema para todos los números mayores o iguales que n debemos
        // *regresar la diferencia ( resta ) entre la suma de todos los números divisibles por tres
        // * y la suma de todos los números pares.

        int n = th.entero(th.leer("Ingrese un numero: "));
        int par = 0, entreTres = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0)
                entreTres += i;
            if(i % 2 == 0)
                par+= i;

        }
        th.println(entreTres - par);

    }

}
