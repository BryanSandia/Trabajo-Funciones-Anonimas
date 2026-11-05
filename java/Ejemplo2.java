// Aplica un descuento a cada producto Tech.
import java.util.List;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<String> resultado = Datos.PRODUCTOS.stream()
                .filter(p -> p.categoria().equals("Tech"))
                .map(p -> p.nombre() + ": " + p.precio() * 0.9)
                .toList();

        System.out.println(resultado);
    }
}
