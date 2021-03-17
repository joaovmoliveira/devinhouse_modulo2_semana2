package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.models.Conta;
import br.com.devinhouse.banco.models.ContaCorrente;
import br.com.devinhouse.banco.models.ContaPoupanca;
import br.com.devinhouse.banco.models.Endereco;
import br.com.devinhouse.banco.models.Fatura;

public class MeuBanco {

	public static void main(String[] args) {

		Conta conta = new Conta("João", "Oliveira", "1", 50);

		System.out.println(conta);
		
		Conta c2 = (Conta) conta.clone();
		
		System.out.println(c2);
		
		System.out.println(c2==conta);

		/*
		 * Endereco end = new Endereco("Rua XPTO", "123", "", "88000-000"); Endereco
		 * address = new Endereco("Rua XPTO", "123", "", "88000-000");
		 * 
		 * System.out.println(end.equals(address));
		 */

		/*
		 * ContaCorrente cc = new ContaCorrente("João Victor", "Mendes", "1", 50, 100);
		 * 
		 * cc.imprimeSaldo();
		 */
	}

}
