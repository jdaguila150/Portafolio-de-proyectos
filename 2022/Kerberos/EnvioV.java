
import java.net.*;
import java.util.*;
import java.io.*;

class EnvioV{
	
	int puerto = 4321;
	String Kv =  "YIJGN";
	String Kcv =  "";
	String IDc = "";
	String ADc = "";
	String IDv = "nyijg";
	
	String sello_tiempo = "";
	String Knueva = "";
	
	public String MensajeCliente() {
		
		while(true){
			try{
				System.out.println("\n$$ -> Esperando conexion...");
				
				ServerSocket AS = new ServerSocket(puerto);
				Socket as = AS.accept();
				
				System.out.println("\n$$ -> Conexion aceptada");
				
				String respuestita = "Sin permiso";
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(as.getInputStream()));
				
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				String respuesta = entrada.readLine();
				
				System.out.println("\n$$ -> Datos recibidos:\n$$ ---> " + respuesta);
				
				String [] recibir = respuesta.split(", ");
				
				String [] Ticketv = cd.Desencriptar(recibir[0], Kv).split(", ");
				
				Kcv = Ticketv[0];
				IDc = Ticketv[1];
				ADc = Ticketv[2];
				
				if(IDv.equals(Ticketv[3])){
					String [] Autentificador = cd.Desencriptar(recibir[1], Kcv).split(", ");
					String [] f1 = Ticketv[5].split(" ");
					String [] f2 = Autentificador[2].split(" ");
					String [] f3 = Ticketv[4].split(" ");
					if( IDc.equals(Autentificador[0]) && ADc.equals(Autentificador[1]) 
						&& Integer.parseInt(f2[1]) <= Integer.parseInt(f1[1]) 
						&& Integer.parseInt(f2[1]) >= Integer.parseInt(f3[1]) ){
						
						Date fecha = new Date();
						String [] F = fecha.toString().split(" ");
						sello_tiempo = F[1] + " " + F[2];
						
						BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("\n$$ -> Clave entre Servidor y Cliente");
						Knueva = teclado.readLine();
						String res = sello_tiempo + ", " + Knueva;
						
						respuestita = res;
						
					}
				}
				
				
				PrintStream salida = new PrintStream(as.getOutputStream());
				String enviar = cd.Encriptar(respuestita, Kcv);
				salida.println(enviar);
				
				System.out.println("\n$$ -> Respuesta enviada");
				
				if(!respuestita.equals("Sin permiso")){
					break;
				}
				
				as.close();
				AS.close();
				
			} catch(Exception e){}	
		}
		return Knueva;
	}
}	