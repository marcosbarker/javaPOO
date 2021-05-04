import java.util.Scanner;

public class Exerc04DuracaoJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a hora inicial: ");
		double hi = sc.nextDouble();

		System.out.print("Entre com a hora final: ");
		double hf = sc.nextDouble();

		double duracaoJogo;

		if (hi < hf) {
			duracaoJogo = hf - hi;

		} else {
			duracaoJogo = 24 - hi + hf;

		}

		System.out.println("O jogo durou " + duracaoJogo + " hora(s)");

		sc.close();
	}

}