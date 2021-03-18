package br.com.devinhouse.exercicio.vendedor;

public class VendedorComissionado extends Vendedor{
    private double taxaDeComissao;
    public VendedorComissionado () {
    }
    public VendedorComissionado (String nome, String sobrenome, double salarioBase, double taxaDeComissao) {
        super(nome, sobrenome, salarioBase);
        if (taxaDeComissao < 0 || taxaDeComissao > 1) {
            this.taxaDeComissao = 0;
        }
        this.taxaDeComissao = taxaDeComissao;
    }
    @Override
    public double getSalario() {
        return (getSalarioBase() + (this.taxaDeComissao * this.getValorVendidoNoMes()));
    }
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
    @Override
    public String toString () {
        return (super.toString() + " e é vendedor comissionado, com uma taxa de comissão de " + this.taxaDeComissao);
    }
}