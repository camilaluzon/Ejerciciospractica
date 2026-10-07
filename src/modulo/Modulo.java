package modulo;

public class Modulo {
    private String nombre;
    private String lenguaje;
    private String version;
    private boolean terminado;

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }
    }
    public void setLenguaje(String lenguaje) {
        if (lenguaje != null && !lenguaje.isBlank()) {
            this.lenguaje = lenguaje;
        }
    }
    public void setVersion(String version) {
        if (version != null && !version.isBlank()) {
            this.version = version;
        }
    }
    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    public String getNombre() {
        return nombre;
    }
    public String getLenguaje() {
        return lenguaje;
    }
    public String getVersion() {
        return version;
    }
    public boolean isTerminado() {
        return terminado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Lenguaje: " + getLenguaje());
    }

    public void marcarTerminado() {
        terminado = true;
        System.out.println("Terminado: " + terminado);
    }

    void mostrarEstado() {
        System.out.println("Terminado: " + isTerminado());
    }

    void mostrarVersion() {
        System.out.println("Version: " + getVersion());
    }
}
