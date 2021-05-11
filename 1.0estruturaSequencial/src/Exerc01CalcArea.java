/*
Fazer um programa para ler as medidas da largura e comprimento
de um terreno retangular com uma casa decimal, bem como o valor
do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o calo da �rea do terreno, bem como o valor
do pre�o do terreno, ambos com duas casas decimais, conforme exemplo.

Entrada:     Saida:
10.0         Area = 300.00  
30.0         Preco = 60000.00
200.00
 */

import java.util.Locale;
import java.util.Scanner;

public class Exerc01CalcArea {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco =  %.2f%n", preco);
		
		
		
		sc.close();

	}

}
