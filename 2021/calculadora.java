class calculadora{
	public static void main(String args[]) {
		int op=0;
		int num1=0;
		int num2=0;
		float res=0.0f;

		System.out.println("Operaciones aritmeticas");
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicacion");
		System.out.println("4 Division");
		System.out.println("Teclea la opcion");
		op=Leer.datoInt();
		System.out.println("Teclea un numero");
		num1=Leer.datoInt();
		System.out.println("Teclea un numero");
		num2=Leer.datoInt();
		switch(op)
		{
			case 1:
				res=num1+num2;
			break;
			case 2:
				res=num1-num2;
			break;
			case 3:
				res=num1*num2;
			break;
			case 4:
				res=num1/num2;
			break;
			default:
				System.out.println("Opcion invalida");

		}

		System.out.println("El resultado es "+res);
		
	}
}

