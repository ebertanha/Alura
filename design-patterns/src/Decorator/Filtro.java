package Decorator;

import java.util.List;

public abstract class Filtro {
	
	protected Filtro outroFiltro;
	
	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}
	
	public Filtro() {};
	
	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximaFiltragem(List<Conta> contas) {
		if ( outroFiltro == null ) return null;
		return outroFiltro.filtra(contas);
	}
}
