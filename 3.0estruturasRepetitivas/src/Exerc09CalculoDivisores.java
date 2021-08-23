/*
Ler um número inteiro N e calcular todos os seus divisores.
Entrada: Saída:
6         1
          2
          3
          6
*/
import java.util.Scanner;

public class Exerc09CalculoDivisores {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Entre com um numero para obter seus divisores: ");
    int N = sc.nextInt();

    System.out.println("Os numero divisiveis por " + N + " são:");

    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        System.out.println(i);
      }
    }
    sc.close();
  }
}