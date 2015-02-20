package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();
		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDao());
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);
		
	/*	builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDao());
		builder.adicionaAcao(new Multiplicador(3));
		builder.adicionaAcao(new Multiplicador(1.5));*/
		
		NotaFiscal nf = builder
		.paraEmpresa("Teste")
		.comCnpj("11.000.1111/0001-23")
		.comItemNota(new ItemNotaFiscal("Item 1", 100))
		.comObservacoes("Observações")
		.constroi();
		
		
		System.out.println(nf.getCnpj());
		System.out.println(nf.getRazaoSocial());
		System.out.println(nf.getValorTotal());
		
	}
}
