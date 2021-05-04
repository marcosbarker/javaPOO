/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
Exemplos:

Entrada:   Saída:
12         PAR

Entrada:   Saída:
-27        IMPAR

Entrada:   Saída:
0          PAR 
*/

import java.util.Scanner;

public class Exerc02ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero para saber se e par ou impar: ");
		int num = sc.nextInt();

		if (num % 2 == 1) {
			System.out.println("O numero e par");

		} else {
			System.out.println("O numero e impar");

		}

		sc.close();

	}

}