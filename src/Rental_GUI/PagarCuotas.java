package Rental_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PagarCuotas extends JFrame implements ActionListener{
    private JComboBox comboBox1;
    private JButton mostrarPagosArriendoSeleccionadoButton;
    private JButton realizarPagoButton;
    private JPanel panel1;

    public PagarCuotas() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar programa con la x
        this.setResizable(false); // Prevenir que se reajuste la ventana
        this.setSize(800, 600); // Tamaño ventana
        this.setVisible(true); // Que sea visible
        this.getContentPane().setBackground(new Color(220, 220, 220));
        this.add(panel1);

        mostrarPagosArriendoSeleccionadoButton.addActionListener(this);
        realizarPagoButton.addActionListener(this);

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
        if (e.getSource() == mostrarPagosArriendoSeleccionadoButton) {
            System.out.println("Mostrar pagos arriendo");
        }
        if (e.getSource() == realizarPagoButton) {
            System.out.println("Pagar");
        }
    }
}


