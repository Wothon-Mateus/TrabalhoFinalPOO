package trabalho;

import java.util.List;

public class Administrador extends Usuario {

    public Administrador(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
    }

    public void gerenciarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Gerenciando usuário: " + usuario.getNome());
        }
    }
}

