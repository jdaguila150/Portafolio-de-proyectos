import java.util.Scanner;
class Tablas{

	public static void main(String[] args) {
	Scanner Leer = new Scanner(System.in);
		


		int num=0;

		System.out.println("Indica la tabla de multiplicar que quieras saber");
		num= Leer.nextInt();
		System.out.println("Calculando");

		for(int i=0 ; i<=10; i++){

			System.out.println(num*i);

		}


	}
}