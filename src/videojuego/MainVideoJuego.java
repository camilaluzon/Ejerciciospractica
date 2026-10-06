package videojuego;

public class MainVideoJuego {
    static void main() {
        VideoJuego juego1 = new VideoJuego();
        VideoJuego juego2 = new VideoJuego();
        VideoJuego juego3 = new VideoJuego();

        juego1.activo = true;
        juego1.genero = "Terror";
        juego1.nombre = "Resident Evil";
        juego1.version = "5";

        juego2.activo = true;
        juego2.genero = "Open world";
        juego2.nombre = "The Last of Us";
        juego2.version = "1";

        juego3.activo = true;
        juego3.genero = "Batter Royal";
        juego3.nombre = "Fornite";
        juego3.version = "1.21";

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
