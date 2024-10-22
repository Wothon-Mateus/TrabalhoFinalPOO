package trabalho;

import java.util.List;
import java.util.Date;

public class Imovel {
    private String tipo;
    private float area;
    private String endereco;
    private int qtdQuartos;
    private int qtdBanheiros;
    private float valorDiaria;
    private float valorSemanal;
    private float valorMensal;
    private List<Date> datasDisponibilidade;
    private String descricao;
    private List<String> fotos;

    public Imovel(String tipo, float area, String endereco, int qtdQuartos, int qtdBanheiros, float valorDiaria, float valorSemanal, float valorMensal, String descricao, List<String> fotos) {
        this.tipo = tipo;
        this.area = area;
        this.endereco = endereco;
        this.qtdQuartos = qtdQuartos;
        this.qtdBanheiros = qtdBanheiros;
        this.valorDiaria = valorDiaria;
        this.valorSemanal = valorSemanal;
        this.valorMensal = valorMensal;
        this.descricao = descricao;
        this.fotos = fotos;
    }

    public boolean verificarDisponibilidade(Date inicio, Date fim) {
        return true; // Simulação de disponibilidade
    }

    public void atualizarDisponibilidade(Date periodo) {
        // Atualizar disponibilidade
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
