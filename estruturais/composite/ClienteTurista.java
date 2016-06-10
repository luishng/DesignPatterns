package composite;

public class ClienteTurista {
	
	public static void main(String args[]){
		Trecho trecho1 = new TrechoDeCarro(1000);
		Trecho trecho2 = new TrechoDeNavio(500);
		Trecho trecho3 = new TrechoDeCarro(157);
		Trecho trecho4 = new TrechoDeAviao(2000);
		
		
		Caminho caminho1 = new Caminho();
		System.out.println("Indo para São Paulo.");
		caminho1.adicionarTrecho(trecho1);
		caminho1.mostraTrecho();
		
		System.out.println("\n------------------------\n");
		
		Caminho caminho2 = new Caminho();
		System.out.println("Indo para São Paulo.");
		System.out.println("Melhor ir para o Campo grande.");
		caminho2.adicionarTrecho(caminho1);
		caminho2.adicionarTrecho(trecho2);
		caminho2.adicionarTrecho(trecho3);
		caminho2.mostraTrecho();
	
		System.out.println("\n------------------------\n");
		
		Caminho caminho3 = new Caminho();
		System.out.println("Indo para São Paulo.");
		System.out.println("Melhor ir para o Campo grande.");
		System.out.println("Partiu Ceara!");
		caminho3.adicionarTrecho(caminho2);
		caminho3.adicionarTrecho(trecho4);
		caminho3.mostraTrecho();
		
	}
	
}
