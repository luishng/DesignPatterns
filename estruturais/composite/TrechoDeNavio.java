package composite;

public class TrechoDeNavio implements Trecho {

	private Integer distancia;
	
	public TrechoDeNavio(Integer distancia){
		setDistancia(distancia);
	}

	@Override
	public void mostraTrecho() {
		System.out.println("Navegando no navio. ..--*--..");
	}
	
	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
}
