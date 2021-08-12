import java.util.Scanner;

public class URI1038{
	public static void main(String args[]){
		int cod, qtd;
		double preco;

		Scanner teclado = new Scanner(System.in);

		cod = teclado.nextInt();
		qtd = teclado.nextInt();

		if(cod == 1){
			System.out.printf("Total: R$ %.2f\n",4.00*qtd);
		} else if (cod == 2){
			System.out.printf("Total: R$ %.2f\n",4.50*qtd);
		} else if (cod == 3){
			System.out.printf("Total: R$ %.2f\n",5.00*qtd);
		} else if (cod == 4){
			System.out.printf("Total: R$ %.2f\n",2.00*qtd);
		} else if (cod == 5){
			System.out.printf("Total: R$ %.2f\n",1.50*qtd);
		}


	}
}