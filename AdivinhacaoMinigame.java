import java.util.Scanner;
import java.util.Random;
import java.io.PrintStream;

public class Minigame {

	static void explicacao() {
		System.out.println("OBAH!");
		System.out.println("O jogo é assim...");
		System.out.println("Eu vou escolher um número aleatório de 0 a 10.");
		System.out.println("Você terá que adivinhar o número que eu escolhi. Se acertar...");
		System.out.println("Você será o vencedor!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random gerador = new Random();
		PrintStream syso = System.out;

		syso.println("Olá, qual o seu nome?");
		String nome = sc.nextLine();

		syso.println("Prazer " + nome + ", você quer brincar comigo?");
		syso.println("1 - Sim");
		syso.println("2 - Não");

		while (true) {

			int opcao = sc.nextInt();
			if (opcao == 1) {

				explicacao();

				int numeroComputador = gerador.nextInt(11);

				syso.println("Prontinho " + nome + ", já escolhi! Adivinhe...");

				int numeroUsuario;
				do {
					numeroUsuario = sc.nextInt();

					if (numeroUsuario != numeroComputador) {
						syso.println("Resposta errada! Tente novamente...");
					} else {
						if (numeroUsuario == numeroComputador) {
							syso.println("Parabéns " + nome + "! Você acertou!");
						}
					}
				} while (numeroUsuario != numeroComputador);
				break;

			} else {
				if (opcao == 2) {
					syso.println("Que pena! Mas tudo bem, até a próxima.");
					break;
				} else {
					syso.println("Escolha uma opção existente.");
				}
			}
		}
	}
}
