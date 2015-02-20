package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return ( orcamento.getValor() * 0.13 ) + 100;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * ( 0.01 * orcamento.getItems().size() );
	}

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		
		if ( temItemDuplicado(orcamento) ) {
			return true;
		}
		
		return false;
	}

/*	protected boolean temItemDuplicado(Orcamento orcamento) {		
		List <Item> lista = orcamento.getItems();
		
		for ( Item item : lista ) {
			int contador = 0;
			
			//pega um item e percorre a lista novamente e conta as ocorrencias
			for ( Item pesqItem : lista ) {
				
				if ( item.getNome().equals(pesqItem.getNome()) ) {
					contador++;
				}
			}
				
			//verifica se existe mais de 1 ocorrencia
			if ( contador > 1 ) {
				return true;
			}
				
		}
		return false;
	}*/
	
	protected boolean temItemDuplicado(Orcamento orcamento) {
    List<String> noOrcamento = new ArrayList<String>();

    for(Item item : orcamento.getItems()) {
      if(noOrcamento.contains(item.getNome())) return true;
      else noOrcamento.add(item.getNome());     
    }
    
    return false;
	}
}
