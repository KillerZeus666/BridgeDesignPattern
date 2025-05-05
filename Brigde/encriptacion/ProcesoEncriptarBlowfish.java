package encriptacion;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class ProcesoEncriptarBlowfish implements InterfaceEncriptar {

    @Override
    public String encryptar(String message, String password) throws Exception {
        // Blowfish usa claves de entre 4 y 56 bytes. Aquí solo se toman los primeros 16.
        byte[] keyBytes = password.getBytes("UTF-8");
        Key key = new SecretKeySpec(keyBytes, 0, Math.min(keyBytes.length, 16), "Blowfish");
        
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        
        byte[] encrypted = cipher.doFinal(message.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encrypted);
    }
}
