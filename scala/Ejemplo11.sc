// Empareja productos y descuentos por posición.
val descuentos = List(10.0, 5.0, 8.0, 12.0, 15.0, 20.0)
val resultado = productos.zip(descuentos)

println(resultado.map((p, descuento) => (p.nombre, descuento)))
