import java.util.Scanner;

public class CondicaoEncadeadaRefac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12)
			System.out.println("Bom dia");

			else if (hora < 18) {
				System.out.println("Boa tarde");

			} else {
				System.out.println("Boa noite");

			}

			sc.close();

		}
	}

/*
Exemplo de encadeamento "sem" chaves.

if(condicao1){
	comando1
	comando2

}else if(condicao2){
	comando3
	comando4

}else if(condicao3){
	comando5
	comando6

}else{
	comando7
	coando8

}

*/
