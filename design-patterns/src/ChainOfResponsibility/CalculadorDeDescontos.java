package ChainOfResponsibility;

public class CalculadorDeDescontos {
	
	public double calcula(Orcamento orcamento) {
		Desconto d1 = new DescontoPorMaisCincoItens();
		Desconto d2 = new DescontoPorMaisQuinhentosReais();
//		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(null);
		
		return d1.desconta(orcamento);
	}
	
}
