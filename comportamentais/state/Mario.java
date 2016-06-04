package state;

public class Mario {
	
	protected MarioState estado;
	
	public Mario(){
		estado = new MarioPequeno();
	}
	
	public void pegarPena(){
		estado = estado.pegarPena();
	}
	
	public void pegarFlor(){
		estado = estado.pegarFlor();
	}
	
	public void pegarCogumelo(){
		estado = estado.pegarCogumelo();
	}
	
	public void tomarDano(){
		estado = estado.tomarDano();
	}

}
