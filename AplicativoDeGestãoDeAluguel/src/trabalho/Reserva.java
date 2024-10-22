package trabalho;

import java.util.Date;

public class Reserva {
    private Imovel imovel;
    private Cliente cliente;
    private Date dataInicio;
    private Date dataFim;
    private float valorTotal;
    private String status;

    public Reserva(Imovel imovel, Cliente cliente, Date dataInicio, Date dataFim, float valorTotal) {
        this.imovel = imovel;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorTotal = valorTotal;
        this.status = "Confirmada";
    }

    public void cancelar() {
        this.status = "Cancelada";
    }
}

