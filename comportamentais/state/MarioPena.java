package state;

public class MarioPena implements MarioState{

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
		System.out.println("Mario recebeu 1000 pontos! Pegou a pena.");
		return this;
	}

	@Override
	public MarioState tomarDano() {
		System.out.println("Mario toemou! Ficou sem florzinha");
		return new MarioGrande();
	}
}
