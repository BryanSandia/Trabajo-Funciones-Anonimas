// Agrupa los nombres de productos por categoría.
val resultado = productos.groupBy(p => p.categoria).map(
  (categoria, grupo) => (categoria, grupo.map(_.nombre))
)

println(resultado)
