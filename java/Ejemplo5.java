// Busca los productos con mayor y menor precio y con más stock.
import java.util.Comparator;

public class Ejemplo5 {
    public static void main(String[] args) {
        Producto masCaro = Datos.PRODUCTOS.stream()
                .max(Comparator.comparingDouble(Producto::precio))
                .orElseThrow();
        Producto masBarato = Datos.PRODUCTOS.stream()
                .min(Comparator.comparingDouble(Producto::precio))
                .orElseThrow();
        Producto masStock = Datos.PRODUCTOS.stream()
                .max(Comparator.comparingInt(Producto::stock))
                .orElseThrow();

        System.out.println("Más caro: " + masCaro.nombre());
        System.out.println("Más barato: " + masBarato.nombre());
        System.out.println("Mayor stock: " + masStock.nombre());
    }
}
