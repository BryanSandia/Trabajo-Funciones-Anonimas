# Comprueba si hay un producto caro y si todos tienen stock.
from datos import productos

hay_producto_caro = any(map(lambda p: p.precio > 1000, productos))
todos_tienen_stock = all(map(lambda p: p.stock > 0, productos))

print("¿Hay un producto de más de $1000?", hay_producto_caro)
print("¿Todos tienen stock?", todos_tienen_stock)
