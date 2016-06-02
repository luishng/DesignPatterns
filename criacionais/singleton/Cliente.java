package singleton;

import singleton.FabricaDePatente;

public class Cliente {

	public static void main(String[] args) {
		FabricaDePatente fabrica = FabricaDePatente.getInstancia();
		System.out.println(fabrica.criarPatentePrata());
		System.out.println(fabrica.criarPatentePrata());
		System.out.println(fabrica.criarPatentePrata());
		System.out.println(fabrica.criarPatenteOuro());
		System.out.println(fabrica.criarPatenteOuro());
		System.out.println(fabrica.criarPatenteGlobal());
		
		//Verificar se o singleton está funcionando.
		fabrica = FabricaDePatente.getInstancia();
		
		System.out.println(fabrica.gerarRelatorio());
	}
}
