package CodinGames;

import java.util.ArrayList;

import Thais.th;

public class Problema10 {
    public static void main(String args[]) {
        String a = th.leer("Ingrese el coso a encriptar: ");
        String b = encriptar(a);
        th.println(b);
        String c = desencriptar(b);
        th.println(c);
        
    }

    static String encriptar(String desencriptado) {
        char[] e = desencriptado.toCharArray();
        String hexa = "";
        for (char c : e) {
            hexa += Integer.toHexString((int) c);
        }
        String respuesta = "";
        for (int i = 0; i < hexa.length() / 2; i++) {
            respuesta += hexa.substring(0, hexa.length() / 2).charAt(i);
            respuesta += hexa.substring(hexa.length() / 2).charAt(i);
        }
        return respuesta;
    }

    static String desencriptar(String encriptado) {
        char[] e = encriptado.toCharArray(); // 44bc
        // 44bc4b4466ss
        // 4b446s -> ArrayList1
        // 4cb46s -> ArrayList2
        ArrayList<Character> mitad1 = new ArrayList<Character>();
        ArrayList<Character> mitad2 = new ArrayList<Character>();
        String unido, respuesta = "";
        for (int i = 0; i < e.length - 1; i++) {
            mitad1.add(e[i++]);
            mitad2.add(e[i]);
        } // 4b4c

        unido = mitad1.toString() + mitad2.toString();
        unido = unido.replace("[", "").replace("]", "").replace(", ", "");

        for (int i = 0; i < unido.length() - 1; i += 2) {
            respuesta += (char) Integer.parseInt(unido.substring(i, i + 2), 16);
        }
        return respuesta;
    }
}
