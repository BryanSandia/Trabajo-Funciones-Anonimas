// Cuenta los productos de cada categoría y los productos Tech.
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ejemplo4 {
    public static void main(String[] args) {
        Map<String, Long> conteo = Datos.PRODUCTOS.stream()
                .collect(Collectors.groupingBy(
                        Producto::categoria,
                        TreeMap::new,
                        Collectors.counting()));
        long cantidadTech = Datos.PRODUCTOS.stream()
                .filter(p -> p.categoria().equals("Tech"))
                .count();

        System.out.println("Productos Tech: " + cantidadTech);
        System.out.println("Productos por categoría: " + conteo);
    }
}
