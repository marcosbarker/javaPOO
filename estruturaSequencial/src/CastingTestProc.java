
public class CastingTestProc {

	public static void main(String[] args) {

		int a, b;
		double resultadoCasting, resultado;
		
		a = 5;
		b = 2;
		
		resultadoCasting = (double) a / b;
		
		resultado = a / b;
		
		System.out.println("Resultado com casting: " + resultadoCasting);
		System.out.println("Resultado normal: " + resultado);
		
	}

}
