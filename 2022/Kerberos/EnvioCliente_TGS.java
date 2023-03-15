
import java.net.*;
import java.util.*;
import java.io.*;

class EnvioCliente_TGS{
	
	String IDv = "";
	String SelloTiempo = "";
	String tiempo_vida = "";
	String Ticketv = "";
	
	public String MensajeTGS(String IDc, int puerto, String ADc, String Tickettgs, String Kctgs){
		
		String respuesta = "Sin permiso";
		
		Date fecha = new Date();
		String [] F = fecha.toString().split(" ");
		SelloTiempo = F[1] + " " + F[2];
		
		while (respuesta.equals("Sin permiso")){
			try{
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("\n$$ -> Ip de TGS:");
				String IPtgs = teclado.readLine();
				System.out.println("\n$$ -> ID de Servidor:");
				IDv = teclado.readLine();
				
				Socket Cliente = new Socket(IPtgs, puerto);
				
				PrintStream salida = new PrintStream(Cliente.getOutputStream());
				
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				String Autentificador = IDc + ", " + ADc + ", " + SelloTiempo;
				
				String enviar = IDv + ", " + Tickettgs + ", " + cd.Encriptar(Autentificador, Kctgs);
				salida.println(enviar);
				System.out.println("\n$$ -> Solicitud enviada");
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
				respuesta = cd.Desencriptar(entrada.readLine(), Kctgs);
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