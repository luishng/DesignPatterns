package strategy;

public class Cliente {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario(Funcionario.DESENVOLVEDOR, 1500);
		
		System.out.println(funcionario.calculaSalarioComImposto());
	}
}
