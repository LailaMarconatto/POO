import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteSocket {
	
	public static void main(String[] args) throws IOException {
		// Utilizada para leitura do teclado
		Scanner entrada = new Scanner(System.in);
		// Variável para armazenar o texto que será digitado
		String texto = "";
		// Socket Cliente
		Socket cliente = null;
		// Stream (tubo) de saída de dados
		
		PrintStream saida = null;
		BufferedReader dados = null;
		
		try{
			
			// Cria o socket com os parâmetros
			cliente = new Socket("172.16.2.207",7000);
			String texto1 = String.valueOf(cliente.getInetAddress());
			texto1 = texto1.replaceAll("/","");
			System.out.println(texto1);
			dados = new BufferedReader(new
			
			InputStreamReader(cliente.getInputStream()));
			// Stream de saída de dados
			saida = new PrintStream(cliente.getOutputStream());
			do{
				// Lê o teclado do cliente
				texto = entrada.nextLine();
				// Imprime o texto para o stream de saída de dados(Servidor)
				saida.println(texto);
				System.out.println(dados.readLine());
			}while(!"sair".equals(texto));
			
		}catch(IOException e){
			System.out.println("Algo errado aconteceu");
		}finally{
			// 	Encerra o socket cliente
			cliente.close();
		}
		entrada.close();
	}
}