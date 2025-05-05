/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Bridge
 * Tipo de Clase: Java
 * Clase que hereda de InterfaceEncriptar y regresa el mensaje sin ningún proceso de encriptación.
 */
package encriptacion;

/**
 *
 * @author Fabrizio Bolaño
 */
public class ProcesoSinEncriptar implements InterfaceEncriptar {

    @Override
    public String encryptar(String message, String password) throws Exception {
        return message;
    }
    
}