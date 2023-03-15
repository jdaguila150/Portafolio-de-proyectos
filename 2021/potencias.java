class potencias
{

	public static void main(String args []) {
		//Declaracion de variables

		float num_1=0.0f;
		double cuadrado=0.0d;
		double cubo=0.0d;



		System.out.println("Ingresa un n\u00famero y te lo elevar\u00e9 al cuadrado y al cubo");
		System.out.println("Inserta tu n\u00famero");
		num_1 =Leer.datoFloat();
		

		cuadrado=(num_1*num_1);
		cubo=(num_1*num_1*num_1);

		System.out.println("Su resultado de su n\u00famero al cuadrado es "+cuadrado);
		System.out.println("Su resultado de su n\u00famero al cuadrado es "+cubo);
	}
}