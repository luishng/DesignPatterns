package composite;

public class TrechoDeCarro implements Trecho {

	private Integer distancia;
	
	public TrechoDeCarro(Integer distancia){
		setDistancia(distancia);
	}

	@Override
	public void mostraTrecho() {
		System.out.println("Acelerando até o talo. .--.");
	}
	
	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
}
