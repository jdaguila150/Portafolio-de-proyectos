class Sueldo_2{
	public static void main(String args[]) {
		
		float sueldo=0.0f;
		float aumento=0.0f;
		float sueldonuevo=0.0f;
		String nombre=""; //string se utiliza para caracteres//

		System.out.println("Ingrese su nombre");
		nombre=Leer.dato ();
		
		System.out.println("Ingrese su sueldo");
		sueldo=Leer.datoInt();

		if (sueldo>1000) {
			aumento=sueldo*0.15f;
			System.out.println("Tiene un sueldo normal");
		}
		else{
			aumento=sueldo*0.20f;
			System.out.println("Tiene un aumento");
		}
		System.out.println("Muchas gracias " +nombre);
		sueldonuevo=sueldo+aumento;
		System.out.println("El nuevo sueldo es: "+sueldonuevo);
	}



}

