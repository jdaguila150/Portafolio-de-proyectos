import java.util.Scanner;

class Edad
{
	public static void main(String[] args) {
		Scanner Leer = new Scanner (System.in);

		int year=0;
		int edad=0;

		System.out.println("Ingresa el a\u00f1o de tu nacimiento");
		year= Leer.nextInt();
		edad=2021-year;
		if (edad>18) {

			System.out.println("Es mayor de edad");
			System.out.println("Usted tiene " +edad);
			
		}

		else
			System.out.println("Usted es menor de edad");
		//debido a que es una sola linea no es necesario abrir bloque de instrucciones o llaves
	}
}