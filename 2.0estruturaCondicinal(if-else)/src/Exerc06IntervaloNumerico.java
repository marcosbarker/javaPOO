/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
este valor se encontra. Obviamente se o valor não estiver em nenhum destes 
intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

Exemplos:

Entrada:    Saída:
25.01       Intervalo (25,50]

Entrada:    Saída:
25.00       Intervalo [0,25]

Entrada:    Saída:
100.00      Intervalo (75,100]

Entrada:    Saída:
-25.02      Fora de intervalo
*/

import java.util.Locale;
import java.util.Scanner;

public class Exerc06IntervaloNumerico {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com um numero: ");
		double num = sc.nextDouble();

		if (num >= 0 && num <= 25) {
			System.out.println("Intervalo [0,25]");

		} else if (num > 25 && num <= 50) {
			System.out.println("Intervalo [25,50]");

		} else if (num > 50 && num <= 75) {
			System.out.println("Intervalo [50,75]");

		} else if (num > 75 && num <= 100) {
			System.out.println("Intervalo [75,100]");

		} else {
			System.out.println("Fora de intervalo");

		}

		sc.close();

	}

}