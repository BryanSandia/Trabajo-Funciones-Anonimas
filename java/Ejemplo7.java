// Suma el valor de todos los productos en inventario.
public class Ejemplo7 {
    public static void main(String[] args) {
        double valorTotal = Datos.PRODUCTOS.stream()
                .map(p -> p.precio() * p.stock())
                .reduce(0.0, (total, valor) -> total + valor);

        System.out.println("Valor del inventario: $" + valorTotal);
    }
}
