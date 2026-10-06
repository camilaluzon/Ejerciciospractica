package negocio;

public class MainProducto {
    static void main() {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.setNombre("Celular");
        producto1.setPrecio(320);
        producto1.setCategoria("Movil");
        producto2.setNombre("Computador");
        producto2.setPrecio(320);
        producto2.setCategoria("Laptop");

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

    }
}
