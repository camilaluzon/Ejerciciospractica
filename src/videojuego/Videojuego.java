package videojuego;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;


    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
    }
    public void Iniciar(){
        System.out.println("Activo: "+activo);
    }
    void Cerrar(){
        activo = false;
        System.out.println("Activo: "+activo);
    }
    void mostrarVersion(){
        System.out.println("Version: "+version);
    }
}
