package state_dota;

public class EstrategiaDanoFisico implements Dano {

	@Override
	public double levarDano(Heroi heroi, double dano) {
		return heroi.getHp() - (dano - heroi.getResistenciaFisica()*dano/100.0);
	}
}
