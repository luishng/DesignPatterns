package abstract_method;

public class Cliente {
	public static void main(String args[]){
		FabricaDeCarro fabrica = new FabricaVolkswagen();
		CarroSedan sedan = fabrica.criaCarroSedan();
		CarroHatch hatch = fabrica.criaCarroHatch();
		sedan.mostraDetalhes();
		hatch.mostraDetalhes();
		
		System.out.println("\n----------\n");
		
		fabrica = new FabricaChevrolet();
		sedan = fabrica.criaCarroSedan();
		hatch = fabrica.criaCarroHatch();
		sedan.mostraDetalhes();
		hatch.mostraDetalhes();
	}
}
