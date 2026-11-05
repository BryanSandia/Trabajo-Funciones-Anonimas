// Combina en una lista los productos Tech y Alimentos.
val categorias = List("Tech", "Alimentos")
val resultado = categorias.flatMap(
  categoria => productos.filter(p => p.categoria == categoria)
)

println(resultado.map(_.nombre))
