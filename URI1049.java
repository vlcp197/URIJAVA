import java.util.Scanner;

public class URI1049{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);

		String a,b,c;

		a = teclado.next();
		b = teclado.next();
		c = teclado.next();

		if (a.equalsIgnoreCase ("vertebrado")){
			if (b.equalsIgnoreCase ("ave")){
				if (c.equalsIgnoreCase ("carnivoro")){
					System.out.println("aguia");
				}
				if (c.equalsIgnoreCase ("onivoro")){
					System.out.println("pomba");
				}
			}
		} 
		if (a.equalsIgnoreCase ("vertebrado")){
			if (b.equalsIgnoreCase ("mamifero")){
				if (c.equalsIgnoreCase ("onivoro")){
					System.out.println("homem");
				}
				if (c.equalsIgnoreCase ("herbivoro")){
					System.out.println("vaca");
				}
			}
		} 

		if (a.equalsIgnoreCase ("invertebrado")){
			if (b.equalsIgnoreCase ("inseto")){
				if (c.equalsIgnoreCase ("hematofago")){
					System.out.println("pulga");
				}
				if (c.equalsIgnoreCase ("herbivoro")){
					System.out.println("lagarta");
				
				}	
			}
		}
		if (a.equalsIgnoreCase ("invertebrado")){	
			if (b.equalsIgnoreCase ("anelideo")){
				if (c.equalsIgnoreCase ("hematofago")){
					System.out.println("sanguessuga");
				}
				if (c.equalsIgnoreCase ("onivoro")){
					System.out.println("minhoca");
				}
			}
		}
	}
}	