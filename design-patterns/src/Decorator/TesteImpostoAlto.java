package Decorator;

public class TesteImpostoAlto {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto();
		Imposto icmsComImpostoMuitoAlto = new ICMS(new ImpostoMuitoAlto());
		
		Orcamento orc = new Orcamento(1000);
		
		double valor = icms.calcula(orc);
		
		System.out.println("ICMS => " + valor);
		
		valor = impostoMuitoAlto.calcula(orc);
		
		System.out.println("Imposto Muito Alto => " + valor);
			
		valor = icmsComImpostoMuitoAlto.calcula(orc);
		
		System.out.println("ICMS com Imposto Muito Alto => " +valor);
		
	}
}
