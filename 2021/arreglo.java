import java.util.Scanner;
//Aguila Ortega Josue Daniel
class arreglo {

	public static void main(String arg[]) {
		Scanner Leer = new Scanner(System.in);

//en la estructura for, i es un indice, controla las posiciones del aarreglo


		int cals[] = new int[5];
		for (int i=0; i<5; i++)
		{
			System.out.println("Teclea la calificacion");
			cals[i] = Leer.nextInt();
		}
		System.out.println("Las calificaciones que dio son: ");
		for (int i=0; i<5 ;i++ ) {
			System.out.println("la calificacion es: "+cals[i]);
		}
	}
}