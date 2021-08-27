import java.util.Scanner;

public class URI1117{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int valida;
		double nota,media,x;
		valida = 0;
		x = 0;


		while(valida != 2){
			nota = teclado.nextDouble();
			if (nota >=0 && nota <=10){
				valida = valida + 1;
				x = x + nota;
			}else{
				System.out.println("nota invalida");
				}
			}
			media = x / 2.0;
			System.out.printf("media = %.2f\n",media);
		}
	}