package template_method;

public class CartaoCredito extends CompraCartao {

	@Override
	public void realizarPedido() {
		System.out.println("Pedido de compra em processamento...");
		
	}

	@Override
	public void informarCartao() {
		System.out.println("Compra com cartão de crédito.");
		System.out.println("Informe seu dia de nascimento.");
		System.out.println("**");
		
	}

	@Override
	public void aprovarPagamento() {
		System.out.println("Pagamento aprovado.");
		
	}

	@Override
	public void liberarPagamento() {
		System.out.println("Imprimindo nota.");
	}
}
