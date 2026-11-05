// Selecciona productos con stock menor que 10.
def seleccionar(
  productos: List[Producto],
  condicion: Producto => Boolean
): List[Producto] = productos.filter(condicion)

val resultado = seleccionar(productos, p => p.stock < 10)
println(resultado.map(_.nombre))
