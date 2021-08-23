import java.util.Scanner;

public class Exerc07DivisaoPares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com o numero de repetições: ");
    int N = sc.nextInt();

    for (int i = 0; i < N; i++) {
      System.out.println("Entre com com numeros para dividilos por 2: ");
      System.out.print("Primeiro numero: ");
      int num1 = sc.nextInt();

      System.out.print("Segundo numero: ");
      int num2 = sc.nextInt();
      
      if (num2 == 0) {
        System.out.println("Impossivel dividir por Zero\n");

      } else {
        double div = (double) num1 / num2;
        System.out.printf("A divisao é %.1f%n%n", div);
      }
    }

    sc.close();
  }
}