package modulo;

public class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("Terminado: " + terminado);
    }

    void mostrarEstado() {
        System.out.println("Terminado: " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Version: " + version);
    }
}
