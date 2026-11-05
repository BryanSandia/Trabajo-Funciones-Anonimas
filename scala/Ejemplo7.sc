// Suma el valor de todos los productos en inventario.
val sumarValor: (Double, Producto) => Double =
  (total, p) => total + p.precio * p.stock

def calcularTotal(
  productos: List[Producto],
  sumar: (Double, Producto) => Double
): Double = productos.foldLeft(0.0)(sumar)

val resultado = calcularTotal(productos, sumarValor)
println("Valor del inventario: $" + resultado)
