package br.com.devinhouse.reforco.corrida;

public class FalcaoPeregrino {
	private static final int VELOCIDADE_KMH = 390;
	private double metrosPercorridos;
	
	public FalcaoPeregrino() {
		this.metrosPercorridos = 0;
	}
	
	public void mover(int segundos) {
		if (segundos > 0) {
			this.metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
			System.out.printf("O falcão voou %.1f metros.%n", this.metrosPercorridos);
		}
	}
}
