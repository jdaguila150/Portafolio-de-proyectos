import java.util.Scanner;

	class meses_del_ano {

	public static void main(String arg[]) {
		Scanner Leer = new Scanner(System.in);

		int numero=0;
		int mes=0;
		
		do{
			System.out.println("Ingresa un numero entre 1 y 10");
			numero = Leer.nextInt();

		 if (numero >10 || numero<0) {
				System.out.println("Su numero no es valido");
			}
		else 
			System.out.println("Gracias");
			
		}
		while(numero >10 || numero<0);
	}
}


	

