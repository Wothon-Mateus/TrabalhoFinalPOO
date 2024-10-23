package trabalho;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Sistema de Gestão de Aluguel de Imóveis");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new GridLayout(3, 1));

        // Botões
        JButton btnBuscarImoveis = new JButton("Buscar Imóveis");
        JButton btnCadastrarImovel = new JButton("Cadastrar Imóvel");
        JButton btnReservarImovel = new JButton("Reservar Imóvel");

        // Adicionando botões à janela
        add(btnBuscarImoveis);
        add(btnCadastrarImovel);
        add(btnReservarImovel);

        // Ação dos botões
        btnBuscarImoveis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BuscarImoveisWindow();  // Certifique-se de que essa classe existe
            }
        });

        btnCadastrarImovel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CadastrarImovelWindow();  // Certifique-se de que essa classe existe
            }
        });

        btnReservarImovel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ReservarImovelWindow();  // Certifique-se de que essa classe existe
            }
        });

        // Tornar visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Criando a janela principal
        new MainWindow();
    }
}
