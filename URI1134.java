import java.util.Scanner;

public class URI1134{
	public static void main(String args[]){
		Scanner teclado = new Scanner (System.in);

		int x,al,ga,di;
		al = 0;
		ga = 0;
		di = 0;
		x = 0;

		while(x != 4){
			x = teclado.nextInt();

			switch(x){
				case 1:
					al = al + 1;
					break;
				case 2: 
					ga = ga + 1;
					break;
				case 3:
					di = di + 1;
					break;
				case 4:
					x = 4;
					break;

			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+al);
		System.out.println("Gasolina: "+ga);
		System.out.println("Diesel: "+di);
	}
}