/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
calcule e mostre a diferen�a do produto de A e B pelo produto de C e D 
segundo a f�rmula: DIFERENCA = (A * B - C * D). 

Exemplos:
Entrada: Sa�da:
5        DIFERENCA = -26  
6
7
8

Entrada: Sa�da:
5		 DIFERENCA = 86 
6
-7
8
*/

import java.util.Scanner;

public class Exerc03ProdutoMat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		diferenca = A * B - C * D;
		
		System.out.println("Diferenca = " + diferenca);
		
		sc.close();
		
	}

}

/*
  
import java.util.Scanner;

public class Exerc03ProdutoMat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();
	}
}
*/
