package strategy;

public class Funcionario {
	public static final int DESENVOLVEDOR = 1;
	public static final int GERENTE = 2;
	public static final int TECNICO = 3;
	
	private double salario;
	private int cargo;
	
	public static CalculaImposto calculaImposto;
	
	public Funcionario(int cargo, double salario){
		this.salario = salario;
		this.cargo = cargo;
		
		switch(cargo){
			case DESENVOLVEDOR:
				calculaImposto = new estrategiaSalarioQuinzeouDez();
				break;
			case GERENTE:
				calculaImposto = new estrategiaSalarioVinteouQuinze();
				break;
			case TECNICO:
				calculaImposto = new estrategiaSalarioQuinzeouDez();
				break;
		}
	}
	
	public double calculaSalarioComImposto(){
		return calculaImposto.calculaImpostoSalario(this);
	}

	public double getSalario() {
		return salario;
	}
}
