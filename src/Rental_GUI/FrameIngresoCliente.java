package Rental_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameIngresoCliente extends JFrame implements ActionListener{
    JButton regresar;

    JFrame frame = new JFrame();
    JLabel titulo =  new JLabel("CLIENTES");
    public FrameIngresoCliente(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
        this.setResizable(false); // Prevenir que se reajuste la ventana
        this.setSize(800, 600); // Tamaño ventana
        this.setVisible(true); // Que sea visible
        this.getContentPane().setBackground(new Color(220, 220, 220));
        this.add(titulo);

        titulo.setHorizontalAlignment(JLabel.CENTER);
        titulo.setVerticalAlignment(JLabel.TOP);
        titulo.setFont(new Font("Arial", Font.PLAIN, 20));

        regresar = new JButton();
        regresar.setBounds(200, 200, 180, 20);
        regresar.addActionListener(this); // Opcional sería usar expresión lambda (e -> System.out.println("Hello World))
        regresar.setText("Regresar");
        this.add(regresar);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== regresar){
            // System.out.println("Hello world");
            this.dispose();
            FrameArriendoCuotas arriendoCuotas = new FrameArriendoCuotas();

        }
    }
}
