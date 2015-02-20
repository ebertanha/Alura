package TemplateMethod;

public interface Relatorio {

	void imprimeCabecalho(String cabecalho);
	
	void imprimeCorpo(String corpo);
	
	void imprimeRodape(String rodape);
}
