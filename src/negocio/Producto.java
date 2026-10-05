package negocio;

public class Producto {
    public String nombre;
    public double precio;
    String categoria ;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    void mostrarCategoria(){
        System.out.println("Categoría: "+ categoria);
    }
}
