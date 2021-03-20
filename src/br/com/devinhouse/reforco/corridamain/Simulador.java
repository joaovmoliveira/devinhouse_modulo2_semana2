package br.com.devinhouse.reforco.corridamain;

/*import br.com.devinhouse.reforco.corridaheranca.FalcaoPeregrino;
import br.com.devinhouse.reforco.corridaheranca.Guepardo;
import br.com.devinhouse.reforco.corridaheranca.PeixeAgulhao;*/
import br.com.devinhouse.reforco.corridapolimorfismo.Animal;
import br.com.devinhouse.reforco.corridapolimorfismo.FalcaoPeregrino;
import br.com.devinhouse.reforco.corridapolimorfismo.Guepardo;
import br.com.devinhouse.reforco.corridapolimorfismo.PeixeAgulhao;

public class Simulador {
	private static final int DURACAO = 60;
	private static final int INTERVALO = 5;

	public static void main(String[] args) {
		System.out.println("Iniciado o Simulador de corrida de animais.");

		FalcaoPeregrino falcao = new FalcaoPeregrino();
		Guepardo guepardo = new Guepardo();
		PeixeAgulhao peixe = new PeixeAgulhao();

		for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {
			falcao.mover(INTERVALO);
			guepardo.mover(INTERVALO);
			peixe.mover(INTERVALO);

			System.out.println("Fim do primeiro intervalo.");
		}

		Animal[] animais = new Animal[3];
		animais[0] = new FalcaoPeregrino();
		animais[1] = new Guepardo();
		animais[2] = new PeixeAgulhao();

		for (int t = INTERVALO; t <= DURACAO; t += INTERVALO) {

			for (Animal animal : animais) {
				animal.mover(INTERVALO);
			}

			System.out.println("Fim do intervalo.");
		}

	}

}
