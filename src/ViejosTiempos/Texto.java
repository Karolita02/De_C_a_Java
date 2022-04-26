// hacer JLabel
package ViejosTiempos;

import java.awt.Font;

import javax.swing.JLabel;

/**
 * Texto
 */
public class Texto extends JLabel{
    public Texto(String texto, int tamaño,int x, int y){
        this(texto,tamaño);
        setBounds(x, y, tamaño*tamaño, tamaño);
    }

    // le hicimo sobrecarga al texto :D 
    
    public Texto(String texto, int tamaño){
        setText(texto);
        setFont(new Font(Font.DIALOG,Font.PLAIN,tamaño));
    }


}