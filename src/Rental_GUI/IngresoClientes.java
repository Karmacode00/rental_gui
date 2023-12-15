package Rental_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IngresoClientes extends JFrame implements ActionListener{
    private JPanel panel1;
    private JTextField textField1;
    private JButton agregarButton;
    private JTextField textField2;
    private JTextField textField3;

    JFrame frame = new JFrame();

    public IngresoClientes() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
        this.setResizable(false); // Prevenir que se reajuste la ventana
        this.setSize(800, 600); // Tamaño ventana
        this.setVisible(true); // Que sea visible
        this.getContentPane().setBackground(new Color(220, 220, 220));
        this.add(panel1);
        agregarButton.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing (WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
     @Override
     public void actionPerformed(ActionEvent e) {
                if(e.getSource()== agregarButton){
                    System.out.println("Hello world");
                    this.dispose();
            }
        }
    }
