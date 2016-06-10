package composite;

public class TrechoDeAviao implements Trecho{

	private Integer distancia;
	
	public TrechoDeAviao(Integer distancia){
		setDistancia(distancia);
	}

	@Override
	public void mostraTrecho() {
		System.out.println("Voando de Avião. .-''-.");
	}
	
	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
}
