package state;

public class MarioFlor implements MarioState{

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario recebeu 1000 pontos!");
		return this;
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario recebeu 1000 pontos! FOGO!");
		return this;
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario pode voar! Pegou a pena.");
		return new MarioPena();
	}

	@Override
	public MarioState tomarDano() {
		System.out.println("Mario tomou! Ficou sem flor...");
		return new MarioGrande();
	}
}

