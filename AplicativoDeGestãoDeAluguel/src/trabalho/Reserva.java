package trabalho;
import java.util.Date;

public class Reserva {
    private Imovel imovel;
    private Cliente cliente;
    private String dataInicio;
    private String dataFim;
    private float valorTotal;
    private String status;

    public Reserva(Imovel imovel, Cliente cliente, String dataInicio, String dataFim, float valorTotal) {
        this.imovel = imovel;
        this.cliente = cliente;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valorTotal = valorTotal;
        this.status = "Confirmada";
    }

    public void cancelar() {
        this.status = "Cancelada";
        System.out.println("Reserva cancelada.");
    }
}
