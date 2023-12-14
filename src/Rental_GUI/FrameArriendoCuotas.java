package Rental_GUI;

import javax.swing.*;
import java.awt.*;

public class FrameArriendoCuotas extends JFrame{

        FrameArriendoCuotas() {

                JLabel label =  new JLabel("Arriendo con Cuotas");
                label.setVerticalTextPosition(JLabel.TOP);
                label.setHorizontalTextPosition(JLabel.CENTER);
                this.setTitle("Arriendo de vehículos");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
                this.setResizable(false); // Prevenir que se reajuste la ventana
                this.setSize(500, 400); // Tamaño ventana
                this.setVisible(true); // Que sea visible
                this.getContentPane().setBackground(new Color(128, 128, 128));
                this.add(label);

        }
}
