package abstract_method;

public class FabricaChevrolet implements FabricaDeCarro{

	@Override
	public CarroSedan criaCarroSedan() {
		return new SonicSedan();
	}

	@Override
	public CarroHatch criaCarroHatch() {
		return new CruzeHatch();
	}
	
}
