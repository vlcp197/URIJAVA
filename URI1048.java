import java.util.Scanner;

public class URI1048{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		double valor,reajuste;
		String percentual;

		valor = teclado.nextDouble();
		reajuste = 0;
		percentual = "";

		if (valor >= 0 && valor <= 400.00){
			percentual = "15 %";
			reajuste = valor * 0.15;
		} else {
			if (valor >= 400.01 && valor <= 800.00){
				percentual = "12 %";
				reajuste = valor * 0.12;
			} else {
				if (valor >= 800.01 && valor <= 1200.00){
					percentual = "10 %";
					reajuste = valor * 0.1;
				} else {
					if (valor >= 1200.01 && valor <= 2000.00){
						percentual = "7 %";
						reajuste = valor * 0.07;
					} else {
						if (valor > 2000.00){
							percentual = "4 %";
							reajuste = valor * 0.04;
						}
					}
				}
			}
		}
		System.out.printf("Novo salario: %.2f\n",(valor + reajuste));
		System.out.printf("Reajuste ganho: %.2f\n",reajuste);
		System.out.println("Em percentual: "+percentual);

	}
}