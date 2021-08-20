/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

Entrada:
2200
1020
2022
2002

Saída:
Senha Invalida
Senha Invalida
Senha Invalida
Acesso Permitido
*/
import java.util.Scanner;

public class Exerc01SenhaValida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com uma senha válida: ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
	}

}