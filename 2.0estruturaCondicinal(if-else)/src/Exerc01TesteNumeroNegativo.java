
/*
Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

Exemplos:
Entrada:       Sa�da:
-10            NEGATIVO

Entrada:       Sa�da:
8              NAO NEGATIVO

Entrada:       Sa�da:
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
			System.out.println("N�o negativo");

		}

		sc.close();

	}

}