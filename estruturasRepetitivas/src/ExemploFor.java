
/*
Fazer um programa que le um valor inteiro N e depois N numero inteiros.
Ao final, mostra a soma dos N numeros lidos. 
*/
import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o numero de repetições: ");
		int N = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		sc.close();

	}

}