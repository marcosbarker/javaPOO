/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.

Entrada: Saída:
  4         24
Entrada: Saída:
  1         1
Entrada: Saída:
  5        120
Entrada: Saída:
  0         1
*/
import java.util.Scanner;

public class Exerc08CalculoFatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int fatorial = 1;

    for (int i = 1; i <= N; i++) {
      fatorial *= i ;
    }

    System.out.println("O fatorial de " + N + " é " + fatorial);

    sc.close();
  }
}