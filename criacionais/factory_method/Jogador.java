package factory_method;

public class Jogador {

	public static void main(String[] args) {
		FabricaDePatente fabrica = new FabricaDePrata();
		Patente patente = fabrica.patenteJogador();
		patente.mostrarPatente();
		System.out.println();
		
		FabricaDePatente fabrica2 = new FabricaDeGlobal();
		Patente patente2 = fabrica2.patenteJogador();
		patente2.mostrarPatente();
		System.out.println();
	}
}
