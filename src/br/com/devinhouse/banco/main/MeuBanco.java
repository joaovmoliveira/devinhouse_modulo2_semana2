package br.com.devinhouse.banco.main;

import br.com.devinhouse.banco.models.Conta;
import br.com.devinhouse.banco.models.ContaCorrente;
import br.com.devinhouse.banco.models.ContaPoupanca;
import br.com.devinhouse.banco.models.Endereco;
import br.com.devinhouse.banco.models.Fatura;
import br.com.devinhouse.faculdade.gastos.Funcionario;
import br.com.devinhouse.faculdade.gastos.GeradorRelatorio;
import br.com.devinhouse.faculdade.gastos.Professor;
import br.com.devinhouse.faculdade.gastos.Reitor;

public class MeuBanco {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente("J", "", "", 50, 50);
		
		Conta conta = cc;
		
		conta.getSaldo();
		
		Funcionario func = new Funcionario();
		func.setNome("Rosana");
		func.setSalario(2000);
		
		Professor prof = new Professor();
		prof.setNome("Michael");
		prof.setSalario(2000);
		prof.setHorasDeAula(50);
		
		Reitor reitor = new Reitor();
		reitor.setNome("Cristian");
		reitor.setSalario(5000);

		GeradorRelatorio.adiciona(func);
		GeradorRelatorio.adiciona(prof);
		GeradorRelatorio.adiciona(reitor);
	}

}
