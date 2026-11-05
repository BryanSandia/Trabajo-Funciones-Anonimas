# Parte 4 – Operaciones nuevas sobre colecciones

Se eligieron cuatro operaciones que no se trabajaron en clase: `groupBy`, `sortBy`, `find` y `zip`. Cada número corresponde al mismo ejercicio en Scala, Java y Python. El ejercicio 12 combina varias operaciones.

Los datos están en archivos compartidos: [`../scala/Datos.scala`](../scala/Datos.scala), [`../java/Datos.java`](../java/Datos.java) con [`../java/Producto.java`](../java/Producto.java), y [`../python/datos.py`](../python/datos.py) con [`../python/producto.py`](../python/producto.py).

## 4.1–4.2 Fichas

### Ejercicio 8: `groupBy` — agrupar por categoría

Agrupa productos según la categoría. La lambda recibe un producto y devuelve una cadena, la clave del grupo.

```scala
val resultado = productos.groupBy(p => p.categoria)
println(resultado)
```

Salida:

```text
Alimentos -> Café, Galletas, Agua
Oficina -> Silla, Escritorio, Lámpara
Papelería -> Libreta, Bolígrafo
Tech -> Laptop, Mouse, Teclado, Monitor
```

**Problema:** revisar el inventario por categoría. Se relaciona con la clasificación y conteo de la Parte 3.

- Scala: [`Ejemplo8.sc`](../scala/Ejemplo8.sc)
- Java: [`Ejemplo8.java`](../java/Ejemplo8.java)
- Python: [`ejemplo8.py`](../python/ejemplo8.py)

### Ejercicio 9: `sortBy` — ordenar por precio

Ordena todos los productos por precio descendente. La lambda recibe un producto y devuelve su precio; se usa el signo negativo para invertir el orden en Scala.

```scala
val resultado = productos.sortBy(p => -p.precio)
println(resultado.map(p => (p.nombre, p.precio)))
```

Salida: Laptop, Escritorio, Monitor, Silla, Teclado, Lámpara, Mouse, Café, Libreta, Galletas, Bolígrafo y Agua.

**Problema:** priorizar el inventario por precio. Se relaciona con extremos, pero ordena toda la lista.

- Scala: [`Ejemplo9.sc`](../scala/Ejemplo9.sc)
- Java: [`Ejemplo9.java`](../java/Ejemplo9.java)
- Python: [`ejemplo9.py`](../python/ejemplo9.py)

### Ejercicio 10: `find` — buscar el primer resultado

Devuelve el primer producto que cumple la condición. La lambda recibe un producto y devuelve `Boolean`.

```scala
val resultado = productos.find(p => p.stock < 10)
println(resultado)
```

Salida: `Some(Producto(Silla,Oficina,250.0,8))`.

**Problema:** encontrar el primer producto para reponer. Se relaciona con selección, pero devuelve solo el primer resultado.

- Scala: [`Ejemplo10.sc`](../scala/Ejemplo10.sc)
- Java: [`Ejemplo10.java`](../java/Ejemplo10.java)
- Python: [`ejemplo10.py`](../python/ejemplo10.py)

### Ejercicio 11: `zip` — combinar listas por posición

Combina cada producto con el descuento ubicado en la misma posición. `zip` no recibe una lambda.

```scala
val descuentos = List(10.0, 5.0, 8.0, 12.0, 15.0, 20.0)
val resultado = productos.zip(descuentos)
val primeros = resultado.take(3).map((producto, descuento) =>
  (producto.nombre, descuento)
)
println(primeros)
```

Salida de `primeros`: `List((Laptop,10.0), (Mouse,5.0), (Teclado,8.0))`. `zip` termina al agotarse la lista más corta; `map` transforma después cada par.

**Problema:** combinar dos listas relacionadas, como productos y descuentos.

- Scala: [`Ejemplo11.sc`](../scala/Ejemplo11.sc)
- Java: [`Ejemplo11.java`](../java/Ejemplo11.java)
- Python: [`ejemplo11.py`](../python/ejemplo11.py)

## 4.3 Combinar operaciones

**Pregunta:** ¿cuántos productos con precio mayor a $100 hay en cada categoría, ordenados por cantidad?

La cadena filtra productos, agrupa por categoría, cuenta y ordena:

```scala
val productosCaros = productos.filter(p => p.precio > 100)
val grupos = productosCaros.groupBy(p => p.categoria)
val cantidades = grupos.map((categoria, grupo) => (categoria, grupo.size))
val resultado = cantidades.toList.sortBy((categoria, cantidad) => (-cantidad, categoria))
```

Salida: `List((Oficina,2), (Tech,2))`.

- Scala: [`Ejemplo12.sc`](../scala/Ejemplo12.sc)
- Java: [`Ejemplo12.java`](../java/Ejemplo12.java)
- Python: [`ejemplo12.py`](../python/ejemplo12.py)

## Referencias

- [Scala – Collections](https://docs.scala-lang.org/overviews/collections-2.13/introduction.html)
- [Java – Stream](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/stream/Stream.html)
- [Python – `itertools.groupby`](https://docs.python.org/3/library/itertools.html#itertools.groupby)
