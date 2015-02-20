package State;

public class TesteConta {
	
	public static void main(String[] args) {
		Conta conta = new Conta("123","5555-1","JOAO",100.0);
		
		System.out.println("Valor saldo inicial: " + conta.getSaldo());
		
		conta.saque(conta, 10);
		
		System.out.println("Valor saque 1: " + conta.getSaldo());

		conta.saque(conta, 100);
		
		System.out.println("Valor saque 2: " + conta.getSaldo());

		conta.deposito(conta, 100);
		
		System.out.println("Valor deposito 1: " + conta.getSaldo());

		conta.saque(conta, 10);
		
		System.out.println("Valor saque 3: " + conta.getSaldo());		
		
	}
}
