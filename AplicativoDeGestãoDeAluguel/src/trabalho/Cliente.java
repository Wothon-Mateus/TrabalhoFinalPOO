package trabalho;

import java.util.List;

public class Cliente extends Usuario {
    private List<Imovel> listaFavoritos;
    private List<Reserva> historicoReservas;

    public Cliente(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);
    }

    public void buscarImovel(String tipo, float faixaPreco) {
        // Lógica para buscar imóvel com filtros
    }

    public String reservarImovel(Imovel imovel, String dataInicio, String dataFim) {
        // Lógica para reservar um imóvel
        return "Reserva confirmada";
    }

    public void cancelarReserva(String idReserva) {
        // Lógica para cancelar a reserva
    }

    public void adicionarFavoritos(Imovel imovel) {
        listaFavoritos.add(imovel);
    }
}
