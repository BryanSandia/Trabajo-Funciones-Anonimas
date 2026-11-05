# Selecciona productos con stock menor que 10.
from datos import productos

resultado = list(filter(lambda p: p.stock < 10, productos))
print([p.nombre for p in resultado])
