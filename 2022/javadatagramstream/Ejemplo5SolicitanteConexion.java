/**
 * Este ejemplo ilustra básica del socket
 * en modo stream
 */

public class Ejemplo5SolicitanteConexion {
    // Una aplicacion que manda un mensaje usando un socket en modo stream
    // se esperan dos argumentos de linea de mandato, en orden
    // <nombre de la maquina del aceptador de la conexion>
    // <numero del puerto del acepatdor de la conexion>

    public static void main(String[] args) {
        if (args.length != 2)
            System.out.println("Este programa requiere dos argumentos de linea de comando");
        else {
            try {
                String maquinaAceptadora = args[0];
                int puertoAceptador = Integer.parseInt(args[1]);
                // instancia un socket de datos
                Misocketstream miSocket = new Misocketstream(maquinaAceptadora, puertoAceptador);
                System.out.println("Solicitud de conexion concedida ");
                String mensaje = miSocket.recibeMensaje();
                System.out.println("Mensaje recibido:");
                System.out.println("\t" + mensaje);
                miSocket.close();
                System.out.println("socket de datos cerrado");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}