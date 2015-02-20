package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private List <ItemNotaFiscal> todosItens = new ArrayList<ItemNotaFiscal>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAsAcoesASeremExecutadas;
	
	
	public NotaFiscalBuilder() {
		data = Calendar.getInstance();
		this.todasAsAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	public NotaFiscalBuilder(List<AcaoAposGerarNota> acoes) {
		data = Calendar.getInstance();
		this.todasAsAcoesASeremExecutadas = acoes;
	}
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAsAcoesASeremExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	
	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder comItemNota(ItemNotaFiscal item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;		
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {		
		this.data = data;
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		for (AcaoAposGerarNota acao: todasAsAcoesASeremExecutadas)
			acao.executa(nf);
		
		return nf;
	}
}
