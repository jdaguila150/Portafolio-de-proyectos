import java.net.*;
import java.util.*;
import java.io.*;

class Cliente{
	
	boolean _1 = false;
	boolean _2 = false;
	boolean _3 = false;
	
	String Kc =  "IJGNY";
	String IDc = "";
	String ADc = "";
	int puerto = 4321;
	
	String Kctgs = "";
	String IDtgs = "";
	String tiempo_vida = "";
	
	String Ticket = "";
	String SelloTiempo = "";
	
	String Kcv = "";
	String IDv = "";
	
	String Knueva = "";
	String IPv = "";
	
	
	public static void main (String [] main){
		
		Scanner teclado = new Scanner(System.in);
		
		while(true){
			System.out.println("\n$$ -> ID de usuario:");
			String usuario = teclado.nextLine();
			
			if(usuario.equals("ijgny")){
				System.out.println("\n$$ -> PALABRAS RESERVADAS\n$$ ---> CconAS\n$$ ---> CconTGS\n$$ ---> CconS\n$$ ---> CS\n$$ ---> fin");
				Cliente C = new Cliente();
				C.inicio(usuario);
			} else{
				if(usuario.equals("fin")){
					break;
				} else{
					System.out.println("\n$$ -> ID incorrecto");
				}
			}
		}
		
	}
	
	public void inicio(String usuario) {
		while (true){
			try{
				ADc = InetAddress.getLocalHost().getHostAddress();
				
				IDc = usuario;
				
				System.out.println("\n$$ -> Palabra Reservada:");
				
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				String palabra = teclado.readLine();
				
				if(palabra.equals("CconAS")){
					
					EnvioCliente_AS EC = new EnvioCliente_AS();
					String Respuesta = EC.MensajeAS(IDc, puerto, ADc, Kc);
					String [] recibir = Respuesta.split(", ");
			
					Kctgs = recibir[0];
					IDtgs = recibir[1]; //Ya no se ocupan
					SelloTiempo = recibir[2]; //Ya no se ocupan
					tiempo_vida = recibir[3]; //Ya no se ocupan
					Ticket = recibir[4];
					
					_1 = true;
					
				} else if(palabra.equals("CconTGS")){
					
					if(_1 == true){
						EnvioCliente_TGS EC = new EnvioCliente_TGS();
						String Respuesta = EC.MensajeTGS(IDc, puerto, ADc, Ticket, Kctgs);
						String [] recibir = Respuesta.split(", ");
						
						Kcv = recibir[0];
						IDv = recibir[1]; //Ya no se ocupan
						SelloTiempo = recibir[2]; //Ya no se ocupan
						Ticket = recibir[3];
						
						_2 = true;
					} else{
						System.out.println("\n$$ -> Aun no tienes permitido realizar esta accion");
					}
					
				} else if(palabra.equals("CconS")){
					
					if(_2 == true){
					
						EnvioCliente_V EC = new EnvioCliente_V();
						String Respuesta = EC.MensajeTGS(IDc, puerto, ADc, Ticket, Kcv);
						String [] recibir = Respuesta.split(", ");
						
						Date fecha = new Date();
						String [] F = fecha.toString().split(" ");
						SelloTiempo = F[1] + " " + F[2];
						
						if(SelloTiempo.equals(recibir[0])){
							Knueva = recibir[1];
							IPv = recibir[2];
							
							_3 = true;
						}
						
					} else{
						System.out.println("\n$$ -> Aun no tienes permitido realizar esta accion");
					}
					
				} else if(palabra.equals("CS")){
					if(_3 == true){
						Comunicacion_S CV = new Comunicacion_S();
						CV.Mensaje(puerto, Knueva, IPv);
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