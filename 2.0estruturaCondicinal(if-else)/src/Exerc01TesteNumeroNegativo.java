
/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

Exemplos:
Entrada:       Saída:
-10            NEGATIVO

Entrada:       Saída:
8              NAO NEGATIVO

Entrada:       Saída:
0              NAO NEGATIVO 
*/

import java.util.Scanner;

public class Exerc01TesteNumeroNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero para testar se e negativo: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negativo");

		} else {
			System.out.println("Não negativo");

		}

		sc.close();

	}

}