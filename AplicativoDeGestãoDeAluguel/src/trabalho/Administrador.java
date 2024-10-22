package trabalho;

import java.util.List;

public class Administrador extends Usuario {
    private List<Imovel> listaFavoritos;
    private List<Reserva> historicoReservas;

    public Administrador(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
    }

    public void gerenciarUsuarios(Usuario usuario) {
        // Lógica para gerenciar usuários (desativar, alterar permissões, etc.)
    }
}

