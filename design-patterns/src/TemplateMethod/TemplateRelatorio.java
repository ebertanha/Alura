package TemplateMethod;

public abstract class TemplateRelatorio implements Relatorio {
	private String tipoRelatorio;
	
	public void setTipoRelatorio(String tipoRelatorio) {
		this.tipoRelatorio = tipoRelatorio;
	}

	public String getTipoRelatorio() {
		return tipoRelatorio;
	}

	public void imprime(Conta conta) {		
		
		if ( tipoRelatorio.equals("COMPLETO") ) {
			imprimeCompleto(conta);
		} else if ( tipoRelatorio.equals("SIMPLES") ) {
			imprimeSimples(conta);
		}
	}
		
	protected abstract void imprimeCompleto(Conta conta);

	protected abstract void imprimeSimples(Conta conta);
	
	
}
