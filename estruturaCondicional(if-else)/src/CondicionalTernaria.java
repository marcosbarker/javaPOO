import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.print("Entre com o pre�o: ");
		double preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		
		System.out.println("Desconto: " + desconto);

		sc.close();

	}

}

/*
import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;

		} else {
			desconto = preco * 0.05;
			
		}
		
		System.out.println("Desconto: " + desconto);

		sc.close();

	}

}
*/