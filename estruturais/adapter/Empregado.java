package adapter;

public class Empregado {
	private String nome;
	
	public Empregado(String name){
		setNome(name);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
