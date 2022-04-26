package CodinGames;

import java.util.Scanner;

public class Recursividad {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        karolita();
        
    }
    static void karolita(){
        int a = buscarArreglo(new int[]{1,2,3,4,5,6,7,8,9,12}, 0,1);
        System.out.println(a);

    }
    //Sumar los números números naturales hasta N de forma recursiva.
    static int sumar(int num){
       return num == 1 ? num : num + sumar(num-1);
    }
    
    // Recursividad :D :D:D:D:D:D:D:D:D:D:D:D:D:D:D
    // primer paso: pensar en el caso inicial :D 
    // segundo paso: aplicar la recursividad :D :D 

    // Factorial de un número.
    static int factorial(int numero){
        return numero == 0 ? 1 : numero * factorial(numero-1);

    }
    // Recorrer un array de forma recursiva.

    static void arreglo(int[] arreglo, int indice)
    {
        if(indice!= arreglo.length)
        {
            System.out.println(arreglo[indice]);
            arreglo(arreglo, indice+1);
        } 

    }
    // Buscar un elemento de un array de forma recursiva.

    static int buscarArreglo(int[] arreglo, int indice, int num)
    {
        if(indice != arreglo.length)
        {
            if(arreglo[indice]==num)
                return indice;
            else
                buscarArreglo(arreglo, indice+1,num);
        } 
        return -1;
    }

}
