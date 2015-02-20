package TemplateMethod;

import java.util.Date;

public class RelatorioCorrentistas extends TemplateRelatorio {

		public RelatorioCorrentistas(String tipoRelatorio) {
			setTipoRelatorio(tipoRelatorio);
		}
		
		@Override
		public void imprimeCabecalho(String cabecalho) {
			System.out.println(cabecalho);		
		}

		@Override
		public void imprimeCorpo(String corpo) {
			System.out.println(corpo);
		}

		@Override
		public void imprimeRodape(String rodape) {
			System.out.println(rodape);		
		}

		@Override
		protected void imprimeCompleto(Conta conta) {
			String cabecalho;
			String corpo;
			String rodape;
			Date data = new Date();
			
			cabecalho = conta.getBanco() + " - " + conta.getEndereco() + " - " + conta.getTelefone() + "\n";
			corpo = "Titular: " + conta.getTitular() + " - agência: " + conta.getAgencia() + " - conta: " + conta.getConta() + " - Saldo: " + conta.getSaldo() + "\n";
			rodape = conta.getEmail() + " - " + data;
						
			imprimeCabecalho(cabecalho);
			imprimeCorpo(corpo);
			imprimeRodape(rodape);			
		}

		@Override
		protected void imprimeSimples(Conta conta) {
			String cabecalho;
			String corpo;
			String rodape;
			
			cabecalho = conta.getBanco() + " - " + conta.getTelefone() + "\n";
			corpo = "Titular: " + conta.getTitular() + " - Saldo: " + conta.getSaldo() + "\n";
			rodape = conta.getBanco() + " - " + conta.getTelefone();
						
			imprimeCabecalho(cabecalho);
			imprimeCorpo(corpo);
			imprimeRodape(rodape);
			
		}
	
}
