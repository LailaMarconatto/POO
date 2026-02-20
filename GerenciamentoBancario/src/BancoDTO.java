package mainPackage;
import java.time.*;

public class BancoDTO {
	private int codigoBanco;
	private String nome;
	private String cnpj;
	private LocalDate dataFundacao;
	private boolean ativo;
	
	public void Banco(String nome, String cnpj) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setDataFundacao(LocalDate.now());
	}
	
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public LocalDate getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(LocalDate dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public String toString() {
		return "Banco [codigoBanco=" + codigoBanco + ", nome=" + nome + ", cnpj=" + cnpj + ", dataFundacao="
				+ dataFundacao + ", ativo=" + ativo + "]";
	}
}
