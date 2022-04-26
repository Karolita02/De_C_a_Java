package CodinGames;

import Thais.th;

public class Problema14 {
    public static void main(String[] args) {

        String oracion = th.leer("Ingrese una palabra o frase: ");
        int letrasMinusculas = 0;

        for (int i = 0; i < oracion.length(); i++) {
            if (Character.isLowerCase(oracion.charAt(i)))
                letrasMinusculas++;
        }

        th.println(letrasMinusculas);
        masCortito();
    }

    static void masCortito()
    {
        String oracion = th.leer("Ingrese una palabra o frase: ");
        th.println(oracion.chars().filter(caracter -> caracter >='a' && caracter <='z').count());
        // caracter puede llevar el nombre que sea, primero se coloca el nombre y luego lo que queremos que filtre, count es para contar
    }
    
    // este programin te dice la cantidad de letras minusculas que existen en tu palabra o frase
}
