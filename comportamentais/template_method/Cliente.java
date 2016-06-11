package template_method;

public class Cliente {

	public static void main(String[] args) {
		CompraCartao cartao = new CartaoDebito();
		cartao.realizarCompra();
		
		System.out.println("\n---------------------------------\n");
		
		CompraCartao cartao2 = new CartaoCredito();
		cartao2.realizarCompra();
	}

}
