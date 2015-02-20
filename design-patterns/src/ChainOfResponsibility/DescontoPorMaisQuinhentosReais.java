package ChainOfResponsibility;

public class DescontoPorMaisQuinhentosReais implements Desconto {

	private Desconto proximoDesconto;
	
	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getValor() > 500) {
			return orcamento.getValor() * 0.07;
		}
		else {
			if ( proximoDesconto == null ) {
				return 0;
			}
			else {
				return proximoDesconto.desconta(orcamento);
			}	
		}
	}
	
	public void setProximo(Desconto desconto) {
		this.proximoDesconto = desconto;
	}

}

