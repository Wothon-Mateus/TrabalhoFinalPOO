package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private List<Imovel> listaFavoritos;
    private List<Reserva> historicoReservas;

    public Cliente(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
        listaFavoritos = new ArrayList<>();
        historicoReservas = new ArrayList<>();
    }

    public void buscarImovel(String tipo, float faixaPreco) {
        System.out.println("Buscando imóveis do tipo: " + tipo + " com preço até: " + faixaPreco);
        // Lógica de busca (simulação)
    }

    public String reservarImovel(Imovel imovel, String dataInicio, String dataFim) {
        Reserva novaReserva = new Reserva(imovel, this, dataInicio, dataFim, imovel.getValorDiaria());
        historicoReservas.add(novaReserva);
        System.out.println("Reserva realizada para o imóvel: " + imovel.getDescricao());
        return "Reserva confirmada";
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.cancelar();
        System.out.println("Reserva cancelada.");
    }

    public void adicionarFavoritos(Imovel imovel) {
        listaFavoritos.add(imovel);
        System.out.println("Imóvel adicionado aos favoritos.");
    }
}
