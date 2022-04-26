package traduciendoAJava.CuadradoMagico;

import java.util.Scanner;

public class CuadradoMagico {
    static Scanner leer = new Scanner(System.in);
    static int medida;
    public static void main(String[] args) {
        System.out.println("**-**-**-** CUADRADO MÁGICO **-**-**-**");
        ingresarMedida();
        int [][] cuadradoMagico = new int [medida][medida];
        int x  =  medida / 2;
        int y  = (medida / 2)* - 1;
        int xA = x;
        int yA = y;
        int contador = 1;
        while(contador <= medida * medida)
        {
            if(!(x >= 0))
                x += medida;   
            if(!(y >= 0))    
                y += medida;
            if(!(x < medida))
                x -= medida;
            if(!(y < medida))
                y -= medida; 

            cuadradoMagico[y][x] = contador;

            if(contador % medida == 0)
            {
                x = --xA; // izquierda 
                y = ++yA; // abajo 

            }
            else 
            {
                x++; // derecha
                y++; // abajo 
            }
            
            contador++;
         
        }
        mostrarMatriz(cuadradoMagico);

    }
    static void ingresarMedida(){
        while (true) 
        {
            System.out.println("Ingrese el tamaño del cuadrado mágico,");
            System.out.print("NOTA: debe ser un número impar mayor o igual que tres : ");
            medida = leer.nextInt();
            if(!(medida%2==0)&& medida >= 3)
                break;
            System.out.println("Al principio te dije que debías ingresar un número impar mayor o igual que tres :c");    
         
        }

    }
    static void mostrarMatriz(int[][]matriz)
    {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++)
                System.out.printf("%3d",matriz[f][c]); 
            System.out.println();     
        }
        
    }
    
}
