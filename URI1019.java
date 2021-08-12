

public class URI1019{
	public static void main(String args[]){
		int N,h,m,s;

		Scanner teclado = new Scanner(System.in);

		N = teclado.nextInt();

		m = (N % 3600)/60;
		s = N % 60;
		h = N / 3600;

		System.out.println(h + ":" + m + ":" +s);





	}
}