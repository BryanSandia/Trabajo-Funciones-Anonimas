// Busca los productos con mayor y menor precio y con más stock.
val masCaro = productos.maxBy(p => p.precio)
val masBarato = productos.minBy(p => p.precio)
val masStock = productos.maxBy(p => p.stock)

println("Más caro: " + masCaro.nombre)
println("Más barato: " + masBarato.nombre)
println("Mayor stock: " + masStock.nombre)
