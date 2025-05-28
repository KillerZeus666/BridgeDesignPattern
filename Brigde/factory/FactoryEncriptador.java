package factory;

import encriptacion.InterfaceEncriptar;

import java.io.FileInputStream;
import java.util.Properties;

public class FactoryEncriptador {
    public static InterfaceEncriptar getEncriptador() throws Exception {
        Properties prop = new Properties();
        prop.load(new FileInputStream("config.properties"));

        String clase = prop.getProperty("encriptador");

        Class<?> claseEncriptador = Class.forName("encriptacion." + clase);
        return (InterfaceEncriptar) claseEncriptador.getDeclaredConstructor().newInstance();
    }
}
