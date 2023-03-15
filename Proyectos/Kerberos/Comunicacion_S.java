import java.io.*;
import java.net.*;

public class Comunicacion_S {

	public void Mensaje(int puerto, String Knueva, String IPv){
		while(true){
			try{
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
			
				Socket cliente = new Socket(IPv, puerto);
				
				System.out.println("\n$$ -> Mensaje: ");
				String mensaje = teclado.readLine();
				PrintStream salida = new PrintStream(cliente.getOutputStream());

				salida.println(cd.Encriptar(mensaje, Knueva));
				System.out.println("\n$$ -> Mensaje enviado");

				BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				String respuesta = entrada.readLine();
				String res_desencriptada = cd.Desencriptar(respuesta, Knueva);
				System.out.println("\n$$ -> Respuesta desencriptada:\n$$ ---> " + res_desencriptada);
				
				cliente.close();
				
				if(res_desencriptada.equals("adios") || mensaje.equals("adios")){
					break;
				}
				
				
			} catch (Exception e) {}
		}
	}
}