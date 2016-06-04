package state;

public class MarioGrande implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario recebeu 1000 pontos!");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario pegou a florzinha! FOGO!");
		return new MarioFlor();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario pode voar! Pegou a pena.");
		return new MarioPena();
	}

	@Override
	public MarioState tomarDano() {
		System.out.println("Mario tomou na tarraqueta! Ficou pequeno");
		return new MarioPequeno();
	}
}
