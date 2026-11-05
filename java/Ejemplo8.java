// Agrupa los nombres de productos por categoría.
import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo8 {
    public static void main(String[] args) {
        Map<String, List<String>> grupos = Datos.PRODUCTOS.stream()
                .collect(Collectors.groupingBy(
                        Producto::categoria,
                        TreeMap::new,
                        Collectors.mapping(Producto::nombre, Collectors.toList())));

        System.out.println(grupos);
    }
}
