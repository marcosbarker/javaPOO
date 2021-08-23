/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

Entrada: 
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0

Saída:
5.7
6.3
9.3
*/
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