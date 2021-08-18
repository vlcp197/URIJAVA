import java.util.Scanner;

public class URI1061{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int dia, hora, minuto, segundo;
		int diaf, horaf, minutof, segundof;
		int w,x,y,z;

		System.out.print("Dia ");
		dia = teclado.nextInt();
		hora = teclado.nextInt();
		System.out.println("");
		minuto = teclado.nextInt();
		System.out.println("");
		segundo = teclado.nextInt();
		System.out.print("Dia ");
		diaf= teclado.nextInt();
		horaf = teclado.nextInt();
		System.out.println("");
		minutof = teclado.nextInt();
		System.out.println("");
		segundof = teclado.nextInt();

		w = diaf - dia;
		x = 24 + (horaf - hora);
		y = minutof - minuto;
		z = segundof - segundo;

		if (x != 24){
			w = w - 1;		
		}

		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
}