package facade;

public class SistemaAudio {
	public void configurarVolume(){
		System.out.println("Volume configurado!");
	}
	
	public void configurarFrequencia(){
		System.out.println("Frequencias configuradas!");
	}
	
	public void reproduzirAudio(String arquivo){
		System.out.println("Habilitando audio do arquivo: "+arquivo);
	}
}
