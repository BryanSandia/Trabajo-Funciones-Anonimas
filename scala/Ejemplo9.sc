// Ordena los productos del más caro al más barato.
val resultado = productos.sortBy(p => -p.precio)
println(resultado.map(p => (p.nombre, p.precio)))
