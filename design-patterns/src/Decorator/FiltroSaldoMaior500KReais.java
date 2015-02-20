package Decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMaior500KReais extends Filtro {
	
	public FiltroSaldoMaior500KReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMaior500KReais(){};

	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> suspeitos = new ArrayList<Conta>();
		
		for (Conta umaConta : contas ) {		
			if ( umaConta.getSaldo() > 500000 ) {
				suspeitos.add(umaConta);
			}
		}
		
		//Compõe o próximo filtro
		if ( outroFiltro != null)
			suspeitos.addAll(proximaFiltragem(contas));
					
		return suspeitos;
	}
}
