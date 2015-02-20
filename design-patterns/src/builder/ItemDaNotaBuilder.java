package builder;

public class ItemDaNotaBuilder {
	
	private String nome;
	private double valor;

	public ItemDaNotaBuilder comItem(String nome) {
		this.nome = nome;
		return this;
	}
	
	public ItemDaNotaBuilder comValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public ItemNotaFiscal montar() {
		return new ItemNotaFiscal(nome, valor);
	}
}
