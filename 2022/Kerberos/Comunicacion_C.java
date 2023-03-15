
import java.io.*;
import java.net.*;

public class Comunicacion_C {
	int puerto = 4321;
	
	public void Mensaje(String Knueva) {
		System.out.println("\n$$ -> Esperando conexion...");
		while(true){
			try {
				Cifrados_Descifrados cd = new Cifrados_Descifrados();
				
				BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
				
				ServerSocket servidor = new ServerSocket(puerto);
				Socket cliente = servidor.accept();

				BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
				String respuesta = entrada.readLine();
				String res_desencriptada = cd.Desencriptar(respuesta, Knueva);
				System.out.println("\n$$ -> Respuesta desencriptada:\n$$ ---> " + res_desencriptada);

				PrintStream salida = new PrintStream(cliente.getOutputStream());
				System.out.println("\n$$ -> Mensaje: ");
				String mensaje = teclado.readLine();
				salida.println(cd.Encriptar(mensaje, Knueva));

				System.out.println("\n$$ -> Mensaje enviado");
				
				cliente.close();
				servidor.close();
				
				if(res_desencriptada.equals("adios") || mensaje.equals("adios")){
					break;
				}
				
			} catch (Exception e) {
			}
		}
	}
}