package Decorator;

public class TestesdeImpostosComplexos {
	public static void main(String[] args) {
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto icpp = new ICPP();
		Imposto icmsComIss = new ICMS(new ISS());
		Imposto icppComIcmsComIss = new ICPP(new ICMS(new ISS()));
		
		Orcamento orc = new Orcamento(1000);
		
		double valor = icms.calcula(orc);
		
		System.out.println("ICMS => " + valor);
		
		valor = iss.calcula(orc);
		
		System.out.println("ISS => " + valor);
		
		valor = icmsComIss.calcula(orc);
		
		System.out.println("ICMS com ISS => " +valor);
		
		valor = icpp.calcula(orc);
		
		System.out.println("ICPP => " +valor);
		
		valor = icppComIcmsComIss.calcula(orc);
		
		System.out.println("ICPP com ICMS com ISS => " +valor);
		
	}

}
