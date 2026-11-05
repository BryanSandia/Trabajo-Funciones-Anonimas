# Aplica un descuento a cada producto Tech.
from datos import productos

productos_tech = filter(lambda p: p.categoria == "Tech", productos)
resultado = list(map(lambda p: (p.nombre, p.precio * 0.9), productos_tech))
print(resultado)
