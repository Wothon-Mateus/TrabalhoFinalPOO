package trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarImovelWindow extends JFrame {

    public CadastrarImovelWindow() {
        setTitle("Cadastrar Imóvel");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 2));

        JLabel lblTipo = new JLabel("Tipo:");
        JTextField txtTipo = new JTextField();

        JLabel lblEndereco = new JLabel("Endereço:");
        JTextField txtEndereco = new JTextField();

        JLabel lblQuartos = new JLabel("Número de Quartos:");
        JTextField txtQuartos = new JTextField();

        JLabel lblBanheiros = new JLabel("Número de Banheiros:");
        JTextField txtBanheiros = new JTextField();

        JLabel lblPreco = new JLabel("Preço Diária:");
        JTextField txtPreco = new JTextField();

        JButton btnCadastrar = new JButton("Cadastrar");

        // Adicionando componentes à janela
        add(lblTipo);
        add(txtTipo);
        add(lblEndereco);
        add(txtEndereco);
        add(lblQuartos);
        add(txtQuartos);
        add(lblBanheiros);
        add(txtBanheiros);
        add(lblPreco);
        add(txtPreco);
        add(new JLabel()); // Espaço vazio
        add(btnCadastrar);

        // Ação do botão Cadastrar
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipo = txtTipo.getText();
                String endereco = txtEndereco.getText();
                String quartos = txtQuartos.getText();
                String banheiros = txtBanheiros.getText();
                String preco = txtPreco.getText();
                JOptionPane.showMessageDialog(null, "Imóvel cadastrado:\nTipo: " + tipo + "\nEndereço: " + endereco);
            }
        });

        setVisible(true);
    }
}

