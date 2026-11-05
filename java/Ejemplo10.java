// Encuentra el primer producto que necesita reposición.
import java.util.Optional;

public class Ejemplo10 {
    public static void main(String[] args) {
        Optional<Producto> resultado = Datos.PRODUCTOS.stream()
                .filter(p -> p.stock() < 10)
                .findFirst();

        System.out.println(resultado);
    }
}
