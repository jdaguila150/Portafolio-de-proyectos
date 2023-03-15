import java.util.Scanner;
//Aguila Ortega Josue Daniel
class tempetura {

	public static void main(String arg[]) {
		Scanner Leer = new Scanner(System.in);

		double temp =0.0d;

		System.out.println("¿Que temperatura marca su termometro?");
		temp=Leer.nextDouble();

		if (temp <= 5) {
			System.out.println("La actividad perfecta a realizar es Maraton");
		}
			else{
				if (temp >5 && temp <=10) {
					System.out.println("La actividad perfecta a realizar es esqui");					
				}
				else{
					if (temp >10 && temp<=20) {
						System.out.println("La actividad perfecta a realizar es golf");
					}
					else{
						if (temp >20 && temp<=30) {
							System.out.println("La actividad perfecta a realizar es tenis");
						}
						else{
								System.out.println("La actividad perfecta a realizar es Natacion");

						}
					}
				}
			}
		}
	}
