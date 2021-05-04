
/*
Fazer um programa para ler tres numeros inteiros. Em seguida, mostrar
qual o menor dentre os tres numeros lidos. Em caso de empate, mostrar apenas
uma vez.
Exemplos:

Entrada:  Saida:
7 3 8     Menor = 3

5 12 5    Menor = 5

9 9 9     Menor = 9
*/

import java.util.Scanner;

public class Exerc013MenorDosNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o 1ª nuemro: ");
		int a = sc.nextInt();

		System.out.print("Entre com o 2ª nuemro: ");
		int b = sc.nextInt();

		System.out.print("Entre com o 3ª nuemro: ");
		int c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("Menor = " + a);

		} else if (b < c) {
			System.out.println("Menor = " + b);

		} else {
			System.out.println("Menor = " + c);

		}

		sc.close();

	}

}