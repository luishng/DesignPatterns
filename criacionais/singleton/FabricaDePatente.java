package singleton;

public class FabricaDePatente {
	private static FabricaDePatente instancia;
	
	protected int totalPatentePrata;
    protected int totalPatenteOuro;
    protected int totalPatenteGlobal;
	
	private FabricaDePatente(){
		
	}
	
	public static FabricaDePatente getInstancia(){
		if(instancia == null)
			instancia = new FabricaDePatente();
		
		return instancia;
	}
 
    public String criarPatentePrata() {
        return new String("Patente Prata #" + totalPatentePrata++ + " encontrado.");
    }
 
    public String criarPatenteOuro() {
        return new String("Patente Ouro #" + totalPatenteOuro++ + " encontrado.");
    }
 
    public String criarPatenteGlobal() {
        return new String("Patente Global #" + totalPatenteGlobal++ + " encontrado.");
    }
 
    public String gerarRelatorio() {
        return new String("Total de patentes Prata vendidos: " + totalPatentePrata
                + "\nTotal de patentes Ouro vendidos: " + totalPatenteOuro
                + "\nTotal de patentes Global vendidos: " + totalPatenteGlobal);
    }
	
}
