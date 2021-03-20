package br.com.devinhouse.reforco.corridapolimorfismo;

public class Guepardo extends Animal {
	private static final int VELOCIDADE_KMH = 130;

	@Override
	public void mover(int segundos) {
		this.somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);

		System.out.printf("O guepardo correu %.1f metros.%n", this.getMetrosPercorridos());
	}
}
