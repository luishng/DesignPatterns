package adapter;

public class ControleDePonto {
	int IdResponsavelControleDePonto;
	
	public ControleDePonto(int IdResponsavelControleDePonto){
		this.IdResponsavelControleDePonto = IdResponsavelControleDePonto;
	}
	
	public void registraEntrada(Empregado empregado){
		System.out.println("O empregado: "+empregado.getNome()+" acabou de `ENTRAR` na empresa.");
	}
	
	public void registraSaida(Empregado empregado){
		System.out.println("O empregado: "+empregado.getNome()+" acabou de `SAIR` na empresa.");
	}
}
