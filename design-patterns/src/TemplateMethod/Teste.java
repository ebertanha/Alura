package TemplateMethod;

public class Teste {
	
	public static void main(String[] args) {
//		Imposto ICPP = new ICPP();
//		Imposto IKCV = new IKCV();
		Imposto IHIT = new IHIT();
	
		Orcamento orcamento = new Orcamento(500);
		Item item1 = new Item("caneta",10);
		Item item2 = new Item("lapis",10);
		Item item3 = new Item("borracha",4);
		Item item4 = new Item("regua",8);
		Item item5 = new Item("caneta",1);
		
		orcamento.adicionaItem(item1);
		orcamento.adicionaItem(item2);
		orcamento.adicionaItem(item3);
		orcamento.adicionaItem(item4);
		orcamento.adicionaItem(item5);
		
//		System.out.println(ICPP.calcula(orcamento));
//		System.out.println(IKCV.calcula(orcamento));
		System.out.println(IHIT.calcula(orcamento));

	}

}
