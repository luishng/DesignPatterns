package state_dota;

public class Cliente {

	public static void main(String[] args) {
		Heroi axe = new Heroi(1000.0, 10.0, 20.0);
		
		System.out.println("O heroi ficou com: "+axe.levarDano(new EstrategiaDanoPuro(), 200.0)+" de vida.");
	}
}
