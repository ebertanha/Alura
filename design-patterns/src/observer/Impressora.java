package observer;

public class Impressora implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei para a impressora");
		
	}

}
