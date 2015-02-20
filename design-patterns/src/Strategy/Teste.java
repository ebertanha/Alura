package Strategy;

public class Teste {
	
	public static void main(String[] args) {
		Imposto ICMS = new ICMS();
		Imposto ISS = new ISS();
	
		Orcamento orcamento = new Orcamento(500);
	
		CalculadorDeImpostos ci = new CalculadorDeImpostos();
		ci.calculadoraDeImpostos(orcamento, ICMS);
		ci.calculadoraDeImpostos(orcamento, ISS);
	}

}
