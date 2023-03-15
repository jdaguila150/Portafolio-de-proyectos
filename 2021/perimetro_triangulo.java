class Perimetro_de_triangulo
{

	public static void main(String args []) {
		//Declaracion de variables

		float lado_1=0.0f;
		float lado_2=0.0f;
		float lado_3=0.0f;
		float perimetro=0.0f;


		//Entrada de datos

		System.out.println("Teclee la medida del primer lado");
		lado_1 =Leer.datoFloat();
		System.out.println("Teclee la medida del segundo lado");
		lado_2 =Leer.datoFloat();
		System.out.println("Teclee la medida del tercer lado");
		lado_3 =Leer.datoFloat();

		//Proceso

		perimetro=(float)(lado_3+lado_1+lado_2);

		System.out.println("Su perimetro es "+perimetro);
	}
}
