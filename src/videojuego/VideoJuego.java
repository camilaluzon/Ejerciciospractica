package videojuego;

public class VideoJuego {
    private String nombre;
    private String genero;
    private String version;
    private boolean activo;

    public void setNombre (String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }
    public void setGenero (String genero){
        if (genero != null && !genero.isBlank()){
            this.genero = genero;
        }
    }
    public void setVersion (String version){
        if (version != null && !version.isBlank()){
            this.version = version;
        }
    }
    public void setActivo (boolean activo){
        this.activo = activo;
    }

    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public String getVersion(){
        return version;
    }
    public boolean isActivo(){
        return activo;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Genero: "+ getGenero());
    }
    public void Iniciar(){
        if (activo == false){
            activo = true;
            System.out.println(getNombre()+ " iniciando... ");
        }
        System.out.println(getNombre()+ " iniciando... ");
    }
    void Cerrar(){
        if (activo == true){
            activo = false;
            System.out.println(getNombre()+ " cerrado ");
        }
    }
    void mostrarVersion(){
        System.out.println("Version: "+ getVersion());
    }
}
