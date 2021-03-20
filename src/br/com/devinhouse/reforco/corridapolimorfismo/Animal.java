package br.com.devinhouse.reforco.corridapolimorfismo;

public class Animal {
	private double metrosPercorridos = 0;
	
	public void somaMetrosPercorridos(double metros) {
		this.metrosPercorridos += metros;
	}
	
	public double getMetrosPercorridos() {
		return this.metrosPercorridos;
	}
	
	public void mover(int segundos) {}
}
