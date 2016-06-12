package strategy_dota;

public class Heroi {
	private double hp;
	private double resistenciaMagica;
	private double resistenciaFisica;
	
	private Dano estrategiaDano;
	
	
	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	public double getResistenciaMagica() {
		return resistenciaMagica;
	}

	public void setResistenciaMagica(double resistenciaMagica) {
		this.resistenciaMagica = resistenciaMagica;
	}

	public double getResistenciaFisica() {
		return resistenciaFisica;
	}

	public void setResistenciaFisica(double resistenciaFisica) {
		this.resistenciaFisica = resistenciaFisica;
	}

	public Dano getEstrategiaDano() {
		return estrategiaDano;
	}

	public void setEstrategiaDano(Dano estrategiaDano) {
		this.estrategiaDano = estrategiaDano;
	}

	public Heroi(double hp, double resistenciaMagica,
			double resistenciaFisica){
		this.hp = hp;
		this.resistenciaMagica = resistenciaMagica;
		this.resistenciaFisica = resistenciaFisica;
	}
	
	public double levarDano(Dano estrategia, double danoSofrido){
		return estrategia.levarDano(this, danoSofrido);
	}
}
