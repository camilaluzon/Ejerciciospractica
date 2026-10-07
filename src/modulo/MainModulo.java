package modulo;

public class MainModulo {
    static void main() {
        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();


        modulo1.setNombre("Login");
        modulo1.setLenguaje("Java");
        modulo1.setVersion("1.0");
        modulo1.setTerminado(false);

        modulo2.setNombre("Inventario");
        modulo2.setLenguaje("Java");
        modulo2.setVersion("2.0");
        modulo2.setTerminado(false);

        modulo3.setNombre("Reportes");
        modulo3.setLenguaje("Java");
        modulo3.setVersion("1.5");
        modulo3.setTerminado(false);

        modulo1.mostrarInformacion();
        modulo1.mostrarEstado();
        modulo1.mostrarVersion();

        modulo2.mostrarInformacion();
        modulo2.mostrarEstado();
        modulo2.mostrarVersion();

        modulo3.mostrarInformacion();
        modulo3.mostrarEstado();
        modulo3.mostrarVersion();
    }
}
