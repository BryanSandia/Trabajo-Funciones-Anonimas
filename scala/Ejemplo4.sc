// Cuenta productos Tech y agrupa el conteo por categoría.
def contar(
  productos: List[Producto],
  condicion: Producto => Boolean
): Int = productos.count(condicion)

val cantidadTech = contar(productos, p => p.categoria == "Tech")
val cantidadPorCategoria = productos.groupBy(_.categoria).map(
  (categoria, grupo) => (categoria, grupo.size)
)

println("Productos Tech: " + cantidadTech)
println("Productos por categoría: " + cantidadPorCategoria)
