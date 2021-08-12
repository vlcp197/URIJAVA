import java.util.Scanner;

public class URI1016{
	public static void main(String args[]){
		int tempo;

		Scanner teclado = new Scanner(System.in);

		tempo = teclado.nextInt();
		tempo = tempo * 2;

		System.out.println(tempo + " minutos");
	}
}