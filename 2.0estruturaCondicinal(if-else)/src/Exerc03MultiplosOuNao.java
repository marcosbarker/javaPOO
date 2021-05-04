/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem 
"Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o 
m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.
Exemplos:

Entrada:   Sa�da:
6 24       Sao Multiplos

Entrada:   Sa�da:
6 25       Nao sao Multiplos

Entrada:   Sa�da:
24 6       Sao Multiplos
*/

import java.util.Scanner;

public class Exerc03MultiplosOuNao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro numero: ");
		int num1 = sc.nextInt();

		System.out.print("Entre com o segundo numero: ");
		int num2 = sc.nextInt();

		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao multiplos");

		} else {
			System.out.println("Nao sao multiplos");

		}

		sc.close();
	}

}