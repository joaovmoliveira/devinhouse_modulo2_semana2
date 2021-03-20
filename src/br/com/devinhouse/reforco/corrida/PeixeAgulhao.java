package br.com.devinhouse.reforco.corrida;

public class PeixeAgulhao {
	private static final int VELOCIDADE_KMH = 115;
	private double metrosPercorridos = 0;
	
	public void mover(int segundos) {
		if (segundos > 0) {
			this.metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
			System.out.printf("O peixe nadou %.1f metros.%n", this.metrosPercorridos);
		}
	}
}
