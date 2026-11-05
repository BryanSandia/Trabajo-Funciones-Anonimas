# Agrupa los nombres de productos por categoría.
from itertools import groupby
from datos import productos

ordenados = sorted(productos, key=lambda p: p.categoria)
grupos = {
    categoria: [p.nombre for p in grupo]
    for categoria, grupo in groupby(ordenados, key=lambda p: p.categoria)
}

print(grupos)
