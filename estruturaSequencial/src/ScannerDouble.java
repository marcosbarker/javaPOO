import java.util.Scanner;

public class ScannerDouble {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		System.out.printf("Voc? digitou: %.2f%n", x);
		
		sc.close();

	}

}
