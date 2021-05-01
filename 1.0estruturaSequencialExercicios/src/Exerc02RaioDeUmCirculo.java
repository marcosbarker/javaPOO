/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

Exemplos:
Entrada: Saída:
2.00     A=12.5664
Entrada: Saída:
100.64   A=31819.3103
Entrada: Saída:
150.00   A=70685.7750
*/

import java.util.Locale;
import java.util.Scanner;

public class Exerc02RaioDeUmCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159, area;
		double r = sc.nextDouble();
		
		area = pi * Math.pow(r, 2);
		
		System.out.printf("%.4f", area);
		
		sc.close();
	}
	
}

/*

import java.util.Locale;
import java.util.Scanner;

public class Exerc02RaioDeUmCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r = sc.nextDouble();
		
		r = pi * Math.pow(r, 2);
		
		System.out.printf("%.4f", r);
		
		sc.close();
	}
	
}


import java.util.Locale;
import java.util.Scanner;

public class Exerc02RaioDeUmCirculo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double R, A, pi = 3.14159;
	    
	    R = sc.nextDouble();

	    A = pi * R * R;

	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}
}

*/