import java.util.Scanner;

public class ScannerString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Voc? digitou: " + x);
		
		sc.close();


	}
}