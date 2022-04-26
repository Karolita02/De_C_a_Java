package Aprendiendo;

import Thais.th;
import java.util.Random;

public class Ventas {
    
    static int maxVentas;
    static Random rand = new Random();
    static boolean existe = false;
    public static void main(String[] args) {
        int opcion;

        while(true){
            th.print("Ingrese la cantidad de ventas en el mes que desea registrar: ");
            maxVentas = th.entero(th.leer());
            if(maxVentas > 0)
                break;
            th.println("La cantidad de ventas no puede ser cero o negativa");

        }
        
        float[] ventas = new float[maxVentas];

        opcion = formaIngresarVentas();
        realizarOpciones(opcion, ventas);

        th.println("Las ventas mayores de 2000 registradas en el mes fueron...");
        for (float venta : ventas) {
            if(venta > 2000)
            {
                th.println(String.format("%.2f", venta));
                existe = true;
            }       
        }

        if(!existe)
            th.println("No existen ventas registradas mayores de 2000");

    }

    static int formaIngresarVentas() {
        int formaVentas;
        while (true) {
            th.println("De que forma desea ingresar las ventas");
            th.println("1) Manual");
            th.println("2) Automático");
            formaVentas = th.entero(th.leer());
            if (formaVentas == 1 || formaVentas == 2)
                return formaVentas;
            th.println("Ingrese el numero 1 o 2");

        }

    }

    static void realizarOpciones(int opcion, float[] ventas) {
        if (opcion == 1) {
            for (int i = 0; i < maxVentas; i++) {
                th.print("Venta " + (i + 1) + ": ");
                ventas[i] = th.flotante(th.leer());
            }
            th.println("Las ventas registradas son las siguientes:");
            imprimirVentas(ventas);

        }
        if (opcion == 2) {
            for (int i = 0; i < maxVentas; i++) {
                ventas[i] = rand.nextFloat(4000);
            }
            th.println("Las ventas generadas de forma automática fueron:");
            imprimirVentas(ventas);
           
        }
    }

    static void imprimirVentas(float[]ventas)
    {
        int i = 1;
        for (float venta : ventas) {
            th.print("Venta " + i++ + ": ");
            th.println(String.format("%.2f", venta));

        }
        
    }

}
