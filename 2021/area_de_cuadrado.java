class Area_de_un_cuadrado
{

	public static void main(String args[]) {
		//Declaracion de variables

		float lado=0.0f;
		float area=0.0f;

		//Entrada de datos

		System.out.println("Teclee la medida de su lado");
		lado=Leer.datoFloat();


		//Proceso

		area=(float)(lado*lado);

		System.out.println("El area de su cuadrado es: "+area);
	}
}
