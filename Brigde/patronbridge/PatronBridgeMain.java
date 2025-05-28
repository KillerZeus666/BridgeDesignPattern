package patronbridge;

import implementacion.InterfaceMensajeEncriptacion;
import implementacion.PuenteMensajeEncriptacion;
import factory.FactoryEncriptador;  // Importamos la clase Factory que creamos

/**
 *
 * @author Fabrizio Bolaño
 */
public class PatronBridgeMain {

    public static void main(String[] args) {
        try {
            // Se obtiene la implementación de InterfaceEncriptar usando el Factory
            InterfaceMensajeEncriptacion puente = new PuenteMensajeEncriptacion(FactoryEncriptador.getEncriptador());

            final String message = "<Curso><Nombre>Patrones de Diseño de Software</Nombre></Curso>";
            String encryptedMessage = puente.EncryptarMensaje(message, "1234567890123456");

            System.out.println("Mensaje Encriptado > " + encryptedMessage + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
