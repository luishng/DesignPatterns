package abstract_method;

public class FabricaVolkswagen implements FabricaDeCarro{

	@Override
	public CarroSedan criaCarroSedan() {
		return new PoloSedan();
	}

	@Override
	public CarroHatch criaCarroHatch() {
		return new GolfHatch();
	}
}
