//Classe Main -> responsável por pegar as informações no arquivo
public class Main {

	public static void main(String[] args) {
		
        ContatoArray array = new ContatoArray();

        //array.clearContatos();
        array.createContato(1, "joao", "joao@gmail.com", "(47)99999-8888", "2020-01-08");
        array.createContato(2, "maria", "maria@gmail.com", "(47)98888-1111", "2000-05-20");
        array.createContato(3, "juca", "maria@gmail.com", "(47)98888-1111", "2000-05-20");
        array.createContato(4, "juca", "maria@gmail.com", "(47)98888-1111", "2000-05-20");
		
	}

}
