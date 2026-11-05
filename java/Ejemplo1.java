// Selecciona productos con stock menor que 10.
import java.util.List;

public class Ejemplo1 {
    public static void main(String[] args) {
        List<String> resultado = Datos.PRODUCTOS.stream()
                .filter(p -> p.stock() < 10)
                .map(Producto::nombre)
                .toList();

        System.out.println(resultado);
    }
}
