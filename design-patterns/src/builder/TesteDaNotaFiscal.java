package builder;

import java.util.Calendar;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		Calendar dataEmissao = Calendar.getInstance();
		dataEmissao.set(2014, 6, 1, 0, 0, 0);

		ItemNotaFiscal items = new ItemDaNotaBuilder()
		.comItem("Item 1")
		.comValor(100)
		.montar();
		
		NotaFiscal nota = new NotaFiscalBuilder()
		.paraEmpresa("Teste")
		.comCnpj("11.000.1111/0001-23")
		//Items da Notas
		.comItemNota(new ItemDaNotaBuilder()
		.comItem("Item 1")
		.comValor(100)
		.montar())
		.comItemNota(new ItemDaNotaBuilder()
		.comItem("Item 2")
		.comValor(200)
		.montar())
/*		.comItemNota(new ItemNotaFiscal("Item 1", 100))
		.comItemNota(new ItemNotaFiscal("Item 2", 200))
		.comItemNota(new ItemNotaFiscal("Item 3", 300))
		.comObservacoes("Observações")
*/		.naData(dataEmissao)
		.constroi();
		
//		NotaFiscal nota = builder.constroi();
		
		System.out.println(nota.getCnpj());
		System.out.println(nota.getRazaoSocial());
		System.out.println(nota.getDataDeEmissao().getTime());
		System.out.println(nota.getValorTotal());
		
	}
}
