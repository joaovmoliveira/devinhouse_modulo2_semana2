package br.com.devinhouse.exercicio.vendedor;

public class Vendedor {
	private String nome;
	private String sobreNome;
	private double valorVendidoNoMes;
	protected double salarioBase;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public double getValorVendidoNoMes() {
		return valorVendidoNoMes;
	}
	
	public void setValorVendidoNoMes(double valorVendidoNoMes) {
		this.valorVendidoNoMes = valorVendidoNoMes;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}