package br.com.devinhouse.reforco.corrida;

public class Guepardo {
	private static final int VELOCIDADE_KMH = 130;
	private double metrosPercorridos = 0;
	
	public void mover(int segundos) {
		if (segundos > 0) {
			this.metrosPercorridos += VELOCIDADE_KMH * 1000 / 3600 * segundos;
			System.out.printf("O guepardo percorreu %.1f metros.%n", this.metrosPercorridos);
		}
	}

}
