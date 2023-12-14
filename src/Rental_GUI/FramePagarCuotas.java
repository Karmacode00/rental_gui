package Rental_GUI;

import javax.swing.*;
import java.awt.*;

public class FramePagarCuotas extends JFrame{
    JFrame frame = new JFrame();
    JLabel titulo =  new JLabel("PAGAR CUOTAS ARRIENDOS");
    public FramePagarCuotas(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
        this.setResizable(false); // Prevenir que se reajuste la ventana
        this.setSize(800, 600); // Tamaño ventana
        this.setVisible(true); // Que sea visible
        this.getContentPane().setBackground(new Color(220, 220, 220));
        this.add(titulo);

        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setVerticalAlignment(JLabel.TOP);
        titulo.setFont(new Font("Arial", Font.PLAIN, 20));


    }
}
