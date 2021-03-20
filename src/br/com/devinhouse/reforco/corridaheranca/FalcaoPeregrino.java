package br.com.devinhouse.reforco.corridaheranca;

public class FalcaoPeregrino extends Animal {
	private static final int VELOCIDADE_KMH = 390;
	
	public void mover(int segundos) {
		if (segundos > 0) {
			this.somaMetrosPercorridos(VELOCIDADE_KMH * 1000 / 3600 * segundos);
			
			System.out.printf("O falcão voou %.1f metros.%n", this.getMetrosPercorridos());
		}
	}
}
