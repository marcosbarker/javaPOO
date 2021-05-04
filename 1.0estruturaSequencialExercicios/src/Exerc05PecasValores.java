/*
Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de 
pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

Exemplos:
Entrada:   Sa�da:
12 1 5.30  VALOR A PAGAR: R$ 15.50
16 2 5.10

Entrada:   Sa�da:
13 2 15.30 VALOR A PAGAR: R$ 51.40
161 4 5.20

Entrada:   Sa�da:
1 1 15.10  VALOR A PAGAR: R$ 30.20
2 1 15.10

*/

import java.util.Scanner;

public class Exerc05PecasValores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		@SuppressWarnings("unused")
		int cod1, cod2, numPecas1, numPecas2;
		double valorPeca1, valorPeca2, calc;
				
		cod1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		cod2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		calc = (numPecas1 * valorPeca1) + (numPecas2 * valorPeca2);
		
		System.out.printf("Valor a pagar: R$ %.2f%n",calc);

		sc.close();
	}

}


/*

import java.util.Locale;
import java.util.Scanner;

public class Exerc05PecasValores {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qte1, qte2;
	    double preco1, preco2, total;

	    cod1 = sc.nextInt();
	    qte1 = sc.nextInt();
	    preco1 = sc.nextDouble();
	    
	    cod2 = sc.nextInt();
	    qte2 = sc.nextInt();
	    preco2 = sc.nextDouble();

	    total = preco1 * qte1 + preco2 * qte2;

	    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}

*/
