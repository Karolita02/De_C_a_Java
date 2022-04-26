package Aprendiendo;

import java.util.ArrayList;

import Thais.th;

public class ListaDeCompras {
    public static void main(String[] args) {
        comprasConArrayList();

    }

    public static void comprasConString() {
        String compra = "";

        while (true) {
            compra += th.leer("Ingrese el artículo que desea añadir a su lista de compras grax: ") + "\n";
            if (compra.split("\n")[compra.split("\n").length-1].equalsIgnoreCase("fin"))
                break;
        }
        th.println(compra.substring(0, compra.length()-5));
    }

    public static void comprasConArrayList() {
        ArrayList<String> lista = new ArrayList<>();
        while (true) {

            lista.add(th.leer("Ingrese el artículo que desea añadir a su lista de compras: "));
            if (lista.get(lista.size() - 1).equalsIgnoreCase("fin")) {
                lista.remove(lista.size() - 1);
                break;
            }
        }
            th.println(lista.toString().replace("[","").replace("]","").replace(", ","\n"));   
    }

}

// hacer una lista de compras en la que puedas ir añadiendo por teclado la
// cantidad de elementos que
// quieras sin especificarlo, en la lista puedes añadir palabras,numeros
// frases,para terminar de
// incorporar elementos a la losta se debera escribir la palabra fin y esta
// palabra se debe detectar
// de cualquier forma :D . Despues de ingresar la palabra fin la lista se debera
// imprimir clara y
// legiblemente donde se pueda distinguir cada elemento de la lista. no debe
// aparecer la palabra fin
// en la lista. La decoracion sera evaluada :D aunque a la novia se le evalua
// con 100 :D
