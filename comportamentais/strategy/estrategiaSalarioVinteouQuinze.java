package strategy;

public class estrategiaSalarioVinteouQuinze implements CalculaImposto {

	@Override
	public double calculaImpostoSalario(Funcionario funcionario) {
		if(funcionario.getSalario() >= 3500.0){
			return funcionario.getSalario() * 0.80;
		}else{
			return funcionario.getSalario() * 0.85;
		}
	}

}
