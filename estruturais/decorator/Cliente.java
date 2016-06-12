package decorator;

public abstract class Cliente {
	public static void main(String[] args) {
        Coquetel coquetel = new Vodka();
        System.out.println(coquetel.getNome() + " = "
                + coquetel.getPreco());
        
        System.out.println("\n---------------------------\n");
        
        coquetel = new Suco(coquetel);
        coquetel = new Refrigerante(coquetel);
        System.out.println(coquetel.getNome() + " = "
                + coquetel.getPreco());
    }
}