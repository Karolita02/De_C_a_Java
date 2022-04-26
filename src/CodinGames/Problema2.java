package CodinGames;

import java.util.Scanner;

public class Problema2 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int pares = leer.nextInt();
        int impares = leer.nextInt();
        System.out.println(pares*(pares+ 1));
        System.out.println(impares*impares);
           
        amadito();
         
    }
    
    static void amadito(){
        int p = leer.nextInt();
        int i = leer.nextInt();
        System.out.printf("%d\n%d",p*++p,i*i);
    }

}
