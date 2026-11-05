# Cuenta por categoría los productos que cuestan más de $100.
from datos import productos

productos_caros = filter(lambda p: p.precio > 100, productos)
conteo = {}
for p in productos_caros:
    conteo[p.categoria] = conteo.get(p.categoria, 0) + 1

resultado = sorted(conteo.items(), key=lambda par: (-par[1], par[0]))
print(resultado)
