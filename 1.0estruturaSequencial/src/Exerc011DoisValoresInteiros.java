/*
Faça um programa para ler dois valores inteiros, e depois mostrar na 
tela a soma desses números com uma mensagem explicativa, conforme exemplos.
Exemplos:
Entrada: Saída:
10       SOMA = 40
30

Entrada: Saída:
-30      SOMA = -20
10

Entrada: Saída:
0        SOMA = 0
0

*/

import java.util.Scanner;

public class Exerc011DoisValoresInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		soma = x + y;
		
		System.out.println("Soma: " + soma);
		
		sc.close();

	}

}


/*
							OU

import java.util.Scanner;

public class uri1003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
} 

*/
