// Empareja productos y descuentos por posición.
import java.util.List;
import java.util.stream.IntStream;

public class Ejemplo11 {
    public static void main(String[] args) {
        List<Double> descuentos = List.of(10.0, 5.0, 8.0, 12.0, 15.0, 20.0);
        int cantidad = Math.min(Datos.PRODUCTOS.size(), descuentos.size());
        List<String> resultado = IntStream.range(0, cantidad)
                .mapToObj(i -> Datos.PRODUCTOS.get(i).nombre() + ":" + descuentos.get(i) + "%")
                .toList();

        System.out.println(resultado);
    }
}
