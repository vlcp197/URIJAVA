import java.util.Scanner;
import java.text.DecimalFormat;

public class URI1040{
	public static void main(String args[]){
		double N1,N2,N3,N4,MEDIA,EXAME;

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.0");

		N1 = teclado.nextDouble();
		N2 = teclado.nextDouble();
		N3 = teclado.nextDouble();
		N4 = teclado.nextDouble();

		MEDIA = (N1*2 + N2*3 + N3*4 + N4)/10.0;

		if(MEDIA >= 7.0){
			System.out.println("Media: "+df.format(MEDIA));
			System.out.println("Aluno aprovado.");
		} else if (MEDIA < 5.0){
			System.out.println("Media: "+df.format(MEDIA));
			System.out.println("Aluno reprovado.");
		} else {
			System.out.printf("Media: %.1f\nAluno em exame.\n",MEDIA);
			System.out.print("Nota do exame: ");
			EXAME = teclado.nextDouble();
			MEDIA = (EXAME + MEDIA)/2;
			if(MEDIA >= 5.0){
				System.out.printf("Aluno aprovado.\nMedia final: %.1f\n",MEDIA);
			} else {
				System.out.printf("Aluno reprovado.\nMedia final: %.1f\n",MEDIA);
			}
		}





	}
}