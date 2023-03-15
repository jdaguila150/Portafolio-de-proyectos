/**
     * Inicializar la clave HMAC
     * 
     * @return
     * @throws Exception
     */
    public static String initMacKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_MAC);
 
        SecretKey secretKey = keyGenerator.generateKey();
        return encryptBASE64(secretKey.getEncoded());
    }
 
    /**
     * Cifrado HMAC
     * 
     * @param data
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] encryptHMAC(byte[] data, String key) throws Exception {
 
        SecretKey secretKey = new SecretKeySpec(decryptBASE64(key), KEY_MAC);
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
 
        return mac.doFinal(data);
 
    }