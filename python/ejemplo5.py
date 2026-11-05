# Busca los productos con mayor y menor precio y con más stock.
from datos import productos

mas_caro = max(productos, key=lambda p: p.precio)
mas_barato = min(productos, key=lambda p: p.precio)
mas_stock = max(productos, key=lambda p: p.stock)

print("Más caro:", mas_caro.nombre)
print("Más barato:", mas_barato.nombre)
print("Mayor stock:", mas_stock.nombre)
