import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DNAdesafio {

	public static void main(String[] args) {
		//String caminhoArquivo = "grafico.html";
		//String conteudo = "<html>\r\n";
		
	    String nomeArquivo = "arquivosDNA/dna-0.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
        	
            String texto;
            int totalLinhas = 0;
            
            while ((texto = br.readLine()) != null) {
            	totalLinhas++;
            }
            
            String[] linhas = new String[totalLinhas];
            int i = 0;
            
            while (i < totalLinhas && (texto = br.readLine()) != null) {
                linhas[i] = texto;
            }
            
            int invalidas = 0;
            for (String linha : linhas) {
        		char[] letras = linha.toCharArray();
        		boolean valido = true;
        		
        		for(char letra : letras) {
        			if(letra != 'A' && letra != 'T' && letra != 'C' && letra != 'G' ) {
        				invalidas++;
        				valido = false;
        				break;
        			} else {
        				if (letra == 'A') {
        					System.out.print("T");
        				} 
        				else if (letra == 'T') {
        					System.out.print("A");
        				} 
        				else if (letra == 'G') {
        					System.out.print("C");
        				} 
        				else if (letra == 'C') {
        					System.out.print("G");
        				}
        			}
        		}
        		
        		if (!valido) {
        			System.out.print("*** FITA INVALIDA: "+linha);
        		}
            } 
            System.out.println("Total de linhas: "+totalLinhas);
            System.out.println("Total de linhas válidas: "+(totalLinhas-invalidas));
            System.out.println("Total de linhas inválidas: "+(totalLinhas+invalidas));
            
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
        
        /*
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			
			writer.write(conteudo);
			
			writer.close();
			
			System.out.println("Arquivo criado");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}
		*/

	}

}
