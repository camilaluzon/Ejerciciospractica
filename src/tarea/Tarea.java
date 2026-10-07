package tarea;

public class Tarea {
    private String titulo;
    private String responsable;
    private double horasEstimadas;
    private boolean completada;

    public void setTitulo(String titulo){
        if (titulo!= null && !titulo.isBlank()){
            this.titulo = titulo;
        }
    }
    public void setResponsable (String responsable){
        if (responsable!= null && !responsable.isBlank()){
            this.responsable = responsable;
        }
    }
    public void setHorasEstimadas (double horasEstimadas){
        if (horasEstimadas < 0)
            this.horasEstimadas = 0;
        else
            this.horasEstimadas = horasEstimadas;
    }
    public void setCompletada (boolean completada){
        this.completada = completada;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getResponsable(){
        return responsable;
    }
    public double getHorasEstimadas(){
        return horasEstimadas;
    }
    public boolean isCompletada(){
        return completada;
    }

    public void mostrarInformacion(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Horas estimadas: "+ getHorasEstimadas());
    }
    public void completar(){
        completada = true;
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Completada: " + isCompletada());
    }
    void mostrarResponsable(){
        System.out.println("Responsable: " + getResponsable());
    }
    void mostrarEstado(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Completada: " + isCompletada());
    }
}
