import java.util.Scanner;

public class URI1047{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int horaInicial, minutoInicial, horaFinal, minutoFinal;
		int hora, minuto;

		horaInicial = teclado.nextInt();
		minutoInicial = teclado.nextInt();
		horaFinal = teclado.nextInt();
		minutoFinal = teclado.nextInt();

		minuto = minutoFinal - minutoInicial;
		hora = horaFinal - horaInicial;

		if (hora < 0) {
			hora = 24 + hora;	
		}

		if (minuto < 0){
			minuto = 60 + minuto;
			minuto--;

		}

		if (horaInicial == horaFinal && minutoInicial == minutoFinal){
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");	
		} else {
			System.out.println("O JOGO DUROU "+hora+" HORA(S) E "+minuto+" MINUTO(S)");
		}
	}
}
