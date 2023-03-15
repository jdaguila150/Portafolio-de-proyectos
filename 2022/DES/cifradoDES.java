import java.security.Key;
import java.security.SecureRandom;
 
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
 
 
/**
 * Componente de codificación de seguridad DES
 * 
 * <pre>
 * Compatible con DES, DESede (TripleDES, que es 3DES), AES, Blowfish, RC2, RC4 (ARCFOUR)
 * DES                  key size must be equal to 56
 * DESede(TripleDES)     key size must be equal to 112 or 168
 * AES                  key size must be equal to 128, 192 or 256,but 192 and 256 bits may not be available
 * Blowfish          key size must be multiple of 8, and can only range from 32 to 448 (inclusive)
 * RC2                  key size must be between 40 and 1024 bits
 * RC4(ARCFOUR)      key size must be between 40 and 1024 bits
 * El contenido específico necesita atención Documento JDK http: //.../docs/technotes/guides/security/SunProviders.html
 * </pre>
 * 
 * @ Autor Liang Dong
 * @version 1.0
 * @since 1.0
 */

public abstract class cifradoDES extends Coder {
    /**
     * Algoritmo ALGORITMO <br>
     * Puede ser reemplazado por cualquiera de los siguientes algoritmos, y el tamaño del valor de la clave se cambiará en consecuencia.
     * 
     * <pre>
     * DES                  key size must be equal to 56
     * DESede(TripleDES)     key size must be equal to 112 or 168
     * AES                  key size must be equal to 128, 192 or 256,but 192 and 256 bits may not be available
     * Blowfish          key size must be multiple of 8, and can only range from 32 to 448 (inclusive)
     * RC2                  key size must be between 40 and 1024 bits
     * RC4(ARCFOUR)      key size must be between 40 and 1024 bits
     * </pre>
     * 
     * Utilice el siguiente código en el método Key toKey (tecla byte [])
     * <code> SecretKey secretKey = new SecretKeySpec (clave, ALGORITMO); </code> Reemplazar
     * <code>
     * DESKeySpec dks = new DESKeySpec(key);
     * SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
     * SecretKey secretKey = keyFactory.generateSecret(dks);
     * </code>
     */
    public static final String ALGORITHM = "DES";
 
    /**
     * Clave de conversión <br>
     * 
     * @param key
     * @return
     * @throws Exception
     */
    private static Key toKey(byte[] key) throws Exception {
        DESKeySpec dks = new DESKeySpec(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        SecretKey secretKey = keyFactory.generateSecret(dks);
 
        // Cuando utilice otros algoritmos de cifrado simétrico, como AES, Blowfish, etc., reemplace las tres líneas de código anteriores con el siguiente código
        // SecretKey secretKey = new SecretKeySpec(key, ALGORITHM);
 
        return secretKey;
    }
 
    /**
     * Descifrar
     * 
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, String key) throws Exception {
        Key k = toKey(decryptBASE64(key));
 
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, k);
 
        return cipher.doFinal(data);
    }
 
    /**
     * Cifrado
     * 
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, String key) throws Exception {
        Key k = toKey(decryptBASE64(key));
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, k);
 
        return cipher.doFinal(data);
    }
 
    /**
     * Generar clave
     * 
     * @return
     * @throws Exception
     */
    public static String initKey() throws Exception {
        return initKey(null);
    }
 
    /**
     * Generar clave
     * 
     * @param seed
     * @return
     * @throws Exception
     */
    public static String initKey(String seed) throws Exception {
        SecureRandom secureRandom = null;
 
        if (seed != null) {
            secureRandom = new SecureRandom(decryptBASE64(seed));
        } else {
            secureRandom = new SecureRandom();
        }
 
        KeyGenerator kg = KeyGenerator.getInstance(ALGORITHM);
        kg.init(secureRandom);
 
        SecretKey secretKey = kg.generateKey();
 
        return encryptBASE64(secretKey.getEncoded());
    }
}