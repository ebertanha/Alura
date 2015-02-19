package financeiro;

public class GerenciadorDeDividas {
	public void efetuaPagamento(Divida divida, double valor, String pagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setPagador(pagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
}
