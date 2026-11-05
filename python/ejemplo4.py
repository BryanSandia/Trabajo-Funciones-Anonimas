# Cuenta los productos de cada categoría y los productos Tech.
from datos import productos

categorias = sorted(set(map(lambda p: p.categoria, productos)))
conteo = {
    categoria: sum(1 for p in productos if p.categoria == categoria)
    for categoria in categorias
}

print("Productos Tech:", sum(1 for p in productos if p.categoria == "Tech"))
print("Productos por categoría:", conteo)
