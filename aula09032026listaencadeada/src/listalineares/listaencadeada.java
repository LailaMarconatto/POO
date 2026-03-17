package listalineares;

public class listaencadeada {
	private Nodo inicio;

	public listaencadeada() {
		inicio = null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void inserirFinal(int dado) {
		if(vazia()) {
			inserirInicio(dado);
			return;
		}
		Nodo novoNodo = new Nodo(dado);
		Nodo aux = inicio;																			
		while (aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
		
	}
	
	public void mostrarLista() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		Nodo aux = inicio;
		while (aux != null) {
			System.out.println(aux.getDado());
			aux = aux.getProx();
		}
	}
	
	public void removerValor(int valor) {
		if(vazia()) return;
		if(inicio.getDado() == valor) {
			inicio =inicio.getProx();
			return;
		}
		
		Nodo aux = inicio;
		while (aux.getProx() != null) {
			if(aux.getProx().getDado() == valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();
		}
	}
	
	public void imprimirMeio() {
		if(vazia()) {
			System.out.println("Lista vazia");
			return;
		}
		
		Nodo aux = inicio;
		Nodo meio = inicio;
		int count = 0;
		
		if(aux.getProx() == null) {
			System.out.println("meio: "+meio);
			return;
		}
		
		while(aux.getProx() != null) {
			count++;
			aux = aux.getProx();
			
			if(count != 1) {
				if(count % 2 != 0) {
					meio = meio.getProx();
				}	
			}
			
		}
		
	}
}
