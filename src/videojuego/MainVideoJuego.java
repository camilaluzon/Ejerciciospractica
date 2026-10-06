package videojuego;

public class MainVideoJuego {
    static void main() {
        VideoJuego juego1 = new VideoJuego();
        VideoJuego juego2 = new VideoJuego();
        VideoJuego juego3 = new VideoJuego();

        juego1.setActivo(true);
        juego1.setGenero("Terror");
        juego1.setNombre("Resident Evil");
        juego1.setVersion("5");

        juego2.setActivo(true);
        juego2.setGenero("Open world");
        juego2.setNombre("The Last of Us");
        juego2.setVersion("1");

        juego3.setActivo(true);
        juego3.setGenero("Battel Royal");
        juego3.setNombre("Fornite");
        juego3.setVersion("1.21");

        juego1.Iniciar();
        juego1.mostrarInformacion();
        juego1.mostrarVersion();
        juego1.Cerrar();

        juego2.Iniciar();
        juego2.mostrarInformacion();
        juego2.mostrarVersion();
        juego2.Cerrar();

        juego3.Iniciar();
        juego3.mostrarInformacion();
        juego3.mostrarVersion();
        juego3.Cerrar();

    }
}
