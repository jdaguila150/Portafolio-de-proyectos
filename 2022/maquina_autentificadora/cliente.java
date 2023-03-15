import java.io.*;
import java.net.*;
import java.util.Scanner; 

public class cliente {
    Scanner Leer = new Scanner (System.in);

	Socket cliente; //
    String decision = "";
	int puerto; //
	String ip = "127.0.0.1";
	PrintStream salida; //
	BufferedReader entrada, teclado; //

	int contador = 2;

	public static void main(String[] args) {
		cliente c = new cliente();
		c.inicio();

	}

	public void inicio() {
		while (true) {
			try {
 


				teclado = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Con quien desea comunicarse? \n maquina \n servidor");
                decision = Leer.nextLine();
                
                if(decision == "maquina"){
                    puerto = 6000;
                }
                else{
                puerto = 6500;}

                

				System.out.println("\nMensaje: ");
				String mensaje = teclado.readLine();

				if (mensaje.equals("ip")) {
					System.out.println("\nNueva Ip: ");
					ip = teclado.readLine();
				} else {
					if (mensaje.equals("t")) {
						cliente = new Socket(ip, puerto);
						salida = new PrintStream(cliente.getOutputStream());
						salida.println("t");
						cliente.close();
						break;
					} else {
						cliente = new Socket(ip, puerto);

						salida = new PrintStream(cliente.getOutputStream());
						salida.println(mensaje);

						entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
						System.out.println("\nRespuesta: ");
						String respuesta = entrada.readLine();
						System.out.println(respuesta);

						if (respuesta.equals("t")) {
							cliente.close();
							break;
						}
					}
				}
				cliente.close();
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