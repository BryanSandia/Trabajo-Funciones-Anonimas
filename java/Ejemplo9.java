// Ordena los productos del más caro al más barato.
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ejemplo9 {
    public static void main(String[] args) {
        String resultado = Datos.PRODUCTOS.stream()
                .sorted(Comparator.comparingDouble(Producto::precio).reversed())
                .map(p -> p.nombre() + "(" + p.precio() + ")")
                .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}
