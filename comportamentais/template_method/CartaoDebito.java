package template_method;

public class CartaoDebito extends CompraCartao {

	@Override
	public void realizarPedido() {
		System.out.println("Pedido de compra em processamento...");
		
	}

	@Override
	public void informarCartao() {
		System.out.println("Compra com cartão de débito.");
		System.out.println("Informe sua senha.");
		System.out.println("*********");
		
	}

	@Override
	public void aprovarPagamento() {
		System.out.println("Pagamento realizado com sucesso.");
		
	}

	@Override
	public void liberarPagamento() {
		System.out.println("Imprimindo nota.");
	}
}
