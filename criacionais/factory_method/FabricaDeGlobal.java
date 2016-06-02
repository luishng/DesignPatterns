package factory_method;

public class FabricaDeGlobal implements FabricaDePatente{

	@Override
	public Patente patenteJogador() {
		return new Global();
	}

}
