package facade;

public class SistemaFacade {
	protected SistemaAudio audio;
	protected SistemaVideo video;
	protected SistemaEntrada entrada;
	
	public SistemaFacade(){
		this.audio = new SistemaAudio();
		audio.configurarFrequencia();
		audio.configurarVolume();
		
		this.video = new SistemaVideo();
		video.configurarCores();
		video.configurarResolucao();
		
		this.entrada = new SistemaEntrada();
		entrada.configurarMouse();
		entrada.configurarTeclado();
	}
	
	public void renderizarImagem(String arquivo){
		this.video.renderizarVideo(arquivo);
	}
	
	public void reproduzirAudio(String arquivo){
		this.audio.reproduzirAudio(arquivo);
	}
}
