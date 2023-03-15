import java.util.*;

class AS{
	
	public static void main (String [] main){
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.println("\n$$ -> ID de servicio de autentificacion:");
			String usuario = teclado.nextLine();
			
			if(usuario.equals("gnyij")){
				EnvioAS envioas = new EnvioAS();
				envioas.MensajeCliente();
			} else{
				System.out.println("\n$$ -> ID incorrecto");
			}
		}
	}
	
}	