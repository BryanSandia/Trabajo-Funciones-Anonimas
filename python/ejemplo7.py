# Suma el valor de todos los productos en inventario.
from functools import reduce
from datos import productos

valor_total = reduce(
    lambda total, p: total + p.precio * p.stock,
    productos,
    0.0,
)

print(f"Valor del inventario: ${valor_total:.2f}")
