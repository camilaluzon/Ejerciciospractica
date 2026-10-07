package tarea;

public class MainTarea {
    static void main() {
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();


        tarea1.setTitulo("Diseñar interfaz");
        tarea1.setResponsable("Camila");
        tarea1.setHorasEstimadas(5);
        tarea1.setCompletada(false);

        tarea2.setTitulo("Crear base de datos");
        tarea2.setResponsable("Juan");
        tarea2.setHorasEstimadas(8);
        tarea2.setCompletada(false);

        tarea3.setTitulo("Realizar pruebas");
        tarea3.setResponsable("Maria");
        tarea3.setHorasEstimadas(4);
        tarea3.setCompletada(false);

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
