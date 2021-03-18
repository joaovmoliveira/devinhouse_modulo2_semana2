package br.com.devinhouse.exercicio.vendedor;

public class VendedorComissionado extends Vendedor{
	private double taxaDeComissao;
	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}
	public boolean setTaxaDeComissao(double taxaDeComissao) {
		if (taxaDeComissao < 0 || taxaDeComissao > 1) {
			return false;
		}
		this.taxaDeComissao = taxaDeComissao;
		return true;
		
	}
	
	public double getSalarioComissionado() {
		return getSalarioBase() + (getTaxaDeComissao() * getValorVendidoNoMes());
	}
}