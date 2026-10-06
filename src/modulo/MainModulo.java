package modulo;

public class MainModulo {
    static void main() {
        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();


        modulo1.nombre = "Login";
        modulo1.lenguaje = "Java";
        modulo1.version = "1.0";
        modulo1.terminado = false;

        modulo2.nombre = "Inventario";
        modulo2.lenguaje = "Java";
        modulo2.version = "2.0";
        modulo2.terminado = false;

        modulo3.nombre = "Reportes";
        modulo3.lenguaje = "Java";
        modulo3.version = "1.5";
        modulo3.terminado = false;


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
