package Decorator;

public class ICPP extends TemplateImpostoCondicional {

	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICPP() {};
	
	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		if ( orcamento.getValor() >= 500 ) {
			return true;
		}
		return false;
	}

}
