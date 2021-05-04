/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a
quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Exemplos:
Entrada:    Saída:
3 2         Total: R$ 10.00

Entrada:    Saída:
2 3         Total: R$ 13.50
*/

import java.util.Scanner;

public class Exerc05QuantidadeItem2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("1-Cachorro Quente R$ 4.00%n2-X-Salara R$ 4.50%n"
				+ "3-X-BaconR$ 5.00%n4-Torrada Simples R$ 2.00%n5-Refrigerante R$ 1.50%n%n");

		System.out.print("Entre com o codigo do produto: ");
		int code = sc.nextInt();

		System.out.print("Entre com a quantidade: ");
		int quantidade = sc.nextInt();

		double total;

		if (code == 1) {
			total = quantidade * 4.0;

		} else if (code == 2) {
			total = quantidade * 4.5;

		} else if (code == 3) {
			total = quantidade * 5.0;

		} else if (code == 4) {
			total = quantidade * 2.0;

		} else {
			total = quantidade * 1.5;

		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

}