import java.util.Scanner;

public class Exerc06MediaPonderada {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Entre com o numero de testes: ");
  int N = sc.nextInt();

  for (int i = 0; i < N; i++) {
    System.out.print("Primeiro valor: ");
    double a = sc.nextDouble();
    System.out.print("Segundo valor: ");
    double b = sc.nextDouble();
    System.out.print("Terceiro valor: ");
    double c = sc.nextDouble();

    double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

    System.out.printf("Media: %.1f2%n%n", media);
  }

  sc.close();
  
  }
}