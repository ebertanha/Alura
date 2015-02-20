package State;

public class Positivo implements EstadoConta {

	@Override
	public void saque(Conta conta) {
		double novoSaldo = conta.getSaldo();
		
		novoSaldo -= conta.getValorTransacao();
					
		conta.setSaldo(novoSaldo);
		
		if ( novoSaldo < 0 ) {
			conta.estado = new Negativo();
		}
	}

	@Override
	public void deposito(Conta conta) {
		double novoSaldo = conta.getSaldo();
		
		novoSaldo += conta.getValorTransacao()  * 0.98;
		
		conta.setSaldo(novoSaldo);
	}

}
