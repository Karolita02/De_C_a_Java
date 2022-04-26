package CodinGames;

import java.util.*;

public class Problema3 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        char[] numero   = leer.nextLine().toCharArray();
        char[] palabra  = leer.nextLine().toCharArray();
        // [a,b,c]
        //  0 1 2
        // chatAt es pa Strings

        // prueba 1
        // 15243
        // enaet

        char[] palabraAux = new char[numero.length];
        for (int i = 0; i < numero.length; i++) {
            palabraAux[numero[i]-'0'-1] = palabra[i]; // [numero[i]-'0'-1 hacemos  5 -> 49 0 -> 44 
        }
        System.out.println(palabraAux);
        
        amadito();
    }

    static void amadito(){
        char[] numeros = leer.nextLine().toCharArray();

        char[] palabra = leer.nextLine().toCharArray();

        // aki va codiguito :D
        char[] respuesta = palabra.clone();
        int x = 0;
        for (char i : numeros) {    
            respuesta[i-'0'-1] = palabra[x++];
        }
        System.out.println(respuesta);
    }
    
}
