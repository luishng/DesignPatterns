package state;

public class MarioPequeno implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario ficou bombado!");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario recebeu a florzona! FOGO!");
		return new MarioFlor();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario pode voar! ué.");
		return new MarioPena();
	}

	@Override
	public MarioState tomarDano() {
		System.out.println("Mario tomou! e morreu.");
		return new MarioMorto();
	}
}

