package State;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o recebe desconto extra!");

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o pode ser aprovado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o pode ser reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o pode ser finalizado!");

	}

}
