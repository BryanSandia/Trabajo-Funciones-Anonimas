// Comprueba si hay un producto caro y si todos tienen stock.
def existe(
  productos: List[Producto],
  condicion: Producto => Boolean
): Boolean = productos.exists(condicion)

val hayProductoCaro = existe(productos, p => p.precio > 1000)
val todosTienenStock = productos.forall(p => p.stock > 0)

println("¿Hay un producto de más de $1000? " + hayProductoCaro)
println("¿Todos tienen stock? " + todosTienenStock)
