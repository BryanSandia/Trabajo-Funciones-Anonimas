// Comprueba si hay un producto caro y si todos tienen stock.
public class Ejemplo3 {
    public static void main(String[] args) {
        boolean hayProductoCaro = Datos.PRODUCTOS.stream()
                .anyMatch(p -> p.precio() > 1000);
        boolean todosTienenStock = Datos.PRODUCTOS.stream()
                .allMatch(p -> p.stock() > 0);

        System.out.println("¿Hay un producto de más de $1000? " + hayProductoCaro);
        System.out.println("¿Todos tienen stock? " + todosTienenStock);
    }
}
