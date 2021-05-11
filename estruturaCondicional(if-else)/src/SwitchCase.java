/*
Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana
(sendo 1=domingom ,1=segunda, e assim por diante).
Escrever na tela o dia da semana correspondentem conforme exemplo.

Entrada     Saida
1           Dia da semana: Domingo

4           Dia da semana: Quarta
*/

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual dia da Semana? ");

		int x = sc.nextInt();

		String dia;

		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}

		System.out.println("Dia da semana:10 " + dia);

		sc.close();
	}

}