package Decorator;

public class IKCV extends TemplateImpostoCondicional {

	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public IKCV() {};
	
	@Override
	public double maximaTaxacao(Orcamento orcamento) {		
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		for ( Item item : orcamento.getItems() ) {
			if ( item.getValor() > 100 && orcamento.getValor() > 500 ) return true;
		}
		return false;
	}
		
}
