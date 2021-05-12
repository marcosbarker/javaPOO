import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarEmTXT {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		FileWriter arq = new FileWriter("teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		int i, n;

		System.out.printf("Informe o número para a tabuada:\n");
		n = ler.nextInt();

		

		gravarArq.printf("+--Resultado--+%n");
		for (i = 1; i <= 10; i++) {
			gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i * n));
		}
		gravarArq.printf("+-------------+%n");

		arq.close();
		ler.close();

		System.out.printf("\nTabuada do %d foi gravada com sucesso em \"teste.txt\".\n", n);
	}

}