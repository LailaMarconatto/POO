package exercicio2;
import java.time.LocalDate;

public class Produto<T> {

    private T id;
    private double valor;
    private LocalDate dataFabricacao;
    private LocalDate dataVencimento;

    public Produto(T id, double valor, LocalDate dataFabricacao, LocalDate dataVencimento) {
        setId(id);
        setValor(valor);
        setDataFabricacao(dataFabricacao);
        setDataVencimento(dataVencimento);
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id +
                ", valor=" + valor +
                ", fabricacao=" + dataFabricacao +
                ", vencimento=" + dataVencimento + "]";
    }
}
