/*
 * Asignatura: Patrones de Diseño de Software 
 * Patrón Estructural - > Bridge
 * Tipo de Clase: Interface
 * Interface que define la estructura que deberán tener las clases puente.
 * Mediante esta interface el cliente se comunicará con los algoritmos de encriptamiento concretos..
 */
package implementacion;
import encriptacion.InterfaceEncriptar;
/**
 *
 * @author Fabrizio Bolaño
 */
public interface InterfaceMensajeEncriptacion {
    public String EncryptarMensaje(String message, String password)throws Exception;
}