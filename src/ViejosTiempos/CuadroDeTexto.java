// hacer Jtextfield
package ViejosTiempos;

import javax.swing.JTextField;

/**
 * CuadroDeTexto
 */
public class CuadroDeTexto extends JTextField {
    public CuadroDeTexto(int ancho, int alto, int x, int y){
        setBounds(x, y, ancho, alto);
        setHorizontalAlignment(JTextField.CENTER);
    }

    public CuadroDeTexto(){
        setHorizontalAlignment(JTextField.CENTER);
    }

    
}