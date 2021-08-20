/*
Fazer um programa para ler as duas notas que um aluno obtece no primeiro e
sgundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o 
aluno obteve no ano juntamente com um texto explicativo. Caso a nota final
do aluno seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos.
Todos os valores devem ter uma casa decimal.
Exemplos:

Entrada:  Saida:
45.5      Nota Final = 76.8
31.3

Entrada:  Saida;
34.0      Nota final = 57.5
23.5      REPROVADO 
 */

import java.util.Scanner;

public class Exerc02LerCoordenadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a coordenada X: ");
		float x = sc.nextFloat();

		System.out.print("Entre com a coordenada Y:");
		float y = sc.nextFloat();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primerio quadrante");

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");

			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");

			} else {
				System.out.println("Quarto quadrante");
			}

			x = sc.nextFloat();
			y = sc.nextFloat();
		}

		sc.close();
	}
}