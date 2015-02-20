package State;

public class EmAprovacao implements EstadoDeUmOrcamento {
	boolean descontoAplicado = false;
	
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		if ( descontoAplicado == false ) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já foi aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento em aprovação não pode ir diretamente para aprovado!");
		
	}
}
