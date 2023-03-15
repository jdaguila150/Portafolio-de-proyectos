
import java.net.*;
import java.util.*;
import java.io.*;

class EnvioTGS{
	
	int puerto = 4321;
	String Ktgs =  "JGNYI";
	String Kcv =  "NYIJG";
	String Kv =  "YIJGN";
	String Kctgs =  "";
	String IDv = "";
	String IDc = "";
	String ADc = "";
	String fecha = "";
	String IDtgs = "jgnyi";
	String sello_tiempo = "";
	String tiempo_vida = "";
	String Ticketv = "";
	
	public void MensajeCliente() {
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
				
				IDv = recibir[0];
				String [] Tickettgs = cd.Desencriptar(recibir[1], Ktgs).split(", ");
				Kctgs = Tickettgs[0];
				IDc = Tickettgs[1];
				ADc = Tickettgs[2];
				if(IDtgs.equals(Tickettgs[3]) && IDv.equals("nyijg") ){
					String [] Autentificador = cd.Desencriptar(recibir[2], Kctgs).split(", ");
					String [] f1 = Tickettgs[5].split(" ");
					String [] f2 = Autentificador[2].split(" ");
					String [] f3 = Tickettgs[4].split(" ");
					if( IDc.equals(Autentificador[0]) && ADc.equals(Autentificador[1]) 
						&& Integer.parseInt(f2[1]) <= Integer.parseInt(f1[1]) 
						&& Integer.parseInt(f2[1]) >= Integer.parseInt(f3[1]) ){
						
						sello_tiempo = Autentificador[2];
						tiempo_vida = f2[0] + " " + (Integer.parseInt(f2[1]) + 1);
						
						
						String ___Ticketv = Kcv + ", " + IDc + ", " + ADc + ", " + IDv + ", " + sello_tiempo + ", " + tiempo_vida;
						String Ticketv = cd.Encriptar(___Ticketv, Kv);
						String res = Kcv + ", " + IDv + ", " + sello_tiempo + ", " + Ticketv;
						
						respuestita = res;
						
					}
				}
				
				
				PrintStream salida = new PrintStream(as.getOutputStream());
				String enviar = cd.Encriptar(respuestita, Kctgs);
				salida.println(enviar);
				
				System.out.println("\n$$ -> Respuesta enviada");
				
				as.close();
				AS.close();
				
			} catch(Exception e){}	
		}
	}
}	