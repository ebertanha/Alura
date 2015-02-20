package Decorator;

import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenor100Reais extends Filtro {

	public FiltroSaldoMenor100Reais(Filtro proximoFiltro) {
		super(proximoFiltro);
	}
	
	public FiltroSaldoMenor100Reais() {};
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> suspeitos = new ArrayList<Conta>();
		
		for (Conta umaConta : contas ) {
			if ( umaConta.getSaldo() < 100 ) {
				suspeitos.add(umaConta);
			}
		}
			
		//Comp�e o pr�ximo filtro	
		if ( outroFiltro != null)
			suspeitos.addAll(proximaFiltragem(contas));
		
		return suspeitos;
	}

}
