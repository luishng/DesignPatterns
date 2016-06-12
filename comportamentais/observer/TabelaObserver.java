package observer;

public class TabelaObserver extends DadosObserver {

	public TabelaObserver(DadosSubject dados) {
		super(dados);
	}

	@Override
	public void update() {
		System.out.println("To na tabela: DadoA-Tabela: "+dados.getState().dadoA+" DadoB-Tabela: "+dados.getState().dadoB+""
				+ " DadoC-Tabela: "+dados.getState().dadoC);
		
	}
}
