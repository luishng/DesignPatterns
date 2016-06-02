package factory_method;

public class FabricaDePrata implements FabricaDePatente {

	@Override
	public Patente patenteJogador() {
		return new Prata();
	}
}
