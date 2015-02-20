package builder;

public class ItemNotaFiscal {
	private String nome;
	private double valor;
	
	public ItemNotaFiscal(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	
}
