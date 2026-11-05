import java.util.List;

public class Datos {
    public static final List<Producto> PRODUCTOS = List.of(
        new Producto("Laptop", "Tech", 1200.0, 15),
        new Producto("Mouse", "Tech", 25.0, 50),
        new Producto("Teclado", "Tech", 45.0, 30),
        new Producto("Monitor", "Tech", 300.0, 20),
        new Producto("Silla", "Oficina", 250.0, 8),
        new Producto("Escritorio", "Oficina", 400.0, 5),
        new Producto("Lámpara", "Oficina", 35.0, 40),
        new Producto("Libreta", "Papelería", 5.0, 100),
        new Producto("Bolígrafo", "Papelería", 2.0, 200),
        new Producto("Café", "Alimentos", 8.0, 60),
        new Producto("Galletas", "Alimentos", 3.5, 80),
        new Producto("Agua", "Alimentos", 1.5, 150)
    );
}
