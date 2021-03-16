package br.com.devinhouse.banco.models;


public class Conta {
	private Cliente titular;
	protected double saldo;
	private boolean ativa;
	
	public Conta() {
		
	}
	
	public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		this.titular = new Cliente(nomeTitular, sobrenomeTitular, cpfTitular);
	}
	
	public Conta(String nomeTitular, String sobrenomeTitular, 
			String cpfTitular, double saldoInicial) {
		this(nomeTitular, sobrenomeTitular, cpfTitular);
		this.saldo = saldoInicial;
	}
	
	public boolean depositar(double valor) {
		if (valor <= 0) {
			return false;
		}
		this.saldo += valor;
		System.out.printf("Valor de %.2f depositado com sucesso!%n", valor);
		return true;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(Conta destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;		
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public boolean isAtiva() {
		return this.ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}	
	
}
