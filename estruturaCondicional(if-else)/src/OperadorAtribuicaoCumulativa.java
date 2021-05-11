/*
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
a 100 minutos de telefone. Cada minuto que exeder a franquia de 100 minutos
custa R$ 2.00. Fazer um programa para ler a quantidade de munutos que uma 
pessoa consumiu, dai mostrar o valor a ser pago.

Entrada   Sida
22	      valor a pagar: R$ 50.00

103       valor a pagar: R$ 56.00
*/

import java.util.Scanner;

public class OperadorAtribuicaoCumulativa {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos minutos foram usados: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		
		if(minutos > 100) {
			conta += (minutos-100)*2;
					
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
				
		sc.close();
				
	}

}