/*
Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem
dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
este valor se encontra. Obviamente se o valor n�o estiver em nenhum destes 
intervalos, dever� ser impressa a mensagem �Fora de intervalo�.

Exemplos:

Entrada:    Sa�da:
25.01       Intervalo (25,50]

Entrada:    Sa�da:
25.00       Intervalo [0,25]

Entrada:    Sa�da:
100.00      Intervalo (75,100]

Entrada:    Sa�da:
-25.02      Fora de intervalo
*/

import java.util.Locale;
import java.util.Scanner;

public class Exerc06IntervaloNumerico2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");

		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");

		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");

		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");

		} else {
			System.out.println("Intervalo (75,100]");

		}

		sc.close();
	}
}