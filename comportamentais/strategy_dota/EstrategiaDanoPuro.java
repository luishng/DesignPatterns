package strategy_dota;

public class EstrategiaDanoPuro implements Dano {

	@Override
	public double levarDano(Heroi heroi, double dano) {
		return heroi.getHp() - dano;
	}
}
