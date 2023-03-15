import java.net.*;
import java.io.*;

/**
 * Este ejemplo ilustra la sintaxis básica del socket
 * en modo stream.
 * Gauthor M. L. Liu
 */
public class Ejemplo5Aceptador {
    // Una aplicación que recibe un mensaje usando un socket en modo
    // stream.
    // Se esperan dos argumentos de linea de mandato, en orden:
    // <número de puerto del socket de servidor utilizado en este proceso>
    // cmensaje, una cadena, para mandar>

    public static void main(String[] args) {
        if (args.length != 2)
            System.out.println("Este programa requiere dos argumentos de linea de mandato");
        else {
            try {
                int numPuerto = Integer.parseInt(args[0]);
                String mensaje = args[1];
                // instancia un socket para aceptar la conexión
                ServerSocket socketConexion = new ServerSocket(numPuerto);
                /**/ System.out.println("preparado para aceptar una conexión");
                // espera una petición de conexión, instante en el cual
                // se crea u n socket de datos
                Misocketstream socketDatos = new Misocketstream(socketConexion.accept());
                /**/
                System.out.println("conexión aceptada");
                socketDatos.enviaMensaje(mensaje);

                /**/ System.out.println("mensaje enviado");
                socketDatos.close();
                /**/ System.out.println("socket de datos cerrado");
                socketConexion.close();
                /**/ System.out.println("socket de conexión cerrado");
            } // fin de try
            catch (Exception ex) {
                ex.printStackTrace();
            } // fin de catch
        }
    }
}