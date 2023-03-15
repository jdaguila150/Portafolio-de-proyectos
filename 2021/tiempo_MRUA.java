class Tiempo_en_MRUA
{

	public static void main(String args []) {
		//Declaracion de variables

		float acel=0.0f;
		float vel_ini=0.0f;
		float vel_fin=0.0f;
		float tiempo=0.0f;


		//Entrada de datos

		System.out.println("Inserte su aceleracion");
		acel =Leer.datoFloat();
		System.out.println("Inserte su velocidad inicial");
		vel_ini =Leer.datoFloat();
		System.out.println("Idnsertesu velocidad final");
		vel_fin =Leer.datoFloat();

		//Proceso

		tiempo=(float)(vel_fin-vel_ini)/acel;

		System.out.println("Su tiempo es "+tiempo);
	}
}
