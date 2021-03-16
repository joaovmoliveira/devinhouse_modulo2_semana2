package br.com.devinhouse.banco.models;

public class ContaCorrente extends Conta {
	private double limite;
	
	public double getLimite() {
		return this.limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double getSaldoComLimite() {
		return this.limite + this.saldo;
	}

}
