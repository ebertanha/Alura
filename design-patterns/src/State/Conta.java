package State;

public class Conta {

	//dados do banco
	private final String banco = "SANTANDER";
	private final String telefone= "11 555-55555";
	private final String endereco = "Rua Lavapes, 1313 - Jundiai-SP";
	private final String email = "falecom@santander.com.br";
			
	//dados do titular
	private String titular;
	private String agencia;
	private String conta;
	private double saldo;
	private double valorTransacao;
	protected EstadoConta estado = new Positivo();
	
	public Conta(String agencia, String conta, String titular, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getBanco() {
		return banco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getEmail() {
		return email;
	}

	public double getValorTransacao() {
		return valorTransacao;
	}

	public void setValorTransacao(double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	
	public void saque(Conta conta, double valor) {
		setValorTransacao(valor);
		estado.saque(this);
	}
	
	public void deposito(Conta conta, double valor) {
		setValorTransacao(valor);
		estado.deposito(this);
	}
	
}
