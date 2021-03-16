package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.models.Conta;
import br.com.devinhouse.banco.models.ContaCorrente;
import br.com.devinhouse.banco.models.ContaPoupanca;
import br.com.devinhouse.banco.models.Fatura;

public class MeuBanco {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		System.out.println(conta.getSaldo());
		
		cc.depositar(100);
		cp.depositar(200);
		
		cc.setLimite(200);
		
		System.out.printf("Saldo da Conta Corrente: %.2f%n", cc.getSaldo());
		System.out.printf("Saldo da Conta Poupanca: %.2f%n", cp.getSaldo());

	}

}
