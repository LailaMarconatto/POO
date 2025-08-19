import java.util.Scanner;
import java.net.InetAddress;


public class CatchIp {
	  public static void main(String[] args) {
		  String[] ips = { "172.16.2.251", "172.16.0.225", "172.16.0.112"};

			Scanner en = new Scanner(System.in);
			System.out.print("Informe o tempo de checagem: ");
			int temp = en.nextInt();
			System.out.println("Tempo de checagem: " + temp);

			int erros = 0;

			while (true) {
				for (int i = 0; i < ips.length; i++) {
					String ip = ips[i];
					System.out.println("\nTentando alcançar: " + ip);

					try {
						InetAddress address = InetAddress.getByName(ip);
						if (address.isReachable(temp)) {
							System.out.println("Ok");
						} else {
							System.out.println("Erro");
							erros++;
						}
					} catch (Exception e) {
						System.out.println("Exceção ao tentar o IP: " + ip);
						erros++;
					}
				}
				if (erros > 0) {
					System.out.println("\nTotal de erros: " + erros + " de " + ips.length + " IPs testados.");
					erros = 0;
				}
				en.close();
			}
	    }
}