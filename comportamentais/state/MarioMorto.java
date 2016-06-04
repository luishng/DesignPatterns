package state;

public class MarioMorto implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Morreu. Não é monstro!");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Virou adubo da flor. Morreu!");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Pena mesmo, morreu.");
		return this;
	}

	@Override
	public MarioState tomarDano() {
		System.out.println("Já era, morreu. Como vai tomar mais dano?");
		return this;
	}

}
