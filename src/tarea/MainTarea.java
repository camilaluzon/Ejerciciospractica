package tarea;

public class MainTarea {
    static void main() {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();


        tarea1.titulo = "Diseñar interfaz";
        tarea1.responsable = "Camila";
        tarea1.horasEstimadas = 5;
        tarea1.completada = false;

        tarea2.titulo = "Crear base de datos";
        tarea2.responsable = "Juan";
        tarea2.horasEstimadas = 8;
        tarea2.completada = false;

        tarea3.titulo = "Realizar pruebas";
        tarea3.responsable = "Maria";
        tarea3.horasEstimadas = 4;
        tarea3.completada = false;


        tarea1.mostrarInformacion();
        tarea1.mostrarResponsable();
        tarea1.mostrarEstado();

        tarea2.mostrarInformacion();
        tarea2.mostrarResponsable();
        tarea2.mostrarEstado();

        tarea3.mostrarInformacion();
        tarea3.mostrarResponsable();
        tarea3.mostrarEstado();

        tarea1.completar();

        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
    }
}
