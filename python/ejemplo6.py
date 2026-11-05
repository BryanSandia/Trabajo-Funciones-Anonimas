# Combina en una lista los productos Tech y Alimentos.
from datos import productos

categorias = ["Tech", "Alimentos"]
resultado = [
    p
    for categoria in categorias
    for p in productos
    if p.categoria == categoria
]

print([p.nombre for p in resultado])
