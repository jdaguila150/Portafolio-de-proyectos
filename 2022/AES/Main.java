
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;


public class Main {

    String LLAVE;
    Scanner Leer = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String encriptada = "";
        String aEnccriptar = "";
        Main main = new Main();
        System.out.println("Ingresa la cadena a encriptar: ");
        aEnccriptar = Leer.nextLine();
        encriptada = main.Encriptar(aEnccriptar);
        System.out.println(encriptada);
        System.out.println(main.Desencriptar(encriptada));

    }

    // Clave de encriptación / desencriptación
    public SecretKeySpec CrearCalve(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    // Encriptar
    public String Encriptar(String encriptar) {
        System.out.println("que clave desea??");
        LLAVE = Leer.nextLine();
        try {
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = java.util.Base64.getEncoder().encodeToString(encriptada);
            return cadena_encriptada;

        } catch (Exception e) {
            return "";
        }
    }

    // Des-encriptación
    public String Desencriptar(String desencriptar) {

        try {

            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.getDecoder().decode(desencriptar);
            byte[] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;

        } catch (Exception e) {
            return "";
        }
    }

}
