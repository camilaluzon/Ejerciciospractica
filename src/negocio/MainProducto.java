package negocio;

public class MainProducto {
    static void main() {

        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.nombre= "Celular";
        producto1.precio= 320;
        producto1.categoria= "Movil";
        producto2.nombre= "Computador";
        producto2.precio= 700;
        producto2.categoria= "Laptop";

        producto1.mostrarInformacion();
        producto1.mostrarCategoria();

        producto2.mostrarInformacion();
        producto2.mostrarCategoria();

    }
}
