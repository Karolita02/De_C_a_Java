package CodinGames;

import Thais.th;

public class Pangram {
    public static void main(String[] args) {

        String palabra = th.leer("Ingrese una palabra o frase: ").toLowerCase();
        String pangram = "qwertyuiopasdfghjklñzxcvbnm";
        boolean esPangram = true;

        for (int i = 0; i < pangram.length(); i++) {
            if (!(palabra.contains(Character.toString(pangram.charAt(i)))))
                esPangram = false;
        }

        th.println(esPangram);
    }

}
