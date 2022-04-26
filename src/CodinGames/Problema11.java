package CodinGames;

import Thais.th;

public class Problema11 {
    public static void main(String[] args) {
        String m = th.leer();
        String k = th.leer();
        th.println(encriptarYdesencriptar(m,k,true));
    }

    public static String encriptarYdesencriptar(String m,String k,boolean quiereDesencriptar) {
        
        String respuesta = "";

        // elooW rWdoH = m mensaje encriptado
        // HeloWrd = k clave para desencriptar -1 + 7 6
        /**
         * izquierda remplaza a lo de la derecha :D
         * Esto -> remplaza aca :D
         * H -> e
         * e -> l
         * l -> o
         * o -> W
         * W -> r
         * r -> d
         * d -> H
         */
        // respuesta = Hello Word :D
        // CoOdBye Wruel cGuEl ROGLD
        // GCWR
        for (int i = 0; i < m.length(); i++) { // 0 a 10
            for (int j = 0; j < k.length(); j++) {

                if(!k.contains(Character.toString(m.charAt(i)))){
                    respuesta += m.charAt(i);
                    break;
                }

                if (k.charAt(j) == m.charAt(i)) { // k(%7)
                    respuesta += k.charAt(quiereDesencriptar ? (j + k.length() -1) % k.length() : (j + 1) % k.length());
                }
            }
        }
        return respuesta;
    }

}
