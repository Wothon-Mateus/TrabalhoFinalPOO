package trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscarImoveisWindow extends JFrame {

    public BuscarImoveisWindow() {
        setTitle("Buscar Imóveis");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3, 2));

        JLabel lblTipo = new JLabel("Tipo de Imóvel:");
        JTextField txtTipo = new JTextField();

        JLabel lblPreco = new JLabel("Preço Máximo:");
        JTextField txtPreco = new JTextField();

        JButton btnBuscar = new JButton("Buscar");

        // Adicionando componentes à janela
        add(lblTipo);
        add(txtTipo);
        add(lblPreco);
        add(txtPreco);
        add(new JLabel()); // Espaço vazio
        add(btnBuscar);

        // Ação do botão Buscar
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipo = txtTipo.getText();
                String preco = txtPreco.getText();
                JOptionPane.showMessageDialog(null, "Buscando imóveis do tipo: " + tipo + " com preço até: " + preco);
            }
        });

        setVisible(true);
    }
}
