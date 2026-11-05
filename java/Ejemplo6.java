// Combina en una lista los productos Tech y Alimentos.
import java.util.List;

public class Ejemplo6 {
    public static void main(String[] args) {
        List<String> categorias = List.of("Tech", "Alimentos");
        List<String> resultado = categorias.stream()
                .flatMap(categoria -> Datos.PRODUCTOS.stream()
                        .filter(p -> p.categoria().equals(categoria)))
                .map(Producto::nombre)
                .toList();

        System.out.println(resultado);
    }
}
