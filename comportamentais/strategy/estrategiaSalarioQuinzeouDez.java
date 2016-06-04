package strategy;

public class estrategiaSalarioQuinzeouDez implements CalculaImposto{

	@Override
	public double calculaImpostoSalario(Funcionario funcionario) {
		if(funcionario.getSalario() >= 2000.0){
			return funcionario.getSalario() * 0.85;
		}
		else
			return funcionario.getSalario() * 0.90;
	}
}
