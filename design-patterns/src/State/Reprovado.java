package State;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não recebe desconto extra!");

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser aprovado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento não pode ser reprovado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
