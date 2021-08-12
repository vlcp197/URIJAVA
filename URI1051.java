import java.util.Scanner;

public class URI1051{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double valor,a;
		a = 0;

		valor = teclado.nextDouble();

		if(valor >= 0.00 && valor <= 2000.00){
			System.out.println("Isento");
		} else {
			if (valor >= 2000.01 && valor <= 3000.00){
				a = (valor -2000)*0.08;
				System.out.printf("R$ %.2f\n",a);
			} else {
				if (valor >= 3000.01 && valor <= 4500.00){
					a = 1000*0.08;
					a = a + ((valor - 3000)*0.18);
					System.out.printf("R$ %.2f\n",a);
				}else{
					if (valor > 4500.00){
						a = 1000*0.08 + 1500*0.18;
						a = a +((valor - 4500)*0.28);
						System.out.printf("R$ %.2f\n",a);

					}
				}
			}
		}
	}
}