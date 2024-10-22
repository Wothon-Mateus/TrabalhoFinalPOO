package trabalho;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String telefone;
    protected String senha;

    public Usuario(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public void registrar() {
        // Lógica para registrar o usuário
    }

    public void editarRegistro(String novoNome, String novoEmail, String novoTelefone) {
        this.nome = novoNome;
        this.email = novoEmail;
        this.telefone = novoTelefone;
        // Lógica para editar o registro do usuário
    }
}
