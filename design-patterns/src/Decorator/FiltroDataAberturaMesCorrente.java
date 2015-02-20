package Decorator;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FiltroDataAberturaMesCorrente extends Filtro {

	public FiltroDataAberturaMesCorrente(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroDataAberturaMesCorrente() {};
	
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		SimpleDateFormat dt = new SimpleDateFormat("MM/yyyy");
		Date dataCorrente = new Date();
		List<Conta> suspeitos = new ArrayList<Conta>();
		
		for (Conta umaConta : contas ) {
			if ( dt.format(umaConta.getDataAbertura()).equals(dt.format(dataCorrente)) ) {
				suspeitos.add(umaConta);
			}
		}
			
		//Compõe o próximo filtro	
		if ( outroFiltro != null)
			suspeitos.addAll(proximaFiltragem(contas));
		
		return suspeitos;
	}

}
