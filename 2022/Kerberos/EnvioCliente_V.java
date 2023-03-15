
import java.net.*;
import java.util.*;
import java.io.*;

class EnvioCliente_V{
	
	String SelloTiempo = "";
	String IPv = "";
	
	public String MensajeTGS(String IDc, int puerto, String ADc, String Ticketv, String Kcv){
		
		String respuesta = "Sin permiso";
		
		Date fecha = new Date();
		String [] F = fecha.toString().split(" ");
		SelloTiempo = F[1] + " " + F[2];
		
		while (respuesta.equals("Sin permiso")){
			try{
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("\n$$ -> Ip del servidor:");
				IPv = teclado.readLine();
				
				Socket Cliente = new Socket(IPv, puerto);
				
				PrintStream salida = new PrintStream(Cliente.getOutputStream());
				
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				String Autentificador = IDc + ", " + ADc + ", " + SelloTiempo;
				
				String enviar = Ticketv + ", " + cd.Encriptar(Autentificador, Kcv);
				salida.println(enviar);
				System.out.println("\n$$ -> Solicitud enviada");
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));
				respuesta = cd.Desencriptar(entrada.readLine(), Kcv);
				System.out.println("\n$$ -> Datos recibidos:\n$$ ---> " + respuesta);
				
				if(respuesta.equals("Sin permiso")){
					System.out.println("\n$$ -> Intentalo de nuevo");
				}
				
				Cliente.close();
				
			} catch(Exception e){}
		}
		return respuesta + ", " + IPv;	
	}
}