package br.com.devinhouse.banco.models;

public class ContaCorrente extends Conta {
	private double limite;
	
	public ContaCorrente() {
		super("", "", "");
	}
	
	public ContaCorrente(String nome, String sobrenome, String cpf, 
			double saldo, double limite) {
		super(nome, sobrenome, cpf, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public double getSaldo() {
		return super.getSaldo() + this.limite;
	}
	
	@Override
	public void imprimeSaldo() {
		super.imprimeSaldo();
		System.out.printf("E possui R$ %.2f de limite.", this.limite);
	}

}
