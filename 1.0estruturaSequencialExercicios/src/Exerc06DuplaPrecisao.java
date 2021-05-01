/*
Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura dividido por 2.
b) a �rea do c�rculo de raio C * C * (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases dividido por 2 e C * altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B. 

Exemplos:
Entrada:    	 Sa�da:
3.0 4.0 5.2 	 TRIANGULO: 7.800
				 CIRCULO: 84.949
				 TRAPEZIO: 18.200
				 QUADRADO: 16.000
				 RETANGULO: 12.000

Entrada: 		Sa�da:
12.7 10.4 15.2  TRIANGULO: 96.520
	 			CIRCULO: 725.833
 				TRAPEZIO: 175.560
 				QUADRADO: 108.160
 				RETANGULO: 132.080
 				
*/

import java.util.Locale;
import java.util.Scanner;

public class Exer06DuplaPrecisao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, 
			   quadrado, retangulo, pi = 3.14159;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triangulo = A * C / 2.0;
		circulo = C * C * pi;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
		
		sc.close();

	}

}

/*

import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}

*/
