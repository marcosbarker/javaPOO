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

import java.util.Locale;
import java.util.Scanner;

public class Exerc011NotaAlunoFinal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com a nota 1: ");
		double nota1 = sc.nextDouble();

		System.out.print("Entre com a nota 2: ");
		double nota2 = sc.nextDouble();

		double notaFinal = nota1 + nota2;
		System.out.printf("Nota final = %.1f%n", notaFinal);

		if (notaFinal < 60.0) {
			System.out.println("Reprovado");

		}

		sc.close();

	}

}