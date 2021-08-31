import java.util.Scanner;

public class URI1131{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		int inter, gremio, repete,grenal,empates,gr,in;

		inter = 0;
		gremio = 0;
		repete = 1;
		grenal = 0;
		empates = 0;
		gr = 0;
		in = 0;


		while(repete != 2){
			while(repete == 1){
				inter = teclado.nextInt();
				gremio = teclado.nextInt();
				grenal = grenal + 1;
				if (inter == gremio){
					empates = empates + 1;
				} else {
					if (inter > gremio){
						in = in + 1;
					} else {
						if (gremio > inter){
							gr = gr + 1;
						}
					}
				}
				System.out.println("Novo grenal (1-sim 2-nao)");
				repete = teclado.nextInt();
			}
		}
		System.out.println(grenal + " grenais");
		System.out.println("Inter:"+in);
		System.out.println("Gremio:"+gr);
		System.out.println("Empates:"+empates);
		if(inter * in > gremio * gr){
			System.out.println("Inter venceu mais");
		} else {
			if (inter * in < gremio * gr){
				System.out.println("Gremio venceu mais");
			}
		}
	}
}