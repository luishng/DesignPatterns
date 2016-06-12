package facade;

public class SistemaVideo {
	
	public void configurarResolucao(){
		System.out.println("Resolucao configurada!");
	}
	
	public void configurarCores(){
		System.out.println("Cores configuradas!");
	}
	
	public void renderizarVideo(String arquivo){
		System.out.println("Rederizando video do arquivo: "+arquivo);
	}
	
}
