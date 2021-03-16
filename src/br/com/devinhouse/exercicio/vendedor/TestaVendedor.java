package br.com.devinhouse.exercicio.vendedor;

import java.util.Scanner;

public class TestaVendedor {
	public static void main(String[] args) {
		VendedorComissionado vendedor1 = new VendedorComissionado();
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o sal�rio base:");
		double salarioBase = Double.parseDouble(sc.nextLine());

		System.out.println("Por favor digite a taxa de comiss�o");
		double taxaComissao = Double.parseDouble(sc.nextLine());

		vendedor1.setSalarioBase(salarioBase);

		while (!vendedor1.setTaxaDeComissao(taxaComissao)) {
			System.out.println("Por favor, digite um valor entre 0 e 1 para a taxa de comiss�o");
			taxaComissao = Double.parseDouble(sc.nextLine());
		}

		System.out.println("Qual a quantidade vendida no m�s?");
		int quantidadeVendida = Integer.parseInt(sc.nextLine());
		vendedor1.setValorVendidoNoMes(quantidadeVendida);

		System.out.println("O sal�rio do vendedor �: " + vendedor1.getSalarioBase());
		System.out.println("A taxa de comiss�o � de: " + vendedor1.getTaxaDeComissao());
		System.out.println("A quantidade vendida no m�s �: " + vendedor1.getValorVendidoNoMes());
		System.out.println("O sal�rio final �: " + vendedor1.getSalarioComissionado());
		sc.close();
	}
}
