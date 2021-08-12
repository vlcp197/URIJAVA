import java.util.Scanner;

public class URI1046{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int inicioJogo,fimJogo;

		inicioJogo = teclado.nextInt();
		fimJogo = teclado.nextInt();

		if(inicioJogo > fimJogo){
			System.out.println("O JOGO DUROU "+(24-(inicioJogo-fimJogo))+" HORA(S)");
		} else if (fimJogo > inicioJogo){
			System.out.println("O JOGO DUROU " + (fimJogo-inicioJogo)+" HORA(S)");
		} else {
				System.out.println("O JOGO DUROU 24 HORA(S)");
			}
		}
	}
