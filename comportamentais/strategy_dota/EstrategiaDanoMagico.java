package state_dota;

public class EstrategiaDanoMagico implements Dano {

	@Override
	public double levarDano(Heroi heroi, double dano) {
		return heroi.getHp() - (dano - heroi.getResistenciaMagica()*dano/100.0);
	}

}
