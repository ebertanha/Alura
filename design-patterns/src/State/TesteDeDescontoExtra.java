package State;

public class TesteDeDescontoExtra {
	
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);
		
		System.out.println("Valor: " + reforma.getValor());
		
		reforma.AplicaDescontoExtra();
		
		System.out.println("Valor com desconto 1: " + reforma.getValor());
			
		
		reforma.aprova();
		
		reforma.AplicaDescontoExtra();
		
		System.out.println("Valor com desconto 2: " + reforma.getValor());
		
		reforma.AplicaDescontoExtra();
		
		System.out.println("Valor com desconto 2: " + reforma.getValor());
		
		reforma.finaliza();
		
		//reforma.aprova();
		
		//reforma.AplicaDescontoExtra();
	}
}
