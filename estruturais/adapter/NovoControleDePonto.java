package adapter;

public class NovoControleDePonto {
	int IdResponsavelControleDePonto;
	
	public NovoControleDePonto(int IdResponsavelControleDePonto){
		this.IdResponsavelControleDePonto = IdResponsavelControleDePonto;
	}
	
	public void registrarControle(Empregado empregado, boolean entrouNaEmpresa){
		if(entrouNaEmpresa == true)
			System.out.println("O empregado: "+empregado.getNome()+" acabou de `ENTRAR` na empresa no novo ponto de controle.");
		else
			System.out.println("O empregado: "+empregado.getNome()+" acabou de `SAIR` na empresa no novo ponto de controle.");
	}
}
