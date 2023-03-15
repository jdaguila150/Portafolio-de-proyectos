import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Clase hecha por Josue Daniel Aguila Ortega

public class Cifrados_Descifrados {
	public SecretKeySpec CrearCalve(String Clave_secreta) {
		try {
			byte[] cadena = Clave_secreta.getBytes("UTF-8");
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
	public String Encriptar(String encriptar, String Clave_secreta) {
		try {
			SecretKeySpec secretKeySpec = CrearCalve(Clave_secreta);
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
	public String Desencriptar(String desencriptar, String Clave_secreta) {
		try {

			SecretKeySpec secretKeySpec = CrearCalve(Clave_secreta);
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