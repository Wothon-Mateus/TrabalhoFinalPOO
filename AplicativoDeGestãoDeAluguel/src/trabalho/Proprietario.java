package trabalho;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Proprietario extends Usuario {
    private List<Imovel> listaImoveis;

    public Proprietario(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
        listaImoveis = new ArrayList<>();
    }

    public void cadastrarImovel(Imovel imovel) {
        listaImoveis.add(imovel);
        System.out.println("Imóvel cadastrado com sucesso.");
    }

    public void editarImovel(Imovel imovel, String novaDescricao) {
        imovel.setDescricao(novaDescricao);
        System.out.println("Imóvel editado com sucesso.");
    }

    public void excluirImovel(Imovel imovel) {
        listaImoveis.remove(imovel);
        System.out.println("Imóvel excluído com sucesso.");
    }

    public List<Imovel> getListaImoveis() {
        return listaImoveis;
    }
}
