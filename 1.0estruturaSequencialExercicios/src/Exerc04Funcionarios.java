/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o 
número e o salário do funcionário, com duas casas decimais.

Exemplos:
Entrada: Saída:
25       NUMBER = 25
100      SALARY = U$ 550.00
5.50

Entrada: Saída:
1        NUMBER = 1
200      SALARY = U$ 4100.00
20.50

Entrada: Saída:
6        NUMBER = 6
145      SALARY = U$ 2254.75
15.55
*/

import java.util.Locale;

import java.util.Scanner;

public class Exerc04Funcionarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario, ht;
		double valorHora, salarioCalc;
		
		funcionario = sc.nextInt();
		ht = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salarioCalc = valorHora * ht;
		
		System.out.println("Numero do funcionario: " + funcionario);
		System.out.printf("Salario: U$ %.2f%n", salarioCalc);
		
		sc.close();
		
	}

}


/*

import java.util.Locale;
import java.util.Scanner;

public class Exerc04Funcionarios {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
	    double valorHora, salario;

	    numero = sc.nextInt();
	    horas = sc.nextInt();
	    valorHora = sc.nextDouble();

	    salario = valorHora * horas;

	    System.out.println("NUMBER = " + numero);
	    System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}

*/
