# Ordena los productos del más caro al más barato.
from datos import productos

resultado = sorted(productos, key=lambda p: p.precio, reverse=True)
print([(p.nombre, p.precio) for p in resultado])
