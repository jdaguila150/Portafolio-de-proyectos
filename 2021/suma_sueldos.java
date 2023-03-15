import java.util.Scanner;

	class Sueldo {

	public static void main(String arg[]) {
		Scanner Leer = new Scanner(System.in);

		int sueldo=0;
		int total=0;
		int contador=0;
		while (contador<5){
		//estamos usando while para decirle que hasta que no llegue a 5 el contador, se repetira la accion dentro de las llaves
			System.out.println("Teclea un sueldo");
			sueldo = Leer.nextInt();
			total=total+sueldo;
			contador=contador+1;//estamos agregando +1 a la variable contador, para hacer que se acerque al

		}
		System.out.println("El total de su sueldo es "+total);
	}
}
	
			
		

