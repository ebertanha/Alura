package ChainOfResponsibility;

public class DescontoPorMaisCincoItens implements Desconto {
	
	private Desconto proximoDesconto;
	
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getItems().size() > 5) {
			return orcamento.getValor() * 0.10;
		}
		else {
			return proximoDesconto.desconta(orcamento);
		}
	}
	
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}
