package Decorator;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);		
	}
	
	public ICMS() {};
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculaOutroImposto(orcamento);
	}
}
