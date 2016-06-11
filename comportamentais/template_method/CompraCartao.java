package template_method;

public abstract class CompraCartao {
	
	public final void realizarCompra(){
		realizarPedido();
		informarCartao();
		aprovarPagamento();
		liberarPagamento();
	}
	
	public abstract void realizarPedido();
	public abstract void informarCartao();
	public abstract void aprovarPagamento();
	public abstract void liberarPagamento();
}
