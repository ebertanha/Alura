package State;

public class Negativo implements EstadoConta {

	@Override
	public void saque(Conta conta) {
		throw new RuntimeException("Não é permitido saques em contas negativas!");
	}

	@Override
	public void deposito(Conta conta) {
		double novoSaldo = conta.getSaldo();
		
		novoSaldo += conta.getValorTransacao() * 0.95;
		
		conta.setSaldo(novoSaldo);
		
		if ( novoSaldo >= 0 ) {
			conta.estado = new Positivo();
		}
	}

}