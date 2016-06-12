package decorator;

public class Refrigerante extends CoquetelDecorator{

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 5.0;
	}

}
