/*
Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente 
em Fahrenheit. Perguntar se o usuario deseja repetir (s/n).
Caso o usuario digite "s", repetir o programa.

F = 9C/5 + 32
*/
import java.util.Scanner;

public class ExemploDoWhile {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char resposta;

    do {
      System.out.print("Entre com a temperatura em Celsius: ");
      double C = sc.nextDouble();
      double F = ((9 * C) / 5) + 32;

      System.out.printf("A temperatura equivalente em Fahrenheit: %.1f%n", F);

      System.out.println("Deseja repetir (s/n)?");
      resposta = sc.next().charAt(0);

    } while (resposta != 'n');

    sc.close();    
  }
}