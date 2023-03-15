
import java.net.*;
import java.util.*;
import java.io.*;

//Clase hecha por Josue Daniel Aguila Ortega

class EnvioAS{
	
	String Kc =  "IJGNY";
	String IDc = "";
	String ADc = "";
	String IDtgs = "";
	int puerto = 4321;
	String fecha = "";
	String Ktgs =  "JGNYI";
	String Kctgs =  "GNYIJ";
	String tiempo_vida = "";
	
	public void MensajeCliente() {
		while(true){
			try{
				System.out.println("\n$$ -> Esperando conexion...");
				
				ServerSocket AS = new ServerSocket(puerto);
				Socket as = AS.accept();
				
				System.out.println("\n$$ -> Conexion aceptada");
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(as.getInputStream()));
				
				String respuesta = entrada.readLine();
				String [] recibir = respuesta.split(", ");
				IDc = recibir[0];
				IDtgs = recibir[1];
				fecha = recibir[2];
				ADc = recibir[3];
				
				String [] f = fecha.split(" ");
				tiempo_vida = f[0] + " " + (Integer.parseInt(f[1]) + 1);
		
				System.out.println("\n$$ -> Datos recibidos:\n$$ ---> " + respuesta);
				
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				String respuestita = "Sin permiso";
				if (IDtgs.equals("jgnyi")){
					
					String __Tickettgs = Kctgs + ", " + IDc + ", " + ADc + ", " + IDtgs + ", " + fecha + ", " + tiempo_vida;
					String Tickettgs = cd.Encriptar(__Tickettgs, Ktgs);
					String res = Kctgs + ", " + IDtgs + ", " + fecha + ", " + tiempo_vida + ", " + Tickettgs;
					
					respuestita = res;
				}
				
				PrintStream salida = new PrintStream(as.getOutputStream());
				String enviar = cd.Encriptar(respuestita, Kc);
				salida.println(enviar);
				
				System.out.println("\n$$ -> Respuesta enviada");
				
				as.close();
				AS.close();
				
			} catch(Exception e){}	
		}
	}
}	