// Esse codigo deve ser delatado
package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Cliente cliente = new Cliente("João Silva", "joao@gmail.com", "123456789", "senha123");
        Proprietario proprietario = new Proprietario("Maria Souza", "maria@gmail.com", "987654321", "senha456");
        Administrador admin = new Administrador("Administrador", "admin@admin.com", "000000000", "admin123");

        // Criando um imóvel
        List<String> fotos = new ArrayList<>();
        fotos.add("foto1.jpg");
        fotos.add("foto2.jpg");
        Imovel imovel = new Imovel("Apartamento", 100, "Rua 123", 3, 2, 200, 1200, 4000, "Apartamento com vista para o mar.", fotos);

        // Proprietário cadastra imóvel
        proprietario.cadastrarImovel(imovel);

        // Cliente busca imóvel
        cliente.buscarImovel("Apartamento", 500);

        // Cliente reserva imóvel
        cliente.reservarImovel(imovel, "2024-11-01", "2024-11-10");

        // Proprietário edita imóvel
        proprietario.editarImovel(imovel, "Apartamento com vista para o mar e piscina.");

        // Admin gerencia usuários
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(cliente);
        usuarios.add(proprietario);
        admin.gerenciarUsuarios(usuarios);
    }
}

