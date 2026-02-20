
public enum tipoFuncionario {
	ESTAGIARIO(0.2),
	DESENVOLVEDOR(0.1),
	ANALISTA(0.05),
	GERENTE(0.01);
	
	private final double aumento;
	
	tipoFuncionario(double valor){
		aumento = valor;
	}
	
	public double getAumento() {
		return aumento;
	}
}
