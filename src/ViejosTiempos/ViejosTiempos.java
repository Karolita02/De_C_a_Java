package ViejosTiempos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
/**
 * ViejosTiempos en el cole de karolita :D >< ahora con AMADITO ayudandola a pasarlo a JAVA su pasiooonnnn :D 
 */

public class ViejosTiempos {

    public static void main(String[] args) { // venta de productos :D 
        Ventana ventanita = new Ventana(500,500);
        Panel panelsito = new Panel(Color.GRAY);
        panelsito.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        TextoConCuadro[] textoYCuadro = new TextoConCuadro[4];
        ventanita.add(panelsito); 
        // Titulo 
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        Texto textito = new Texto("VENTA DE PRODUCTOS",20);
        textito.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        panelsito.add(textito, gbc);
        
        // Productos
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        textoYCuadro[0] = new TextoConCuadro("Teclado",15);
        panelsito.add(textoYCuadro[0], gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        textoYCuadro[1] = new TextoConCuadro("Mouse",15);
        panelsito.add(textoYCuadro[1], gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        textoYCuadro[2] = new TextoConCuadro("Pc Gamer",15);
        panelsito.add(textoYCuadro[2], gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        textoYCuadro[3] = new TextoConCuadro("Memoria USB",15);
        panelsito.add(textoYCuadro[3], gbc);

        // Botones de Calcular y Sal
    }

    

    public static void MayorDe3(){
        Ventana ventana = new Ventana(1000,500);
        Panel panel = new Panel(Color.pink);
        ventana.add(panel);
        Texto texto = new Texto("CALCULAR EL MAYOR DE TRES", 20, 330, 10);
        panel.add(texto);

        Texto num1 = new Texto("PRIMER NÚMERO",22,110,100);
        Texto num2 = new Texto("SEGUNDO NÚMERO",22,100,200);
        Texto num3 = new Texto("TERCER NÚMERO",22,110,300);
        Texto respuesta = new Texto("RESPUESTA",24,700,150);
        panel.add(num1);
        panel.add(num2);
        panel.add(num3);
        panel.add(respuesta);
        
        CuadroDeTexto primero = new CuadroDeTexto(100, 40, 400, 100);
        CuadroDeTexto segundo = new CuadroDeTexto(100, 40, 400, 200);
        CuadroDeTexto tercero = new CuadroDeTexto(100, 40, 400, 300);
        CuadroDeTexto resultado = new CuadroDeTexto(150, 60, 700, 200);
        resultado.setEditable(false); // para que no podamos escribir en el cuadrito de respuesta :D 
        panel.add(primero);
        panel.add(segundo);
        panel.add(tercero);
        panel.add(resultado);
        
        Boton calcular = new Boton("CALCULAR NUMERO MAYOR", 300, 60, 300, 370);
        Boton salir  = new Boton("SALIR", 100, 60, 700, 370);
        panel.add(calcular);
        panel.add(salir);
        ActionListener progSalir = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose(); // para salir del programita :D 
            }
            
        };
        ActionListener progCalcular = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(primero.getText());
                int num2 = Integer.parseInt(segundo.getText());
                int num3 = Integer.parseInt(tercero.getText());
                int a = Math.max(num1,num2);
                int b = Math.max(a,num3);
                resultado.setText(b + "");               
            }

        };
        calcular.addActionListener(progCalcular);
        salir.addActionListener(progSalir);
    }

}


