package State;

public class Aprovado implements
		EstadoDeUmOrcamento {
	boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		if ( ! isAplicado() ) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto j� foi aplicado!");
		}
	}

	 private boolean isAplicado() {
	        return this.descontoAplicado;
	    }

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento n�o pode ser aprovado novamente!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aprovado n�o pode ser reprovado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
