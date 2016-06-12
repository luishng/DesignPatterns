package facade;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("***Configurando SubSistemas***");
		SistemaFacade facade = new SistemaFacade();

		System.out.println("\n-----------------------\n");
		
		System.out.println("***Utilizando SubSistemas***");
		facade.renderizarImagem("photo.png");
		facade.reproduzirAudio("sun.mp3");
	}

}
