package TemplateMethod;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta;
		RelatorioCorrentistas rel = new RelatorioCorrentistas("SIMPLES");
		
		conta = new Conta("1234","11111-5","JOAO",1000);

		rel.imprime(conta);
		
	}

}
