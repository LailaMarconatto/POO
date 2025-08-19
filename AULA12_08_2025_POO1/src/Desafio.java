import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Desafio {
	public static void main(String[] args) {
		/*
		 *  Faca um programa que peca ao usuario a quantidade de numeros que
		 *  devem ser gerados em uma amostra aleatoria, o usuario tambem ir ́a informar
		 *  os valores mınimo e maximo possıveis da amostra.
		 *  Com os numeros gerados você deve criar um arquvivo .html com um
		 *  grafico de linha usando o padrao Google Charts. Onde o eixo Y serao os
		 *  numeros gerados e o eixo X um contador simples iniciando em 1.
		 *  
		*/ 
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Insira quantos números devem ser gerados para a amostra: ");
		int qnt = input.nextInt();
		
		System.out.println("Insira o valor mínimo para ser gerado na amostra: ");
		int min = input.nextInt();
		
		System.out.println("Insira o valor máximo para ser gerado na amostra: ");
		int max = input.nextInt();
		
		for (int i = 0; i <= qnt; i++) {
			int rand = random.nextInt(min, max)+1;
			System.out.println(rand);
		}
		
		
		String caminhoArquivo = "grafico.html";
		
		String conteudo = "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "        <script type=\"text/javascript\">\r\n"
				+ "            google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "            google.charts.setOnLoadCallback(drawChart);\r\n"
				+ "\r\n"
				+ "            function drawChart() {\r\n"
				+ "                var data = google.visualization.arrayToDataTable([\r\n"
				+ "                    ['Year','Sales','Expenses'],\r\n"
				+ "                    ['2004',1000,400],\r\n"
				+ "                    ['2005',1170,460],\r\n"
				+ "                    ['2006',660,1120],\r\n"
				+ "                    ['2007',1030,540],\r\n"
				+ "                ]);\r\n"
				+ "\r\n"
				+ "                var options = {\r\n"
				+ "                    title: 'Company Performance',\r\n"
				+ "                    curveType: 'function',\r\n"
				+ "                    legend: { position: 'bottom' }\r\n"
				+ "                };\r\n"
				+ "\r\n"
				+ "                var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));\r\n"
				+ "\r\n"
				+ "                chart.draw(data, options);\r\n"
				+ "            }\r\n"
				+ "        </script>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <div id=\"curve_chart\" style=\"width: 900px; height: 500px\"></div>\r\n"
				+ "    </body>\r\n"
				+ "</html>";
		
		try {
			FileWriter writer = new FileWriter(caminhoArquivo);
			
			writer.write(conteudo);
			
			writer.close();
			
			System.out.println("Arquivo criado");
		} catch (IOException e) {
			System.out.println("Ocorreu um erro: "+e.getMessage());
		}
		
		//input.close();
		
	}

}
