

public class URI1017{
	public static void main(String args[]){
		int horas, vel;
		double litros;

		Scanner teclado = new Scanner(System.in);

		horas = teclado.nextInt();
		vel = teclado.nextInt();

		litros = (horas * vel)/12.0;

		System.out.printf("%.3f\n",litros);

	}
}