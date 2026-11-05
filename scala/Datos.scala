case class Producto(nombre: String, categoria: String, precio: Double, stock: Int)

val productos = List(
  Producto("Laptop", "Tech", 1200.0, 15),
  Producto("Mouse", "Tech", 25.0, 50),
  Producto("Teclado", "Tech", 45.0, 30),
  Producto("Monitor", "Tech", 300.0, 20),
  Producto("Silla", "Oficina", 250.0, 8),
  Producto("Escritorio", "Oficina", 400.0, 5),
  Producto("Lámpara", "Oficina", 35.0, 40),
  Producto("Libreta", "Papelería", 5.0, 100),
  Producto("Bolígrafo", "Papelería", 2.0, 200),
  Producto("Café", "Alimentos", 8.0, 60),
  Producto("Galletas", "Alimentos", 3.5, 80),
  Producto("Agua", "Alimentos", 1.5, 150)
)
