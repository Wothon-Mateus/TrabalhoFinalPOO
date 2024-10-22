package trabalho;

import java.util.Date;

public class Pagamento {
    private Reserva reserva;
    private Date dataPagamento;
    private float valor;
    private String formaPagamento;

    public Pagamento(Reserva reserva, Date dataPagamento, float valor, String formaPagamento) {
        this.reserva = reserva;
        this.dataPagamento = dataPagamento;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }

    public boolean confirmarPagamento() {
        System.out.println("Pagamento confirmado no valor de: " + valor);
        return true;
    }
}
