package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Estrutura<T> {

    private class Item {
        String chave;
        T valor;

        Item(String chave, T valor) {
            setChave(chave);
            setValor(valor);
        }

        public String getChave() {
			return chave;
		}

		public void setChave(String chave) {
			this.chave = chave;
		}

		public T getValor() {
			return valor;
		}

		public void setValor(T valor) {
			this.valor = valor;
		}

		@Override
        public String toString() {
            return "Chave: " + chave + " | Valor: " + valor;
        }
    }

    private List<Item> lista;

    public Estrutura() {
        lista = new ArrayList<>();
    }

    public boolean add(String chave, T valor) {
        for (Item item : lista) {
            if (item.chave.equals(chave)) {
                return false;
            }
        }

        lista.add(new Item(chave, valor));
        return true;
    }

    public Item buscar(String chave) {
        for (Item item : lista) {
            if (item.chave.equals(chave)) {
                return item;
            }
        }

        return null;
    }
}
