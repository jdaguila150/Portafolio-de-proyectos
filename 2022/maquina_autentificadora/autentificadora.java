import java.io.*;
import java.net.*;
import java.util.Scanner;

public class autentificadora {

	Scanner leer = new Scanner(System.in);
	ServerSocket server;
	Socket socket;
	int puerto = 6000; // Puerto para ejecutar el programa
	BufferedReader entrada; // Se guerda informacion del exterior
	PrintStream salida;

	int contador = 2;

	public static void main(String[] args) {
		autentificadora s = new autentificadora();
		s.iniciar();
	}

	public void iniciar() {
		while (true) {
			try {
				server = new ServerSocket(puerto);
				socket = new Socket(); // punto final de enlaces de comunicaciones entre procesos.
				socket = server.accept();
				// Espera a que se mande una peticion en el puerto 9000
				// Se establece la coneccion sin necesidad de manipular nuevamente la ip o
				// puerto

				entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// Se guardan datos entrantes
				String mensaje = entrada.readLine();
				System.out.println("\nMensaje: ");
				System.out.println(mensaje);

				if (mensaje.equals("t")) {
					socket.close();
					server.close();
					break;
				}

				salida = new PrintStream(socket.getOutputStream());
				System.out.println("\nRespuesta: ");

				String Respuesta = leer.nextLine();
				if (Respuesta.equals("t")) {
					salida.println("t");
					socket.close();
					server.close();
					break;
				} else {
					salida.println(Respuesta);
				}

				socket.close();
				server.close();
				// Cierra la conección
			} catch (Exception e) {
				contador -= 1;
				if (contador == 0) {
					break;
				}
			}
		}
		System.out.println("----> FIN");
	}
}
