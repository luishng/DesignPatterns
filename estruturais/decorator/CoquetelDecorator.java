package decorator;

public abstract class CoquetelDecorator extends Coquetel {
	Coquetel coquetel;
	
	public CoquetelDecorator(Coquetel umCoquetel) {
        coquetel = umCoquetel;
    }

	public String getNome() {
		return coquetel.getNome()+" "+nome;
	}

	public Double getPreco() {
		return coquetel.getPreco() + preco;
	}
}
