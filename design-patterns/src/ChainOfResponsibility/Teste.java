package ChainOfResponsibility;

public class Teste {

	public static void main(String args[]) {
		Orcamento orcamento = new Orcamento(100);
		
		orcamento.adicionaItem(new Item("lapis",10));
		orcamento.adicionaItem(new Item("caneta",20));
		orcamento.adicionaItem(new Item("borracha",10));
		orcamento.adicionaItem(new Item("regua",10));
//		orcamento.adicionaItem(new Item("caderno",15));
//		orcamento.adicionaItem(new Item("cartolina",2));
		
		CalculadorDeDescontos cd = new CalculadorDeDescontos();

		System.out.println("Desconto => " + cd.calcula(orcamento));
	}
}
