package traduciendoAJava.pruebitas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * pruebita1
 */
import traduciendoAJava.Matrices.matrices;

public class pruebita1 {

    public static void main(String[] args) {
        String listita = " Manzana, pera, lapices,,, mochilas, cuadernos";
        String[] clasif = listita.split(","); // la funcion slit sirve para separar cadenas, esta funcion solo la tienen
                                              // las strings
        for (String palabrita : clasif) {
            System.out.println(palabrita.indexOf("zana")); // la funcion indexOf me muestra indice del valor, caracter o
                                                           // palabra ingresado.
            if (!palabrita.equals(""))
                System.out.println(palabrita);

        }
        ArrayList<String> lista = new ArrayList<>(); // declaracion de un ArrayList
        // Variables primitivas : Inician con minúscula , Variables no primitivas :
        // Inician con mayúscula
        // Ejemplos: V.primitivas = int,float,double,boolean, etc V.no primitivas
        // Integer,Boolean,Float,Double,Long, etc.
        // Como agregar elementos a un ArrayList
        lista.add("Uvas");
        lista.add("Tomates");
        lista.add("Zanahorias");
        System.out.println(lista);
        System.out.println(lista.indexOf("Zanahorias"));
        Collections.reverse(lista); // invertir lista
        System.out.println(lista);
        System.out.println(lista.indexOf("Zanahorias"));
        System.out.println(lista.get(0).substring(lista.get(0).indexOf("orias")));
        // como usar mapas :D
        HashMap<String, Integer> puntaje = new HashMap<>(); // declarar un HashMap
        // añadir elementos al mapa :D
        puntaje.put("Caroline", 525);
        puntaje.put("Amadito", 1000);
        System.out.println(puntaje);
        // obtener uno de los nombres del mapita
        System.out.println(puntaje.get("Caroline"));
        for (String nombre : puntaje.keySet()) {
            System.out.println(nombre + " = " + puntaje.get(nombre));
        }
        System.out.println(puntaje.keySet().toArray()[1].toString());
        // como traducir de string a numero
        String textito = "123";
        int traduccion = Integer.parseInt(textito); // parseInt: convertir a entero
        System.out.println(traduccion);
        float traduccion2 = Float.parseFloat(textito);
        System.out.printf("%08.2f", traduccion2);
        // como traducir de numero a texto
        textito = Float.toString(traduccion2);
        System.out.println(textito);
        Integer practica = 24;
        textito = practica.toString();
        System.out.println(textito);
        practica = null;
        System.out.println(practica);
        // aprendiendo a usar try catch :D
        String pruebita = "hola";
        try {

            int pruebita2 = Integer.parseInt(pruebita);
            System.out.println(pruebita2);
        } catch (Exception e) {
            System.out.println("Se ejecutó el catch :D ");
            System.out.println(e);
           
        }

    }


}