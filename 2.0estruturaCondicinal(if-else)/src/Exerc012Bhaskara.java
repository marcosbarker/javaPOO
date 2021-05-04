/*
Leia 3 valores de ponto flutuante e efetue o calculo das raizes da equacao
de bhaskara. Se nao for possivel calcular as raizes, mostre a mensagem 
correspondente "impossivel calcular", caso haja uma divisao por 0 ou raiz
de numero negativo.

Entrada:
Leia tres valores de ponto flutuante(double) A, B, C.

Saida:
Se não houver possibilidade de calcular as raizes, apresente a mensagem
"impossivel calcular". Caso contrario, imprima o resltado das raizes com 
5 digitos apos o ponto, com uma mensagem correspondente conforme exemplo 
abaixo. Imprima sempre o final de linha apos cada mensagem. 

Entrada:			Saida:
10.0  20.1  5.1     R1 = -0.29788 R2 = -1.71212

0.0  20.0   5.0     Impossivel calcular
*/

import java.util.Locale;
import java.util.Scanner;

public class Exerc012Bhaskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com valor de A: ");
		double a = sc.nextDouble();
		
		System.out.print("Entre com valor de B: ");
		double b = sc.nextDouble();
		
		System.out.print("Entre com valor de C: ");
		double c = sc.nextDouble();

		double delta = b * b - 4.0 * a * c;

		if (a == 0 || delta < 0.0) {
			System.out.println("Impossivel calcular");

		} else {
			double r1 = (- b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (- b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);

		}

		sc.close();

	}

}