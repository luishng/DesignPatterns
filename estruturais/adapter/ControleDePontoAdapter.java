package adapter;

public class ControleDePontoAdapter extends ControleDePonto{
	private NovoControleDePonto novoControle;
	
	public ControleDePontoAdapter(int IdResponsavelControleDePonto) {
		super(IdResponsavelControleDePonto);
		this.novoControle = new NovoControleDePonto(IdResponsavelControleDePonto);
	}
	
	public void registraEntrada(Empregado empregado){
		this.novoControle.registrarControle(empregado, true);
	}
	
	public void registraSaida(Empregado empregado){
		this.novoControle.registrarControle(empregado, false);
	}
}
