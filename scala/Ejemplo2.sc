// Aplica un descuento a cada producto Tech.
val productosTech = productos.filter(p => p.categoria == "Tech")
val aplicarDescuento: Producto => (String, Double) =
p => (p.nombre, p.precio * 0.9)
val resultado = productosTech.map(aplicarDescuento)

println(resultado)
