package observer;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorTotal;
	private double impostos;
	public List<ItemNotaFiscal> itens;
	public String observacoes;
	
	public NotaFiscal(String razaoSocial, String cnpj, Calendar dataDeEmissao,
			double valorTotal, double impostos, List<ItemNotaFiscal> itens,
			String observacoes) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataDeEmissao = dataDeEmissao;
		this.valorTotal = valorTotal;
		this.impostos = impostos;
		this.itens = itens;
		this.observacoes = observacoes;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Calendar getDataDeEmissao() {
		return dataDeEmissao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public double getImpostos() {
		return impostos;
	}

	public List<ItemNotaFiscal> getItens() {
		return itens;
	}

	public String getObservacoes() {
		return observacoes;
	}
	
	
}
