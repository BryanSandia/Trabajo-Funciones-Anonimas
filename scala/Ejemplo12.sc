// Filtra, agrupa, cuenta y ordena los productos caros.
val resultado = productos
  .filter(p => p.precio > 100)
  .groupBy(p => p.categoria)
  .map((categoria, grupo) => (categoria, grupo.size))
  .toList
  .sortBy((categoria, cantidad) => (-cantidad, categoria))

println(resultado)
