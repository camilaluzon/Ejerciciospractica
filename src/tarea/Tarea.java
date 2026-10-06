package tarea;

public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Horas estimadas: "+ horasEstimadas);
    }
    public void completar(){
        completada = true;
        System.out.println("Titulo: " + titulo);
        System.out.println("Completada: " + completada);
    }
    void mostrarResponsable(){
        System.out.println("Responsable: " + responsable);
    }
    void mostrarEstado(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Completada: " + completada);
    }
}
