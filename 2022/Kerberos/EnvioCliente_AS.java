
import java.net.*;
import java.util.*;
import java.io.*;

//Clase hecha por Josue Daniel Aguila Ortega

class EnvioCliente_AS{
	
	String Kctgs = "";
	String IDtgs = "";
	String SelloTiempo = "";
	String tiempo_vida = "";
	String Tickettgs = "";

	public String MensajeAS(String IDc, int puerto, String ADc, String Kc){
		
		String respuesta = "Sin permiso";
		
		Date fecha = new Date();
		String [] F = fecha.toString().split(" ");
		SelloTiempo = F[1] + " " + F[2];
		
		while (respuesta.equals("Sin permiso")){
			try{
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("\n$$ -> Ip de AS:");
				String IPas = teclado.readLine();
				System.out.println("\n$$ -> ID de TGS:");
				IDtgs = teclado.readLine();
				
				Socket Cliente = new Socket(IPas, puerto);
				
				PrintStream salida = new PrintStream(Cliente.getOutputStream());
				String enviar = IDc + ", " + IDtgs + ", " + SelloTiempo + ", " + ADc;
				salida.println(enviar);
				System.out.println("\n$$ -> Solicitud enviada");
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
				
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				respuesta = cd.Desencriptar(entrada.readLine(), Kc);
				System.out.println("\n$$ -> Datos recibidos:\n$$ ---> " + respuesta);
				
				if(respuesta.equals("Sin permiso")){
					System.out.println("\n$$ -> Intentalo de nuevo");
				}
				
				Cliente.close();
				
			} catch(Exception e){}
		}
		return respuesta;		
	}
}