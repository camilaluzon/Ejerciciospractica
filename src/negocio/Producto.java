package negocio;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria ;

    public void setNombre (String nombre){
        if (nombre != null && !nombre.isBlank()){
            this.nombre = nombre;
        }
    }
    public void setPrecio (double precio){
        if (precio < 0)
            this.precio = 0;
        else
            this.precio = precio;
    }
    public void setCategoria (String categoria){
        if (categoria != null && !categoria.isBlank()){
            this.categoria = categoria;
        }
    }

    public double getPrecio(){
        return precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getNombre(){
        return nombre;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
    }

    void mostrarCategoria(){
        System.out.println("Categoría: "+ getCategoria());
    }
}
