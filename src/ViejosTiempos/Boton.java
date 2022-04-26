// hacer JButton
package ViejosTiempos;

import javax.swing.JButton;

/**
 * Boton
 */
public class Boton extends JButton {
    public Boton(String texto, int ancho, int alto, int x, int y){
        super(texto); //con la funcion super podemos utilizar el metodo constructor de la clase que estamos extendiendo. :D 
        setBounds(x, y, ancho, alto);
    }

    
}