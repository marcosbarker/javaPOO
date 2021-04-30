public class PrintfConcatena {

	public static void main(String[] args) {
		
		double y = 32, x = 10;
		int z = 5;
		
		String nome = "Marcos";
		int idade = 31;
		double renda = 4000;
		
		System.out.printf("Resultado de x = %.0f metros, e de y = %.1f%n", x, y);
		System.out.printf("Resultado de x = %.0f metros, e de z = %d%n", x, z);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);



	}

}
