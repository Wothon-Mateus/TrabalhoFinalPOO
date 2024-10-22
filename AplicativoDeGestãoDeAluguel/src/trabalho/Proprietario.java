package trabalho;

import java.util.List;

public class Proprietario extends Usuario {
    private List<Imovel> listaImoveis;

    public Proprietario(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
    }

    public void cadastrarImovel(Imovel imovel) {
        listaImoveis.add(imovel);
    }

    public void editarImovel(Imovel imovel) {
        // Lógica para editar um imóvel
    }

    public void excluirImovel(Imovel imovel) {
        listaImoveis.remove(imovel);
    }
}
