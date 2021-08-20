/*
Fazer um programa que le numeros inteiros ate que um zero seja lido.
Ao final mostra a soma dos numeros lidos. 
*/
import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();
	}

}