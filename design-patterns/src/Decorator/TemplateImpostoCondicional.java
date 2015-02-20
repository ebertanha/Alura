package Decorator;

public abstract class TemplateImpostoCondicional extends Imposto {

	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostoCondicional() {};
	
	
	@Override
	public double calcula(Orcamento orcamento) {
		
		if ( deveUsarTaxacaoMaxima(orcamento) ) {
			return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);			
		}
	}

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);

	
}
