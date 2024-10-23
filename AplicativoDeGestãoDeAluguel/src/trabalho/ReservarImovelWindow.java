package trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReservarImovelWindow extends JFrame {

    public ReservarImovelWindow() {
        setTitle("Reservar Imóvel");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(4, 2));

        JLabel lblImovel = new JLabel("Imóvel:");
        JTextField txtImovel = new JTextField();

        JLabel lblDataInicio = new JLabel("Data Início:");
        JTextField txtDataInicio = new JTextField();

        JLabel lblDataFim = new JLabel("Data Fim:");
        JTextField txtDataFim = new JTextField();

        JButton btnReservar = new JButton("Reservar");

        // Adicionando componentes à janela
        add(lblImovel);
        add(txtImovel);
        add(lblDataInicio);
        add(txtDataInicio);
        add(lblDataFim);
        add(txtDataFim);
        add(new JLabel()); // Espaço vazio
        add(btnReservar);

        // Ação do botão Reservar
        btnReservar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String imovel = txtImovel.getText();
                String dataInicio = txtDataInicio.getText();
                String dataFim = txtDataFim.getText();
                JOptionPane.showMessageDialog(null, "Reserva realizada para o imóvel: " + imovel + " de " + dataInicio + " a " + dataFim);
            }
        });

        setVisible(true);
    }
}

