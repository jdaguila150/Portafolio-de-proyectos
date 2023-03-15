class Area_de_un_Triangulo 
{

	public static void main(String args []) {
		//Declaracion de variables

		int base=0;
		float altura=0.0f;
		float area=0.0f;

		//Entrada de datos

		System.out.println("Teclee la medida de la base");
		base =Leer.datoInt();
		System.out.println("Teclee la medida de la altura");
		altura =Leer.datoFloat();

		//Proceso

		area=(float)(base*altura)/2;

		System.out.println("Su area es "+area);
