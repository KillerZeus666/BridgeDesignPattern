/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Bridge
 * Tipo de Clase: Java
 * Clase que hereda de InterfaceEncriptar y encripta el mensaje mediante el algoritmo DES.
 */
package encriptacion;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ProcesoEncriptarDES implements InterfaceEncriptar {
    @Override
    public String encryptar(String message, String password) throws Exception {
        DESKeySpec dks = new DESKeySpec(message.getBytes());
        SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = skf.generateSecret(dks);
        Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        desCipher.init(Cipher.ENCRYPT_MODE, desKey);
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString= encoder.encodeToString(desCipher.doFinal(message.getBytes()));
        return encodedString;
    }
    
}