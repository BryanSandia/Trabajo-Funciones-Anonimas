// Cuenta por categoría los productos que cuestan más de $100.
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ejemplo12 {
    public static void main(String[] args) {
        Map<String, Long> conteo = Datos.PRODUCTOS.stream()
                .filter(p -> p.precio() > 100)
                .collect(Collectors.groupingBy(
                        Producto::categoria,
                        TreeMap::new,
                        Collectors.counting()));
        List<String> resultado = conteo.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .map(e -> e.getKey() + ":" + e.getValue())
                .toList();

        System.out.println(resultado);
    }
}
