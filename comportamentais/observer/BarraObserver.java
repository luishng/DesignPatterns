package observer;

public class BarraObserver extends DadosObserver{

	
	public BarraObserver(DadosSubject dados){
		super(dados);
	}
	
	@Override
	public void update() {
		System.out.println("To na barra, DadoA: "+dados.getState().dadoA+" DadoB: "+dados.getState().dadoB+" DadoC: "+dados.getState().dadoC);
	}
}
