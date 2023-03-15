import java.util.Scanner;
//Aguila Ortega Josue Daniel
class frases {

	public static void main(String arg[]) {
		Scanner Leer = new Scanner(System.in);

		String repito="si";
		String frases="";
		int contador=0;


		while(repito.equals("si"))
		{
		System.out.println("Ingrese una frase");
		frases=Leer.nextLine();

		
		System.out.println("Desea agregar otra frase si/no");
		repito=Leer.next();
		contador=contador+1;

			}
		System.out.println("Usted agrego "+contador+ " frases");
	}
}



