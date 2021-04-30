import java.util.Locale;

public class VariavelDeTipoBasicoLocale {

	public static void main(String[] args) {
		
		byte y = 32;
		
		double x = 10.35784;
		
			
		Locale.setDefault(Locale.US);
		
		System.out.println(y);
		
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		
		System.out.printf("%.4f%n", x);
	
	}
	
}
