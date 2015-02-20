package Decorator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class TesteFiltro {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		
		Conta c1 = new Conta("1111","9999-1","JOAO",dt.parse("30/03/2013"),1);
		Conta c2 = new Conta("1111","8887-1","MARIA",dt.parse("11/10/1987"),2);
		Conta c3 = new Conta("1111","7778-1","LUCAS",dt.parse("15/04/1970"),500000);
		Conta c4 = new Conta("1111","5555-3","CARLOS",dt.parse("01/04/2014"),101);
		
		List<Conta> listaContas = new ArrayList<Conta>();
		List<Conta> listaSuspeitos = new ArrayList<Conta>();
		
		//Adicionar as contas
		listaContas.add(c1);
		listaContas.add(c2);
		listaContas.add(c3);
		listaContas.add(c4);

		Filtro f = new FiltroSaldoMenor100Reais( new FiltroSaldoMaior500KReais( new FiltroDataAberturaMesCorrente() ) );

		//Filtro f = new FiltroSaldoMenor100Reais( new FiltroSaldoMaior500KReais() );
//		Filtro f = new FiltroSaldoMenor100Reais();
		listaSuspeitos = f.filtra(listaContas);
		
		//Percorre a lista de suspeitos
		for (Conta umaConta : listaSuspeitos) {
			System.out.println("Agencia => " + umaConta.getAgencia());
			System.out.println("Conta => " + umaConta.getConta());
			System.out.println("Titular => " + umaConta.getTitular());
			System.out.println("Saldo => " + umaConta.getSaldo());
			System.out.println("--------------------");
		}
	}

}
