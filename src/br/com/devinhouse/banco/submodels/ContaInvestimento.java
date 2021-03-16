package br.com.devinhouse.banco.submodels;

import br.com.devinhouse.banco.models.Conta;

public class ContaInvestimento extends Conta {

	public double novoGetSaldo() {
		return this.saldo;
	}
}
