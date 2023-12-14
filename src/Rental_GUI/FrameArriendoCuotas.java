package Rental_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameArriendoCuotas extends JFrame implements ActionListener{
        JButton ingresoCliente;



        FrameArriendoCuotas() {

                //JPanel panel = new JPanel();

                JLabel label =  new JLabel("ARRIENDO CON CUOTAS");

                this.setTitle("Arriendo de vehículos");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
                this.setResizable(false); // Prevenir que se reajuste la ventana
                this.setSize(800, 600); // Tamaño ventana
                this.setVisible(true); // Que sea visible
                this.getContentPane().setBackground(new Color(220, 220, 220));
                this.add(label);
                //this.pack(); // ajusta tamaño a los componentes

                //label.setVerticalTextPosition(JLabel.TOP);
                //label.setHorizontalTextPosition(JLabel.CENTER);
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.TOP);
                label.setFont(new Font("Arial", Font.PLAIN, 20));

                ingresoCliente = new JButton();
                ingresoCliente.setBounds(200, 200, 100, 50);
                ingresoCliente.addActionListener(this); // Opcional sería usar expresión lambda (e -> System.out.println("Hello World))
                this.add(ingresoCliente);


        }

        @Override
        public void actionPerformed(ActionEvent e) {
                if(e.getSource()== ingresoCliente){
                        System.out.println("Hello world");

                }
        }
}
