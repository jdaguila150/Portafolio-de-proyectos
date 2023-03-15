import java.util.*;
import java.io.*;

class Servidor{
	
	boolean _1 = false;
	String Knueva = "";
	
	public static void main (String [] main){
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.println("\n$$ -> ID de Servidor:");
			String usuario = teclado.nextLine();
			
			if(usuario.equals("nyijg")){
				System.out.println("\n$$ -> PALABRAS RESERVADAS\n$$ ---> SconC\n$$ ---> SC\n$$ ---> fin");
				Servidor S = new Servidor();
				S.inicio();
			} else{
				if(usuario.equals("fin")){
					break;
				} else{
					System.out.println("\n$$ -> ID incorrecto");
				}
			}
		}
	}
	
	public void inicio(){
		while (true){
			try{
				System.out.println("\n$$ -> Palabra Reservada:");
				
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				String palabra = teclado.readLine();
				
				if(palabra.equals("SconC")){
					
					EnvioV enviov = new EnvioV();
					Knueva = enviov.MensajeCliente();
					_1 = true;
					
				} else if(palabra.equals("SC")){
					if(_1 == true){
						Comunicacion_C SC = new Comunicacion_C();
						SC.Mensaje(Knueva);
					} else{
						System.out.println("\n$$ -> Aun no tienes permitido realizar esta accion");
					}
					
				} else if(palabra.equals("fin")){
					break;
				}
				
			} catch(Exception e){}	
		}
	}
	
}	