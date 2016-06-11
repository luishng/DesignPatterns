package abstract_method;

public class PoloSedan implements CarroSedan {

	@Override
	public void mostraDetalhes() {
		System.out.println("Carro: Polo Sedan ---- EMPRESA: Volkwagen");
	}
}
