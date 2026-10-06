package videojuego;

public class VideoJuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Genero: "+genero);
    }
    public void Iniciar(){
        if (activo == false){
            activo = true;
            System.out.println(nombre+ " iniciando... ");
        }
        System.out.println(nombre+ " iniciando... ");
    }
    void Cerrar(){
        if (activo == true){
            activo = false;
            System.out.println(nombre+ " cerrado ");
        }
    }
    void mostrarVersion(){
        System.out.println("Version: "+version);
    }
}
