package TemplateMethod;

public class CalculadorDeImpostos {

	public void calculadoraDeImpostos(Orcamento orcamento, Imposto impostoQualquer) {
		System.out.println(impostoQualquer.calcula(orcamento));
	}
}
